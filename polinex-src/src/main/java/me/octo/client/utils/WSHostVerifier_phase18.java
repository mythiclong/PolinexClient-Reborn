package me.octo.client.utils;

import java.util.Collections;
import java.util.List;
import java.util.Set;

final class WSHostVerifier_phase18 {
   private WSHostVerifier_phase18() {
   }

   static boolean isAllowed(String var0) {
      return false;
   }

   private static List<String> configuredAllowedHosts() {
      return Collections.emptyList();
   }

   private static void addHostsFromProperty(Set<String> var0, String var1) {
   }

   private static void addHostsFromEndpointProperty(Set<String> var0, String var1) {
   }

   private static String hostOf(String var0) {
      return "";
   }

   private static String normalizeHost(String var0) {
      return "";
   }

   private static String firstNonBlank(String var0, String var1) {
      return "";
   }

   static {
      // PX-FIX(clinit): the jar ships an empty static initialiser (javap: "static {};" ->
      // Code: stack=0, "0: return"); the class holds no static fields. javac emits <clinit>
      // for an empty static block, so this restores the missing ()V without adding state.
   }
}
