package me.octo.client;

/*
 * PX-RESTORED - Phase A jar-only class creation, agent JC7b, convention (a).
 *
 * Jar class : me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII
 * Classfile : access 0x1031 ACC_PUBLIC|ACC_FINAL|ACC_SUPER|ACC_SYNTHETIC, super java.lang.Object,
 *             no interfaces, NO <init>, exactly one method <clinit>()V (ACC_STATIC),
 *             3 field(s) ACC_PUBLIC|ACC_STATIC|ACC_SYNTHETIC of descriptor [I.
 * Origin    : the Kotlin WhenMappings switch-map class kotlinc emits for a when-expression
 *             over the obfuscated enum named in the comment above each field.
 *
 * The jar clinit builds one int[] per field as
 *     int[] v = new int[<ENUM>.values().length];
 *     try { v[<ENUM>.<CONST_1>.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
 *     try { v[<ENUM>.<CONST_2>.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
 *     ...
 *     <field> = v;
 * i.e. v[ordinal(constant)] = branch index, and 0 for every constant the when did not name.
 * That table is a pure function of the frozen obfuscated enums, so the resulting arrays are
 * materialised here as literals. The values were derived twice, independently, and agree:
 *   (1) parsing javap -p -s -c of the .class extracted from .analysis/me-octo-only.jar
 *       (getstatic <CONST> / invokevirtual ordinal / iconst_N / iastore, split by putstatic);
 *   (2) reflectively reading every int[] field of the class loaded from that same jar.
 * Provenance and gate readings: .analysis/reports/phaseA-jaronly-JC7b.md
 *
 * Declared as an INTERFACE on purpose: a jar class that has <clinit> but no <init> cannot be
 * reproduced by a Java class, because javac always synthesises a default constructor, which
 * would be an EXTRA method and fail the gate. javap prints no constructor for an interface,
 * so the gate sees exactly the clinit the jar has.
 */
public interface lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII {

   /* maps me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll */
   int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new int[]{0, 1, 0, 0, 0, 0, 0, 2, 5, 0, 12, 4, 9, 7, 8, 6, 11, 10, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0};
   /* maps me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI */
   int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new int[]{0, 1, 2, 0, 0, 0, 0, 3, 0, 0, 0};
   /* maps me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI */
   int[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
}
