package me.octo.client.utils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public final class WSBackendFacadePhase21 {
   private WSBackendFacadePhase21() {
   }

   static {
      // PX-FIX(clinit): the jar ships an empty static initialiser (javap: "static {};" ->
      // Code: stack=0, "0: return"); the class holds no static fields. javac emits <clinit>
      // for an empty static block, so this restores the missing ()V without adding state.
   }

   // PX-NOTE: the jar declares the nine private no-op helpers below with `throws java.lang.Exception`
   // (descriptors unchanged; every body returns a constant/null and cannot throw). The clause is
   // restored verbatim now that phaseA_dexact.py strips a trailing throws clause before matching.

   public static synchronized void initOuterClass(Class<?> var0) {
   }

   private static synchronized void ensureInitialized() throws java.lang.Exception {
   }

   public static String stateDescription(Object var0) {
      return "";
   }

   public static void addListener(Object var0) {
   }

   public static void removeListener(Object var0) {
   }

   public static synchronized void start() {
   }

   public static synchronized void stop() {
   }

   public static boolean send(String var0) {
      return false;
   }

   public static void restart() {
   }

   public static boolean isRunning() {
      return false;
   }

   public static boolean isConnectedOrAuthenticated() {
      return false;
   }

   public static String currentEndpoint() {
      return "";
   }

   public static int queueSize() {
      return 0;
   }

   public static List<Object> listenerSnapshot() {
      return Collections.emptyList();
   }

   public static RuntimeException passthrough(Exception var0) {
      return null;
   }

   public static String stringAt(int var0, int var1) {
      return "";
   }

   private static Object getState() throws java.lang.Exception {
      return null;
   }

   private static void setStateRunning(boolean var0) {
   }

   private static BlockingQueue<Object> outboundQueue() throws java.lang.Exception {
      return null;
   }

   private static int queueCapacity() {
      return 0;
   }

   private static boolean boolCall(Object var0, String var1) throws java.lang.Exception {
      return true;
   }

   private static boolean atomicBool(Object var0, String var1) throws java.lang.Exception {
      return true;
   }

   private static Object callNoArg(Object var0, String var1) throws java.lang.Exception {
      return null;
   }

   private static Object callOneArg(Object var0, String var1, Class<?> var2, Object var3) throws java.lang.Exception {
      return null;
   }

   private static void shutdownStateExecutors(boolean var0) {
   }

   private static void syncListenerField() {
   }

   private static Object getStatic(Class<?> var0, String var1) throws java.lang.Exception {
      return null;
   }

   private static void setStatic(Class<?> var0, String var1, Object var2) throws java.lang.Exception {
   }

   private static void log(String var0) {
   }
}
