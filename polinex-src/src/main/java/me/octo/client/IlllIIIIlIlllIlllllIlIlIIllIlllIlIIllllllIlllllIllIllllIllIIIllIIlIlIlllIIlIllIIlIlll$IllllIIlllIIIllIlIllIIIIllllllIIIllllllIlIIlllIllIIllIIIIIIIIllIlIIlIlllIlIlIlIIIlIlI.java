package me.octo.client;

/*
 * PX-RESTORED - Phase A jar-only class creation, agent JC6, convention (a).
 *
 * Jar class : me.octo.client.IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
 * Classfile : access 0x1031 ACC_PUBLIC|ACC_FINAL|ACC_SUPER|ACC_SYNTHETIC, super java.lang.Object,
 *             no interfaces, NO <init>, exactly one method <clinit>()V (ACC_STATIC),
 *             1 field(s) ACC_PUBLIC|ACC_STATIC|ACC_SYNTHETIC of descriptor [I.
 * Origin    : the Kotlin WhenMappings switch-map class kotlinc emits for a when-expression
 *             over the obfuscated enum named in the comment above each field.
 *
 * The jar clinit builds one int[] per field as
 *     int[] v = new int[<ENUM>.a().length];
 *     try { v[<ENUM>.<CONST_1>.ordinal()] = 1; } catch (NoSuchFieldError e) {}
 *     try { v[<ENUM>.<CONST_2>.ordinal()] = 2; } catch (NoSuchFieldError e) {}
 *     ...
 *     <field> = v;
 * i.e. v[ordinal(constant)] = branch index, and 0 for every constant the when did not name.
 * That table is a pure function of the frozen obfuscated enums, so the resulting arrays are
 * materialised here as literals. Values were derived twice, independently, and agree:
 *   (1) parsing javap -p -s -c of the .class extracted from .analysis/me-octo-only.jar
 *       (getstatic <CONST> / invokevirtual ordinal / iconst_N / iastore, split by putstatic);
 *   (2) reflectively reading both fields of the class loaded from that same jar.
 * Provenance and gate readings: .analysis/reports/phaseA-jaronly-JC6.md
 *
 * Declared as an INTERFACE on purpose: a jar class that has <clinit> but no <init> cannot be
 * reproduced by a Java class, because javac always synthesises a default constructor, which
 * would be an EXTRA method and fail the gate. javap prints no constructor for an interface,
 * so the gate sees exactly the clinit the jar has.
 */
public interface IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {

   /* maps me.octo.client.IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll */
   int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new int[]{3, 1, 2};
}
