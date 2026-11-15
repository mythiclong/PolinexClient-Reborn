/*
 * Phase A restoration - missing nested class created by agent N3 (nested-class creation pilot).
 * Binary name: me.octo.client.IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
 * Source of truth: .analysis/me-octo-only.jar, read with javap -p -s / -c.
 * Declared as a TOP-LEVEL class whose simple name contains the dollar sign (repo convention (a)).
 * javac therefore does NOT emit InnerClasses/EnclosingMethod/NestHost attributes, but the
 * BINARY NAME (and hence the method signature set) is identical to the jar class.
 * BODY FIDELITY: PARTIAL - invokeSuspend() resumes the suspend function via the outer instance method a(Continuation); the jar calls the static synthetic wrapper Outer.a(Outer, Continuation), which the restored outer source does not declare.
 */
package me.octo.client;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

final class IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends ContinuationImpl {
   Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   Object lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   Object lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   Object IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   final me.octo.client.IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll this$0;
   int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(me.octo.client.IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll var0, kotlin.coroutines.Continuation var1) {
      super(var1);
      this.this$0 = var0;
   }

   public final Object invokeSuspend(Object var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII | Integer.MIN_VALUE;
      return this.this$0.a(this);
   }
}
