public final class ThresholdComparisonProbe {
    private static final double LIMIT = 0.5625D;

    private static int dcmpl(double left, double right) {
        if (Double.isNaN(left) || Double.isNaN(right)) return -1;
        return left < right ? -1 : left > right ? 1 : 0;
    }

    private static boolean original(double value) {
        return dcmpl(value, LIMIT) > 0;
    }

    private static boolean previousSource(double value) {
        double difference = value - LIMIT;
        int kotlinCompareToZero = difference == 0.0D ? 0 : difference < 0.0D ? -1 : 1;
        return kotlinCompareToZero > 0;
    }

    private static boolean correctedSource(double value) {
        return value > LIMIT;
    }

    public static void main(String[] args) {
        double[] values = {
            Double.NEGATIVE_INFINITY,
            Math.nextDown(LIMIT),
            LIMIT,
            Math.nextUp(LIMIT),
            Double.POSITIVE_INFINITY,
            Double.NaN
        };
        boolean sawOldMismatch = false;
        for (double value : values) {
            boolean expected = original(value);
            boolean old = previousSource(value);
            boolean fixed = correctedSource(value);
            System.out.printf("%s original=%s previous=%s corrected=%s%n",
                Double.isNaN(value) ? "NaN" : Double.toString(value), expected, old, fixed);
            if (expected != fixed) throw new AssertionError("corrected comparison differs from dcmpl");
            if (expected != old) sawOldMismatch = true;
        }
        if (!sawOldMismatch || !Double.isNaN(values[values.length - 1]) || !previousSource(Double.NaN))
            throw new AssertionError("expected pre-fix NaN-only mismatch was not observed");
    }
}
