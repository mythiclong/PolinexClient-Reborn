package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;

public class llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII<T> extends ArrayList<T> {
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   public llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII() {
   }

   public llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII(Collection<? extends T> var1) {
      this.addAll(var1);
   }

   public llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII(int var1) {
      super(var1);
   }

   @Override
   public void add(int var1, T var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = b();
      llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII var10000 = this;
      if (var3 == null) {
         if (super.contains(var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.add(var1, var2);
   }

   @Override
   public boolean add(T var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = b();
      boolean var10000 = super.contains(var1);
      if (var2 == null) {
         if (var10000) {
            return false;
         }

         var10000 = super.add(var1);
      }

      return var10000;
   }

   @Override
   public boolean addAll(Collection<? extends T> var1) {
      ArrayList var2 = new ArrayList(var1);
      var2.removeIf(this::contains);
      return super.addAll(var2);
   }

   @Override
   public boolean addAll(int var1, Collection<? extends T> var2) {
      b();
      ArrayList var4 = new ArrayList(var2);
      var4.removeIf(this::contains);
      boolean var10000 = super.addAll(var1, var4);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]);
      }

      return var10000;
   }

   @Override
   public void addFirst(T var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = b();
      llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII var10000 = this;
      Object var10001 = var1;
      if (var2 == null) {
         if (super.contains(var1)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      var10000.addFirst(var10001);
   }

   @Override
   public void addLast(T var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = b();
      llllllIIlllIIIIIlIllIIIIIIllIIIIllIllIIllIlIIIIlIIllIIllIIlIIIlIIIIIlIllIlIlIIIIlIlII var10000 = this;
      Object var10001 = var1;
      if (var2 == null) {
         if (super.contains(var1)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      var10000.addLast(var10001);
   }

   public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   static {
      if (b() != null) {
         b(new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]);
      }
   }
}
