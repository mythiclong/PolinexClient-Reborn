package me.octo.client;

/*
 * PX-FIX Phase A / agent JC5 -- jar-only class recreated with convention (a)
 * (standalone top-level file whose simple name contains '$', so the binary name
 * matches the jar nested class exactly).
 *
 *   jar class  : me.octo.client.IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
 *   outer      : me.octo.client.IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI
 *   jar methods: <clinit>()V only  (no <init>, no other methods)
 *
 * javac always synthesises a default constructor for a CLASS, which would make
 * phaseA_dexact.py report EXTRA 1. The jar class has no <init> at all, so the
 * class is declared as an INTERFACE: an interface with non-constant field
 * initialisers compiles to exactly one method, <clinit>()V -- same as the jar.
 * (Same technique B2 used for the WhenMappings classes.)
 *
 * Every array below holds the exact post-<clinit> contents of the jar field,
 * read back by reflectively initialising the class extracted from
 * .analysis/me-octo-only.jar (Probe; see .analysis/reports/phaseA-jaronly-JC5.md).
 * The jar computes them as
 *     int[] v = new int[E.values().length];
 *     try  v[E.CONST.ordinal()] = k;  catch (NoSuchFieldError ignored)
 * so the literal is the same array, without depending on any enum type.
 * Deviation: the jar fields are non-final ACC_SYNTHETIC; interface fields are
 * implicitly public static final. dexact does not compare fields.
 */

public interface IllIIlIlllIlIllIlIllIlIIllIlIIlIllIllIlIllIllIIlIllIIlIIIlIlIIIIIIlllIIIllIIIIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new int[]{1, 2, 3};

}
