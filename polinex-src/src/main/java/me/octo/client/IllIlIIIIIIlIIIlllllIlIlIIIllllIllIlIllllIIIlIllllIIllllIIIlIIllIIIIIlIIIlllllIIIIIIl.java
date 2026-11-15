package me.octo.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
    public static <T> T h(Object p0) { return null; } // PX-FIX mr3
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3
    public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld2
    public static <T> T b(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld2

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @Nullable
   private IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private HashSet<BlockPos> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @Nullable
   private IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private boolean llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private int IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private final ConcurrentHashMap<Long, List<BlockPos>> llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final ConcurrentHashMap<BlockPos, Long> lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private final int lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private static IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private static Set<BlockPos> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private static String[] h;
   private static String[] i;

   public IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl() {
      short var10001 = -3484;
      short var10002 = 2331;
      var10002 = -3457;
      short var10003 = 367;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -3479;
      short var10005 = -19561;
      List var4 = CollectionsKt.emptyList();
      List var10006 = CollectionsKt.emptyList();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      };
      super("Berry Macro", "Gathers lushlilac berries from bushes.", var3, "Foraging", var4, var10006, false, var1);
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new HashSet<>();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 3;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = new ConcurrentHashMap<>();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new ConcurrentHashMap<>();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = 48;
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, false, false, false, null, 60, null);
   }

   @Nullable
   public final IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a5() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   public final void a(@Nullable IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var1) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   @NotNull
   public final HashSet<BlockPos> a6() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   public final void a(@NotNull HashSet<BlockPos> var1) {
      short var10001 = -3481;
      short var10002 = 21714;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var1;
   }

   @Nullable
   public final IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a7() {
      return this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   }

   public final void b(@Nullable IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var1) {
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var1;
   }

   public final boolean a8() {
      return this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   }

   public final void e(boolean var1) {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var1;
   }

   public final int a9() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   public final void a(int var1) {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var1;
   }

   @NotNull
   public final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI a_() {
      return this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   }

   public final int ba() {
      return this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   }

   public final void c(int var1) {
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var1;
   }

   public final int bb() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   private final long a(int var1, int var2) {
      return (long)var1 << 32 | var2 & 4294967295L;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10001 = this;
      short var10002 = -3477;
      short var10003 = -21181;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Berry travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (kotlin.jvm.functions.Function0)(() -> IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.a(this)),
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -28662;
                  short var10005 = -31569;
                  var10005 = -28664;
                  short var10006 = 24767;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -28663;
                  short var10002x = 15828;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "¿làÅ÷1\nÔº=sìH\u0086ÎãâW8N¿1ÝÌºh²ün\u0098ûÏ×N.\u009bJÇ¥õ\u0018åt\u0097\u009eºz_°\u001d\u0099³ßßr!\u009d\u000f\"\u008cí=Bõâ\n1i¯÷\u0003ðUò§×¯\fû\u0091\u0093¾Þ\u008c\u0089º\u0085:\u0098ëÉ\n7Q\n¦È\u008fïÚÈ6\u0014Oü:\u0010óîsT5Y¨ºùþ¶R@Ã\u0002(ü\u0010Ç\u0088ïY\u0016¢6¦=s\u0083%V¿\rÄ";
                  int var4 = "¿làÅ÷1\nÔº=sìH\u0086ÎãâW8N¿1ÝÌºh²ün\u0098ûÏ×N.\u009bJÇ¥õ\u0018åt\u0097\u009eºz_°\u001d\u0099³ßßr!\u009d\u000f\"\u008cí=Bõâ\n1i¯÷\u0003ðUò§×¯\fû\u0091\u0093¾Þ\u008c\u0089º\u0085:\u0098ëÉ\n7Q\n¦È\u008fïÚÈ6\u0014Oü:\u0010óîsT5Y¨ºùþ¶R@Ã\u0002(ü\u0010Ç\u0088ïY\u0016¢6¦=s\u0083%V¿\rÄ"
                     .length();
                  char var1 = 'y';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003x = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003x.length;
                        int var6 = 0;
                        byte var13 = 97;
                        var10002x = var10003x;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003x;
                           var16 = 97;
                           var10006 = var6;
                        } else {
                           var13 = 97;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003x;
                           var16 = 97;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 26;
                              case 1 -> 33;
                              case 2 -> 18;
                              case 3 -> 8;
                              case 4 -> 43;
                              case 5 -> 72;
                              default -> 127;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002x;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002x;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002x).intern();
                     byte var10 = -1;
                     var5[var3++] = var15;
                     if ((var0 += var1) >= var4) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ -28664) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 173;
                        case 1 -> 27;
                        case 2 -> 201;
                        case 3 -> 140;
                        case 4 -> 60;
                        case 5 -> 54;
                        case 6 -> 26;
                        case 7 -> 29;
                        case 8 -> 65;
                        case 9 -> 62;
                        case 10 -> 3;
                        case 11 -> 252;
                        case 12 -> 250;
                        case 13 -> 78;
                        case 14 -> 92;
                        case 15 -> 31;
                        case 16 -> 253;
                        case 17 -> 180;
                        case 18 -> 91;
                        case 19 -> 223;
                        case 20 -> 246;
                        case 21 -> 193;
                        case 22 -> 89;
                        case 23 -> 14;
                        case 24 -> 84;
                        case 25 -> 167;
                        case 26 -> 47;
                        case 27 -> 222;
                        case 28 -> 220;
                        case 29 -> 205;
                        case 30 -> 44;
                        case 31 -> 168;
                        case 32 -> 203;
                        case 33 -> 182;
                        case 34 -> 0;
                        case 35 -> 102;
                        case 36 -> 28;
                        case 37 -> 66;
                        case 38 -> 20;
                        case 39 -> 109;
                        case 40 -> 238;
                        case 41 -> 212;
                        case 42 -> 90;
                        case 43 -> 24;
                        case 44 -> 13;
                        case 45 -> 35;
                        case 46 -> 93;
                        case 47 -> 113;
                        case 48 -> 57;
                        case 49 -> 18;
                        case 50 -> 188;
                        case 51 -> 104;
                        case 52 -> 194;
                        case 53 -> 215;
                        case 54 -> 110;
                        case 55 -> 171;
                        case 56 -> 9;
                        case 57 -> 48;
                        case 58 -> 232;
                        case 59 -> 94;
                        case 60 -> 164;
                        case 61 -> 70;
                        case 62 -> 8;
                        case 63 -> 242;
                        case 64 -> 39;
                        case 65 -> 170;
                        case 66 -> 142;
                        case 67 -> 245;
                        case 68 -> 207;
                        case 69 -> 96;
                        case 70 -> 200;
                        case 71 -> 196;
                        case 72 -> 241;
                        case 73 -> 135;
                        case 74 -> 255;
                        case 75 -> 162;
                        case 76 -> 32;
                        case 77 -> 116;
                        case 78 -> 231;
                        case 79 -> 33;
                        case 80 -> 5;
                        case 81 -> 191;
                        case 82 -> 76;
                        case 83 -> 177;
                        case 84 -> 85;
                        case 85 -> 133;
                        case 86 -> 195;
                        case 87 -> 4;
                        case 88 -> 120;
                        case 89 -> 233;
                        case 90 -> 99;
                        case 91 -> 83;
                        case 92 -> 225;
                        case 93 -> 50;
                        case 94 -> 95;
                        case 95 -> 139;
                        case 96 -> 68;
                        case 97 -> 118;
                        case 98 -> 234;
                        case 99 -> 49;
                        case 100 -> 230;
                        case 101 -> 161;
                        case 102 -> 249;
                        case 103 -> 138;
                        case 104 -> 77;
                        case 105 -> 114;
                        case 106 -> 7;
                        case 107 -> 87;
                        case 108 -> 88;
                        case 109 -> 2;
                        case 110 -> 59;
                        case 111 -> 134;
                        case 112 -> 56;
                        case 113 -> 202;
                        case 114 -> 217;
                        case 115 -> 82;
                        case 116 -> 74;
                        case 117 -> 108;
                        case 118 -> 185;
                        case 119 -> 247;
                        case 120 -> 157;
                        case 121 -> 42;
                        case 122 -> 214;
                        case 123 -> 224;
                        case 124 -> 124;
                        case 125 -> 36;
                        case 126 -> 40;
                        case 127 -> 153;
                        case 128 -> 176;
                        case 129 -> 183;
                        case 130 -> 158;
                        case 131 -> 105;
                        case 132 -> 128;
                        case 133 -> 248;
                        case 134 -> 240;
                        case 135 -> 12;
                        case 136 -> 45;
                        case 137 -> 25;
                        case 138 -> 204;
                        case 139 -> 80;
                        case 140 -> 86;
                        case 141 -> 211;
                        case 142 -> 229;
                        case 143 -> 136;
                        case 144 -> 23;
                        case 145 -> 169;
                        case 146 -> 237;
                        case 147 -> 228;
                        case 148 -> 174;
                        case 149 -> 175;
                        case 150 -> 206;
                        case 151 -> 154;
                        case 152 -> 147;
                        case 153 -> 172;
                        case 154 -> 166;
                        case 155 -> 75;
                        case 156 -> 17;
                        case 157 -> 159;
                        case 158 -> 123;
                        case 159 -> 192;
                        case 160 -> 181;
                        case 161 -> 37;
                        case 162 -> 112;
                        case 163 -> 30;
                        case 164 -> 130;
                        case 165 -> 111;
                        case 166 -> 21;
                        case 167 -> 239;
                        case 168 -> 132;
                        case 169 -> 156;
                        case 170 -> 61;
                        case 171 -> 46;
                        case 172 -> 79;
                        case 173 -> 122;
                        case 174 -> 213;
                        case 175 -> 151;
                        case 176 -> 197;
                        case 177 -> 55;
                        case 178 -> 51;
                        case 179 -> 100;
                        case 180 -> 141;
                        case 181 -> 101;
                        case 182 -> 117;
                        case 183 -> 97;
                        case 184 -> 11;
                        case 185 -> 72;
                        case 186 -> 15;
                        case 187 -> 106;
                        case 188 -> 219;
                        case 189 -> 125;
                        case 190 -> 236;
                        case 191 -> 73;
                        case 192 -> 226;
                        case 193 -> 71;
                        case 194 -> 43;
                        case 195 -> 184;
                        case 196 -> 19;
                        case 197 -> 16;
                        case 198 -> 115;
                        case 199 -> 209;
                        case 200 -> 107;
                        case 201 -> 199;
                        case 202 -> 227;
                        case 203 -> 81;
                        case 204 -> 137;
                        case 205 -> 38;
                        case 206 -> 179;
                        case 207 -> 235;
                        case 208 -> 210;
                        case 209 -> 131;
                        case 210 -> 103;
                        case 211 -> 1;
                        case 212 -> 67;
                        case 213 -> 64;
                        case 214 -> 165;
                        case 215 -> 243;
                        case 216 -> 126;
                        case 217 -> 34;
                        case 218 -> 119;
                        case 219 -> 251;
                        case 220 -> 148;
                        case 221 -> 198;
                        case 222 -> 58;
                        case 223 -> 178;
                        case 224 -> 53;
                        case 225 -> 208;
                        case 226 -> 218;
                        case 227 -> 41;
                        case 228 -> 146;
                        case 229 -> 216;
                        case 230 -> 129;
                        case 231 -> 221;
                        case 232 -> 143;
                        case 233 -> 190;
                        case 234 -> 155;
                        case 235 -> 144;
                        case 236 -> 52;
                        case 237 -> 127;
                        case 238 -> 189;
                        case 239 -> 22;
                        case 240 -> 121;
                        case 241 -> 6;
                        case 242 -> 163;
                        case 243 -> 186;
                        case 244 -> 63;
                        case 245 -> 244;
                        case 246 -> 150;
                        case 247 -> 145;
                        case 248 -> 254;
                        case 249 -> 149;
                        case 250 -> 69;
                        case 251 -> 160;
                        case 252 -> 10;
                        case 253 -> 152;
                        case 254 -> 98;
                        default -> 187;
                     };
                     int var5 = (var1 & 0xFF) - var4;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6 = ((var1 & 65535) >>> 8) - var4;
                     if (var6 < 0) {
                        var6 += 256;
                     }

                     for (int var7 = 0; var7 < var3.length; var7++) {
                        int var8 = var7 % 2;
                        char var10002x = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002x ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002x ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ),
         48,
         null);
      var10001 = this;
      var10002 = -3485;
      var10003 = 5899;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Berry scan",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
         15000L,
         0L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.c(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 27130;
                  short var10005 = 25642;
                  var10005 = 27131;
                  short var10006 = -15001;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 27129;
                  short var10002 = -27857;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = ")ì\u009b\u001eÛgÚ ä\u001asKe'Õ\u0093(\u0092\"Û©=[ä¡.üa\u0019o¼ú|Å\u000eT\n\u0097f¼M\u0099`\\µ\b\\$!Ìï ÚîÿR\u0092%j\u0002§Á^Ô%\u0087\u0002\u009bäüÔÕ\u0006\u009d\u008e\u0017ßª±ì\u0011R£D\u0098ç\u000eZªÊÚ\u0090\u0011«\u0005º\u0004YÈD\u0085.þaôAU5\u008dè\u0015\u0013Ï(Á\"Òà\u00824\u009d\u0010Mä\u0017\u001fJGè¤¢\u009a»[|%öÓ\u0002\\\u0092";
                  int var4 = ")ì\u009b\u001eÛgÚ ä\u001asKe'Õ\u0093(\u0092\"Û©=[ä¡.üa\u0019o¼ú|Å\u000eT\n\u0097f¼M\u0099`\\µ\b\\$!Ìï ÚîÿR\u0092%j\u0002§Á^Ô%\u0087\u0002\u009bäüÔÕ\u0006\u009d\u008e\u0017ßª±ì\u0011R£D\u0098ç\u000eZªÊÚ\u0090\u0011«\u0005º\u0004YÈD\u0085.þaôAU5\u008dè\u0015\u0013Ï(Á\"Òà\u00824\u009d\u0010Mä\u0017\u001fJGè¤¢\u009a»[|%öÓ\u0002\\\u0092"
                     .length();
                  char var1 = 'y';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 107;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 107;
                           var10006 = var6;
                        } else {
                           var13 = 107;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 107;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 7;
                              case 1 -> 109;
                              case 2 -> 83;
                              case 3 -> 1;
                              case 4 -> 11;
                              case 5 -> 15;
                              default -> 101;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002).intern();
                     byte var10 = -1;
                     var5[var3++] = var15;
                     if ((var0 += var1) >= var4) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ 27131) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 218;
                        case 1 -> 59;
                        case 2 -> 203;
                        case 3 -> 150;
                        case 4 -> 240;
                        case 5 -> 193;
                        case 6 -> 12;
                        case 7 -> 143;
                        case 8 -> 115;
                        case 9 -> 233;
                        case 10 -> 234;
                        case 11 -> 229;
                        case 12 -> 167;
                        case 13 -> 169;
                        case 14 -> 183;
                        case 15 -> 1;
                        case 16 -> 152;
                        case 17 -> 170;
                        case 18 -> 221;
                        case 19 -> 17;
                        case 20 -> 165;
                        case 21 -> 214;
                        case 22 -> 126;
                        case 23 -> 220;
                        case 24 -> 117;
                        case 25 -> 188;
                        case 26 -> 91;
                        case 27 -> 238;
                        case 28 -> 40;
                        case 29 -> 164;
                        case 30 -> 82;
                        case 31 -> 116;
                        case 32 -> 37;
                        case 33 -> 225;
                        case 34 -> 81;
                        case 35 -> 110;
                        case 36 -> 185;
                        case 37 -> 46;
                        case 38 -> 31;
                        case 39 -> 25;
                        case 40 -> 207;
                        case 41 -> 160;
                        case 42 -> 3;
                        case 43 -> 217;
                        case 44 -> 244;
                        case 45 -> 192;
                        case 46 -> 83;
                        case 47 -> 226;
                        case 48 -> 239;
                        case 49 -> 252;
                        case 50 -> 114;
                        case 51 -> 9;
                        case 52 -> 161;
                        case 53 -> 63;
                        case 54 -> 202;
                        case 55 -> 201;
                        case 56 -> 157;
                        case 57 -> 26;
                        case 58 -> 196;
                        case 59 -> 174;
                        case 60 -> 109;
                        case 61 -> 108;
                        case 62 -> 180;
                        case 63 -> 94;
                        case 64 -> 197;
                        case 65 -> 173;
                        case 66 -> 60;
                        case 67 -> 208;
                        case 68 -> 171;
                        case 69 -> 58;
                        case 70 -> 8;
                        case 71 -> 20;
                        case 72 -> 54;
                        case 73 -> 68;
                        case 74 -> 184;
                        case 75 -> 205;
                        case 76 -> 255;
                        case 77 -> 194;
                        case 78 -> 28;
                        case 79 -> 133;
                        case 80 -> 243;
                        case 81 -> 122;
                        case 82 -> 250;
                        case 83 -> 206;
                        case 84 -> 134;
                        case 85 -> 178;
                        case 86 -> 236;
                        case 87 -> 44;
                        case 88 -> 232;
                        case 89 -> 212;
                        case 90 -> 127;
                        case 91 -> 41;
                        case 92 -> 172;
                        case 93 -> 216;
                        case 94 -> 190;
                        case 95 -> 146;
                        case 96 -> 204;
                        case 97 -> 10;
                        case 98 -> 74;
                        case 99 -> 50;
                        case 100 -> 123;
                        case 101 -> 106;
                        case 102 -> 253;
                        case 103 -> 156;
                        case 104 -> 104;
                        case 105 -> 55;
                        case 106 -> 7;
                        case 107 -> 140;
                        case 108 -> 124;
                        case 109 -> 0;
                        case 110 -> 51;
                        case 111 -> 36;
                        case 112 -> 45;
                        case 113 -> 224;
                        case 114 -> 79;
                        case 115 -> 69;
                        case 116 -> 24;
                        case 117 -> 30;
                        case 118 -> 73;
                        case 119 -> 137;
                        case 120 -> 247;
                        case 121 -> 166;
                        case 122 -> 210;
                        case 123 -> 136;
                        case 124 -> 118;
                        case 125 -> 121;
                        case 126 -> 199;
                        case 127 -> 47;
                        case 128 -> 254;
                        case 129 -> 144;
                        case 130 -> 145;
                        case 131 -> 52;
                        case 132 -> 105;
                        case 133 -> 211;
                        case 134 -> 62;
                        case 135 -> 38;
                        case 136 -> 158;
                        case 137 -> 71;
                        case 138 -> 237;
                        case 139 -> 29;
                        case 140 -> 245;
                        case 141 -> 131;
                        case 142 -> 129;
                        case 143 -> 15;
                        case 144 -> 159;
                        case 145 -> 14;
                        case 146 -> 66;
                        case 147 -> 75;
                        case 148 -> 96;
                        case 149 -> 120;
                        case 150 -> 32;
                        case 151 -> 223;
                        case 152 -> 11;
                        case 153 -> 139;
                        case 154 -> 43;
                        case 155 -> 248;
                        case 156 -> 48;
                        case 157 -> 251;
                        case 158 -> 13;
                        case 159 -> 98;
                        case 160 -> 21;
                        case 161 -> 200;
                        case 162 -> 246;
                        case 163 -> 135;
                        case 164 -> 34;
                        case 165 -> 27;
                        case 166 -> 227;
                        case 167 -> 191;
                        case 168 -> 175;
                        case 169 -> 61;
                        case 170 -> 18;
                        case 171 -> 235;
                        case 172 -> 195;
                        case 173 -> 4;
                        case 174 -> 19;
                        case 175 -> 5;
                        case 176 -> 70;
                        case 177 -> 101;
                        case 178 -> 76;
                        case 179 -> 241;
                        case 180 -> 99;
                        case 181 -> 42;
                        case 182 -> 249;
                        case 183 -> 90;
                        case 184 -> 242;
                        case 185 -> 189;
                        case 186 -> 6;
                        case 187 -> 128;
                        case 188 -> 22;
                        case 189 -> 107;
                        case 190 -> 111;
                        case 191 -> 153;
                        case 192 -> 215;
                        case 193 -> 39;
                        case 194 -> 198;
                        case 195 -> 230;
                        case 196 -> 149;
                        case 197 -> 97;
                        case 198 -> 132;
                        case 199 -> 35;
                        case 200 -> 181;
                        case 201 -> 141;
                        case 202 -> 65;
                        case 203 -> 231;
                        case 204 -> 53;
                        case 205 -> 168;
                        case 206 -> 154;
                        case 207 -> 163;
                        case 208 -> 72;
                        case 209 -> 49;
                        case 210 -> 182;
                        case 211 -> 88;
                        case 212 -> 155;
                        case 213 -> 67;
                        case 214 -> 64;
                        case 215 -> 93;
                        case 216 -> 85;
                        case 217 -> 177;
                        case 218 -> 102;
                        case 219 -> 222;
                        case 220 -> 89;
                        case 221 -> 187;
                        case 222 -> 87;
                        case 223 -> 113;
                        case 224 -> 77;
                        case 225 -> 130;
                        case 226 -> 179;
                        case 227 -> 78;
                        case 228 -> 23;
                        case 229 -> 80;
                        case 230 -> 86;
                        case 231 -> 119;
                        case 232 -> 103;
                        case 233 -> 100;
                        case 234 -> 142;
                        case 235 -> 147;
                        case 236 -> 186;
                        case 237 -> 57;
                        case 238 -> 219;
                        case 239 -> 33;
                        case 240 -> 56;
                        case 241 -> 148;
                        case 242 -> 2;
                        case 243 -> 125;
                        case 244 -> 112;
                        case 245 -> 92;
                        case 246 -> 151;
                        case 247 -> 95;
                        case 248 -> 213;
                        case 249 -> 209;
                        case 250 -> 176;
                        case 251 -> 228;
                        case 252 -> 84;
                        case 253 -> 138;
                        case 254 -> 162;
                        default -> 16;
                     };
                     int var5 = (var1 & 0xFF) - var4;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6 = ((var1 & 65535) >>> 8) - var4;
                     if (var6 < 0) {
                        var6 += 256;
                     }

                     for (int var7 = 0; var7 < var3.length; var7++) {
                        int var8 = var7 % 2;
                        char var10002 = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002 ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002 ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ),
         56,
         null);
      var10001 = this;
      var10002 = -3488;
      var10003 = 13778;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Berry move",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         25000L,
         0L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.d(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 3548;
                  short var10005 = -17235;
                  var10005 = 3551;
                  short var10006 = -23638;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 3549;
                  short var10002 = 22577;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "¼6\u0010óö\u0012ÌÕÀ\u0012á\u009aà-+S\"¦Ty¾\u009f»áàe´UNv·ù\u0000xÌ\u001fÙ\u0092#&\u00807\u0019wxc:Át\u001cÃ\u0005¬Ç\u001d¡\u000fûW\u000e\u0096Æ®Ð¾\b\u0002ÙãÆÐ³¬£ÌòAVÂý\u008dÃ\u0012!ËëN)\u0090£ïY³\u009d\u0007êç Ñ\u007f\u008c\u001fíää\u0094S¥>ÈAe\u0005Ç\u0016\b\u009b\u0006\u008eÈ\u009f.\u0082\u009crKâ¦ê¥\u0004³X[áÝéâìÁ7";
                  int var4 = "¼6\u0010óö\u0012ÌÕÀ\u0012á\u009aà-+S\"¦Ty¾\u009f»áàe´UNv·ù\u0000xÌ\u001fÙ\u0092#&\u00807\u0019wxc:Át\u001cÃ\u0005¬Ç\u001d¡\u000fûW\u000e\u0096Æ®Ð¾\b\u0002ÙãÆÐ³¬£ÌòAVÂý\u008dÃ\u0012!ËëN)\u0090£ïY³\u009d\u0007êç Ñ\u007f\u008c\u001fíää\u0094S¥>ÈAe\u0005Ç\u0016\b\u009b\u0006\u008eÈ\u009f.\u0082\u009crKâ¦ê¥\u0004³X[áÝéâìÁ7"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 107;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 107;
                           var10006 = var6;
                        } else {
                           var13 = 107;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 107;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 88;
                              case 1 -> 75;
                              case 2 -> 106;
                              case 3 -> 84;
                              case 4 -> 19;
                              case 5 -> 88;
                              default -> 111;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002).intern();
                     byte var10 = -1;
                     var5[var3++] = var15;
                     if ((var0 += var1) >= var4) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ 3549) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 199;
                        case 1 -> 213;
                        case 2 -> 30;
                        case 3 -> 6;
                        case 4 -> 121;
                        case 5 -> 119;
                        case 6 -> 73;
                        case 7 -> 3;
                        case 8 -> 191;
                        case 9 -> 232;
                        case 10 -> 125;
                        case 11 -> 167;
                        case 12 -> 101;
                        case 13 -> 108;
                        case 14 -> 209;
                        case 15 -> 68;
                        case 16 -> 42;
                        case 17 -> 143;
                        case 18 -> 178;
                        case 19 -> 49;
                        case 20 -> 113;
                        case 21 -> 180;
                        case 22 -> 253;
                        case 23 -> 233;
                        case 24 -> 169;
                        case 25 -> 71;
                        case 26 -> 58;
                        case 27 -> 11;
                        case 28 -> 229;
                        case 29 -> 104;
                        case 30 -> 41;
                        case 31 -> 37;
                        case 32 -> 242;
                        case 33 -> 102;
                        case 34 -> 137;
                        case 35 -> 78;
                        case 36 -> 34;
                        case 37 -> 130;
                        case 38 -> 77;
                        case 39 -> 127;
                        case 40 -> 177;
                        case 41 -> 204;
                        case 42 -> 226;
                        case 43 -> 112;
                        case 44 -> 239;
                        case 45 -> 63;
                        case 46 -> 205;
                        case 47 -> 182;
                        case 48 -> 31;
                        case 49 -> 171;
                        case 50 -> 64;
                        case 51 -> 51;
                        case 52 -> 88;
                        case 53 -> 189;
                        case 54 -> 7;
                        case 55 -> 66;
                        case 56 -> 237;
                        case 57 -> 241;
                        case 58 -> 193;
                        case 59 -> 194;
                        case 60 -> 98;
                        case 61 -> 18;
                        case 62 -> 99;
                        case 63 -> 109;
                        case 64 -> 186;
                        case 65 -> 47;
                        case 66 -> 206;
                        case 67 -> 60;
                        case 68 -> 210;
                        case 69 -> 138;
                        case 70 -> 103;
                        case 71 -> 129;
                        case 72 -> 36;
                        case 73 -> 106;
                        case 74 -> 234;
                        case 75 -> 56;
                        case 76 -> 248;
                        case 77 -> 105;
                        case 78 -> 247;
                        case 79 -> 94;
                        case 80 -> 172;
                        case 81 -> 82;
                        case 82 -> 117;
                        case 83 -> 122;
                        case 84 -> 24;
                        case 85 -> 15;
                        case 86 -> 207;
                        case 87 -> 75;
                        case 88 -> 152;
                        case 89 -> 111;
                        case 90 -> 151;
                        case 91 -> 28;
                        case 92 -> 148;
                        case 93 -> 150;
                        case 94 -> 203;
                        case 95 -> 218;
                        case 96 -> 198;
                        case 97 -> 91;
                        case 98 -> 133;
                        case 99 -> 168;
                        case 100 -> 147;
                        case 101 -> 118;
                        case 102 -> 246;
                        case 103 -> 161;
                        case 104 -> 221;
                        case 105 -> 21;
                        case 106 -> 110;
                        case 107 -> 12;
                        case 108 -> 116;
                        case 109 -> 72;
                        case 110 -> 76;
                        case 111 -> 231;
                        case 112 -> 40;
                        case 113 -> 145;
                        case 114 -> 142;
                        case 115 -> 240;
                        case 116 -> 156;
                        case 117 -> 187;
                        case 118 -> 90;
                        case 119 -> 20;
                        case 120 -> 220;
                        case 121 -> 159;
                        case 122 -> 26;
                        case 123 -> 184;
                        case 124 -> 243;
                        case 125 -> 45;
                        case 126 -> 252;
                        case 127 -> 132;
                        case 128 -> 23;
                        case 129 -> 140;
                        case 130 -> 245;
                        case 131 -> 249;
                        case 132 -> 215;
                        case 133 -> 196;
                        case 134 -> 39;
                        case 135 -> 165;
                        case 136 -> 33;
                        case 137 -> 96;
                        case 138 -> 154;
                        case 139 -> 1;
                        case 140 -> 74;
                        case 141 -> 197;
                        case 142 -> 208;
                        case 143 -> 50;
                        case 144 -> 48;
                        case 145 -> 2;
                        case 146 -> 89;
                        case 147 -> 81;
                        case 148 -> 43;
                        case 149 -> 126;
                        case 150 -> 230;
                        case 151 -> 35;
                        case 152 -> 222;
                        case 153 -> 244;
                        case 154 -> 158;
                        case 155 -> 200;
                        case 156 -> 57;
                        case 157 -> 54;
                        case 158 -> 217;
                        case 159 -> 83;
                        case 160 -> 254;
                        case 161 -> 176;
                        case 162 -> 136;
                        case 163 -> 10;
                        case 164 -> 123;
                        case 165 -> 29;
                        case 166 -> 124;
                        case 167 -> 155;
                        case 168 -> 236;
                        case 169 -> 192;
                        case 170 -> 185;
                        case 171 -> 181;
                        case 172 -> 22;
                        case 173 -> 92;
                        case 174 -> 195;
                        case 175 -> 157;
                        case 176 -> 95;
                        case 177 -> 0;
                        case 178 -> 238;
                        case 179 -> 59;
                        case 180 -> 38;
                        case 181 -> 227;
                        case 182 -> 224;
                        case 183 -> 25;
                        case 184 -> 211;
                        case 185 -> 225;
                        case 186 -> 14;
                        case 187 -> 188;
                        case 188 -> 255;
                        case 189 -> 201;
                        case 190 -> 19;
                        case 191 -> 13;
                        case 192 -> 5;
                        case 193 -> 175;
                        case 194 -> 84;
                        case 195 -> 250;
                        case 196 -> 52;
                        case 197 -> 144;
                        case 198 -> 149;
                        case 199 -> 100;
                        case 200 -> 214;
                        case 201 -> 228;
                        case 202 -> 153;
                        case 203 -> 61;
                        case 204 -> 79;
                        case 205 -> 53;
                        case 206 -> 32;
                        case 207 -> 55;
                        case 208 -> 190;
                        case 209 -> 141;
                        case 210 -> 69;
                        case 211 -> 120;
                        case 212 -> 170;
                        case 213 -> 135;
                        case 214 -> 115;
                        case 215 -> 212;
                        case 216 -> 17;
                        case 217 -> 216;
                        case 218 -> 174;
                        case 219 -> 62;
                        case 220 -> 173;
                        case 221 -> 139;
                        case 222 -> 179;
                        case 223 -> 183;
                        case 224 -> 4;
                        case 225 -> 146;
                        case 226 -> 223;
                        case 227 -> 80;
                        case 228 -> 160;
                        case 229 -> 163;
                        case 230 -> 70;
                        case 231 -> 9;
                        case 232 -> 44;
                        case 233 -> 16;
                        case 234 -> 65;
                        case 235 -> 128;
                        case 236 -> 27;
                        case 237 -> 134;
                        case 238 -> 87;
                        case 239 -> 251;
                        case 240 -> 162;
                        case 241 -> 219;
                        case 242 -> 131;
                        case 243 -> 67;
                        case 244 -> 166;
                        case 245 -> 235;
                        case 246 -> 114;
                        case 247 -> 107;
                        case 248 -> 202;
                        case 249 -> 8;
                        case 250 -> 164;
                        case 251 -> 86;
                        case 252 -> 97;
                        case 253 -> 93;
                        case 254 -> 85;
                        default -> 46;
                     };
                     int var5 = (var1 & 0xFF) - var4;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6 = ((var1 & 65535) >>> 8) - var4;
                     if (var6 < 0) {
                        var6 += 256;
                     }

                     for (int var7 = 0; var7 < var3.length; var7++) {
                        int var8 = var7 % 2;
                        char var10002 = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002 ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002 ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ),
         56,
         null);
      var10001 = this;
      var10002 = -3478;
      var10003 = -28572;
IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Berry mine",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         5000L,
         0L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.e(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -5132;
                  short var10005 = 20655;
                  var10005 = -5130;
                  short var10006 = 20214;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -5131;
                  short var10002 = 7736;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0088De\u0087`\u009bÚ\fÔEùÄû¡5s\u0002õÍyÝÞÏÔ5ñpA\u0081ìSñ®\u0007\u009f§«\u00986U\\ßÕrü\u0098\u0098À¦k\u0081ö¿\u008b\u0001®Û\u0002ÐjT4pÙ}4!lùöÄ\u00ad3;\r\u009fÿ¬\r¿/¹8èÙÊ\u0011VI2R<\u001c,©îL¦ó§Õ_ô\u0092A\rÿ\u008bð?æ\u001d¦Ð\u007f±\u0084Oë¶+üOôµÀMÏ\u0002Ó+\u0003;\u001a\u0095è<v(Õø";
                  int var4 = "\u0088De\u0087`\u009bÚ\fÔEùÄû¡5s\u0002õÍyÝÞÏÔ5ñpA\u0081ìSñ®\u0007\u009f§«\u00986U\\ßÕrü\u0098\u0098À¦k\u0081ö¿\u008b\u0001®Û\u0002ÐjT4pÙ}4!lùöÄ\u00ad3;\r\u009fÿ¬\r¿/¹8èÙÊ\u0011VI2R<\u001c,©îL¦ó§Õ_ô\u0092A\rÿ\u008bð?æ\u001d¦Ð\u007f±\u0084Oë¶+üOôµÀMÏ\u0002Ó+\u0003;\u001a\u0095è<v(Õø"
                     .length();
                  char var1 = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 82;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 82;
                           var10006 = var6;
                        } else {
                           var13 = 82;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 82;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 105;
                              case 1 -> 11;
                              case 2 -> 74;
                              case 3 -> 95;
                              case 4 -> 82;
                              case 5 -> 21;
                              default -> 39;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002).intern();
                     byte var10 = -1;
                     var5[var3++] = var15;
                     if ((var0 += var1) >= var4) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1) {
                  int var2 = (var0 ^ -5132) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 49;
                        case 1 -> 79;
                        case 2 -> 179;
                        case 3 -> 28;
                        case 4 -> 164;
                        case 5 -> 18;
                        case 6 -> 123;
                        case 7 -> 235;
                        case 8 -> 9;
                        case 9 -> 151;
                        case 10 -> 185;
                        case 11 -> 226;
                        case 12 -> 70;
                        case 13 -> 52;
                        case 14 -> 97;
                        case 15 -> 232;
                        case 16 -> 19;
                        case 17 -> 172;
                        case 18 -> 128;
                        case 19 -> 73;
                        case 20 -> 115;
                        case 21 -> 38;
                        case 22 -> 113;
                        case 23 -> 158;
                        case 24 -> 253;
                        case 25 -> 183;
                        case 26 -> 161;
                        case 27 -> 248;
                        case 28 -> 94;
                        case 29 -> 42;
                        case 30 -> 243;
                        case 31 -> 160;
                        case 32 -> 1;
                        case 33 -> 4;
                        case 34 -> 181;
                        case 35 -> 90;
                        case 36 -> 7;
                        case 37 -> 26;
                        case 38 -> 241;
                        case 39 -> 163;
                        case 40 -> 147;
                        case 41 -> 45;
                        case 42 -> 139;
                        case 43 -> 137;
                        case 44 -> 72;
                        case 45 -> 5;
                        case 46 -> 176;
                        case 47 -> 200;
                        case 48 -> 127;
                        case 49 -> 6;
                        case 50 -> 92;
                        case 51 -> 59;
                        case 52 -> 170;
                        case 53 -> 20;
                        case 54 -> 27;
                        case 55 -> 196;
                        case 56 -> 16;
                        case 57 -> 215;
                        case 58 -> 23;
                        case 59 -> 66;
                        case 60 -> 166;
                        case 61 -> 202;
                        case 62 -> 230;
                        case 63 -> 65;
                        case 64 -> 239;
                        case 65 -> 22;
                        case 66 -> 244;
                        case 67 -> 134;
                        case 68 -> 173;
                        case 69 -> 221;
                        case 70 -> 175;
                        case 71 -> 157;
                        case 72 -> 121;
                        case 73 -> 117;
                        case 74 -> 205;
                        case 75 -> 75;
                        case 76 -> 129;
                        case 77 -> 199;
                        case 78 -> 240;
                        case 79 -> 218;
                        case 80 -> 21;
                        case 81 -> 83;
                        case 82 -> 143;
                        case 83 -> 237;
                        case 84 -> 60;
                        case 85 -> 204;
                        case 86 -> 110;
                        case 87 -> 249;
                        case 88 -> 37;
                        case 89 -> 156;
                        case 90 -> 224;
                        case 91 -> 14;
                        case 92 -> 101;
                        case 93 -> 131;
                        case 94 -> 193;
                        case 95 -> 114;
                        case 96 -> 99;
                        case 97 -> 211;
                        case 98 -> 17;
                        case 99 -> 43;
                        case 100 -> 180;
                        case 101 -> 132;
                        case 102 -> 119;
                        case 103 -> 141;
                        case 104 -> 71;
                        case 105 -> 30;
                        case 106 -> 39;
                        case 107 -> 15;
                        case 108 -> 148;
                        case 109 -> 210;
                        case 110 -> 100;
                        case 111 -> 93;
                        case 112 -> 44;
                        case 113 -> 63;
                        case 114 -> 102;
                        case 115 -> 182;
                        case 116 -> 189;
                        case 117 -> 219;
                        case 118 -> 190;
                        case 119 -> 208;
                        case 120 -> 201;
                        case 121 -> 186;
                        case 122 -> 126;
                        case 123 -> 105;
                        case 124 -> 207;
                        case 125 -> 169;
                        case 126 -> 89;
                        case 127 -> 11;
                        case 128 -> 88;
                        case 129 -> 192;
                        case 130 -> 82;
                        case 131 -> 194;
                        case 132 -> 213;
                        case 133 -> 254;
                        case 134 -> 96;
                        case 135 -> 84;
                        case 136 -> 125;
                        case 137 -> 32;
                        case 138 -> 140;
                        case 139 -> 223;
                        case 140 -> 197;
                        case 141 -> 36;
                        case 142 -> 116;
                        case 143 -> 76;
                        case 144 -> 225;
                        case 145 -> 216;
                        case 146 -> 168;
                        case 147 -> 87;
                        case 148 -> 167;
                        case 149 -> 228;
                        case 150 -> 217;
                        case 151 -> 98;
                        case 152 -> 61;
                        case 153 -> 86;
                        case 154 -> 47;
                        case 155 -> 159;
                        case 156 -> 2;
                        case 157 -> 109;
                        case 158 -> 13;
                        case 159 -> 103;
                        case 160 -> 236;
                        case 161 -> 46;
                        case 162 -> 81;
                        case 163 -> 251;
                        case 164 -> 245;
                        case 165 -> 54;
                        case 166 -> 35;
                        case 167 -> 124;
                        case 168 -> 177;
                        case 169 -> 55;
                        case 170 -> 133;
                        case 171 -> 188;
                        case 172 -> 106;
                        case 173 -> 242;
                        case 174 -> 91;
                        case 175 -> 69;
                        case 176 -> 206;
                        case 177 -> 209;
                        case 178 -> 118;
                        case 179 -> 212;
                        case 180 -> 135;
                        case 181 -> 222;
                        case 182 -> 25;
                        case 183 -> 191;
                        case 184 -> 184;
                        case 185 -> 12;
                        case 186 -> 165;
                        case 187 -> 10;
                        case 188 -> 29;
                        case 189 -> 48;
                        case 190 -> 144;
                        case 191 -> 3;
                        case 192 -> 120;
                        case 193 -> 34;
                        case 194 -> 130;
                        case 195 -> 80;
                        case 196 -> 33;
                        case 197 -> 57;
                        case 198 -> 24;
                        case 199 -> 146;
                        case 200 -> 187;
                        case 201 -> 150;
                        case 202 -> 178;
                        case 203 -> 8;
                        case 204 -> 229;
                        case 205 -> 77;
                        case 206 -> 122;
                        case 207 -> 250;
                        case 208 -> 50;
                        case 209 -> 227;
                        case 210 -> 246;
                        case 211 -> 136;
                        case 212 -> 238;
                        case 213 -> 85;
                        case 214 -> 142;
                        case 215 -> 234;
                        case 216 -> 152;
                        case 217 -> 174;
                        case 218 -> 231;
                        case 219 -> 51;
                        case 220 -> 95;
                        case 221 -> 203;
                        case 222 -> 0;
                        case 223 -> 214;
                        case 224 -> 154;
                        case 225 -> 67;
                        case 226 -> 198;
                        case 227 -> 40;
                        case 228 -> 233;
                        case 229 -> 53;
                        case 230 -> 104;
                        case 231 -> 64;
                        case 232 -> 195;
                        case 233 -> 220;
                        case 234 -> 149;
                        case 235 -> 155;
                        case 236 -> 108;
                        case 237 -> 162;
                        case 238 -> 41;
                        case 239 -> 74;
                        case 240 -> 247;
                        case 241 -> 58;
                        case 242 -> 171;
                        case 243 -> 111;
                        case 244 -> 107;
                        case 245 -> 153;
                        case 246 -> 31;
                        case 247 -> 145;
                        case 248 -> 138;
                        case 249 -> 255;
                        case 250 -> 252;
                        case 251 -> 112;
                        case 252 -> 68;
                        case 253 -> 56;
                        case 254 -> 62;
                        default -> 78;
                     };
                     int var5 = (var1 & 0xFF) - var4;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6 = ((var1 & 65535) >>> 8) - var4;
                     if (var6 < 0) {
                        var6 += 256;
                     }

                     for (int var7 = 0; var7 < var3.length; var7++) {
                        int var8 = var7 % 2;
                        char var10002 = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002 ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002 ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ),
         56,
         null);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            "Qr3Unb"
         );
      }
   }

   @Override
   public void aC() {
      Object var82 = null; // PX-FIX
      BlockPos var75 = null; // PX-FIX
      BlockPos var71 = null; // PX-FIX
      Object var68 = null; // PX-FIX
      Object var57 = null; // PX-FIX
      Object var48 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var29 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      Object llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll = null; // PX-FIX
      IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var26;
      label487: {
         label488: {
            String var1;
            label454: {
               label455: {
                  label428: {
                     var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
                     int var10000 = ((int[])IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.W()
                        .ordinal()];
                     if (var1 != null) {
                        switch (var10000) {
                           case 1:
                              var10000 = ((this.aK()) ? 1 : 0);
                              break;
                           case 2:
                              break label428;
                           case 3:
                              break label455;
                           case 4:
                              break label454;
                           default:
                              return;
                        }
                     }

                     label408: {
                        label407: {
                           label406: {
                              if (var1 != null) {
                                 if (var10000 == 0) {
                                    return;
                                 }

                                 var26 = this;
                                 if (var1 == null) {
                                    break label406;
                                 }

                                 var10000 = ((int[])IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.aJ()
                                    .a()
                                    .ordinal()];
                              }

                              switch (var10000) {
                                 case 1:
                                    var26 = this;
                                    break;
                                 case 2:
                                    break label407;
                                 default:
                                    break label408;
                              }
                           }

                           var26.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           );
                           if (var1 != null) {
                              return;
                           }
                        }

                        this.a(
                           IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                           2000
                        );
                     }

                     if (var1 != null) {
                        return;
                     }
                  }

                  this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                  int var2 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII++;
                  var26 = this;
                  if (var1 == null) {
                     break label487;
                  }

                  if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI == null) {
                     var26 = this;
                     break label487;
                  }

                  double var4;
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var27 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                  var12 = var27.b(var10001.a(), false);
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var28 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                  Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                  var4 = var28.a(var10001.a(), false);
                  double var118;
                  var29 = (var118 = ((Double)var12) - 5.0) == 0.0 ? 0 : (var118 < 0.0 ? -1 : 1);
                  label382:
                  if (var1 != null) {
                     if (((Boolean)var29)) {
                        var29 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII % 10;
                        if (var1 == null) {
                           break label382;
                        }

                        label388:
                        if (((Boolean)(var29))) {
                           this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
                           IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var6 = b(this, null, null);
                           IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var30 = var6;
                           if (var1 != null) {
                              if (var6 == null) {
                                 break label388;
                              }

                              var30 = var6;
                           }

                           BlockPos var31 = var30.a();
                           var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                           Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                           var29 = Intrinsics.areEqual(var31, var10001.a());
                           if (var1 == null) {
                              break label382;
                           }

                           if (((Boolean)(var29))) {
                              double var7 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b(var6.a(), false);
                              double var119;
                              var29 = (var119 = var7 - ((Double)var12) / 2.0) == 0.0 ? 0 : (var119 < 0.0 ? -1 : 1);
                              if (var1 == null) {
                                 break label382;
                              }

                              if (((Boolean)var29)) {
                                 label196: {
                                    this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var6;
                                    this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
                                    var26 = this;
                                    if (var1 != null) {
                                       var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                       Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                       var33 = this.a(var10001.a());
                                       if (var33 != null) {
                                          break label196;
                                       }

                                       var26 = this;
                                    }

                                    IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var34 = var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                    Intrinsics.checkNotNull(var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                    var33 = var34.a();
                                 }

                                 label433: {
                                    BlockPos var9 =((BlockPos)( var33));
                                    byte var10 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                       ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                          .e())),
                                       ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var9)),
                                       0,
                                       false);
                                    int var35 = var10;
                                    if (var1 != null) {
                                       if (var10 != 0) {
                                          break label433;
                                       }

                                       var35 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
                                    }

                                    int var11 = var35;
                                    this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var11 + 1;
                                    IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var36 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                    Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                    BlockPos var37 = var36.a();
                                    short var88 = -3463;
                                    short var10002 = -15834;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                       "Walker failed to path, blacklisting berry " + var37
                                    );
                                    HashSet var38 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
                                    var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                    Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                    var38.add(var10001.a());
                                    this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                                    var26 = this;
                                    if (var1 != null) {
                                       if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                                          >= this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI) {
                                          short var40 = -3487;
                                          short var90 = 15899;
                                          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                             "Too many pathfinding failures, lobby hopping..."
                                          );
                                          this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                                          this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
                                          this.a(
                                             IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                             2000
                                          );
                                          this.a(
                                             IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                          );
                                          if (var1 != null) {
                                             return;
                                          }
                                       }

                                       var26 = this;
                                    }

                                    var26.a(
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                    );
                                    if (var1 != null) {
                                       return;
                                    }
                                 }

                                 this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                                 return;
                              }
                           }
                        }
                     }

                     double var120;
                     var29 = (var120 = ((Double)var12) - 5.0) == 0.0 ? 0 : (var120 < 0.0 ? -1 : 1);
                  }

                  label373: {
                     label372: {
                        label434: {
                           if (var1 != null) {
                              if (((Boolean)var29)) {
                                 break label434;
                              }

                              me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .h();
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .c(false);
                              var29 = me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .i();
                           }

                           if (var1 != null) {
                              if (((Boolean)(var29))) {
                                 IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var41 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                 Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                 Vec3 var42 = var41.a().getCenter();
                                 short var108 = -3472;
                                 short var10003 = -19435;
                                 Intrinsics.checkNotNullExpressionValue(var42, "getCenter(...)");
                                 me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var42);
                              }

                              var29 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
                           }

                           if (var1 == null) {
                              break label373;
                           }

                           if (!((Boolean)var29)) {
                              break label372;
                           }

                           var26 = this;
                           if (var1 != null) {
                              if (this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll != null) {
                                 break label372;
                              }

                              var26 = this;
                           }

                           var26.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = true;
                           me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(null);
                           if (var1 != null) {
                              break label372;
                           }
                        }

                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                           .c(true);
                     }

                     double var121;
                     var29 = (var121 = ((Double)var12) - 3.5) == 0.0 ? 0 : (var121 < 0.0 ? -1 : 1);
                  }

                  if (var1 != null) {
                     if (((Boolean)var29)) {
                        IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var44 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                        Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                        int var45 = ((var44.b().is(Blocks.FLOWERING_AZALEA)) ? 1 : 0);
                        if (var1 != null) {
                           if (var45 == 0) {
                              this.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                              );
                              return;
                           }

                           double var122;
                           var45 = (var122 = var4 - 3.5) == 0.0 ? 0 : (var122 < 0.0 ? -1 : 1);
                        }

                        if (var1 != null) {
                           if (var45 < 0) {
                              label344: {
                                 IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var46 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e();
                                 if (var1 != null) {
                                    if (var46.d()) {
                                       break label344;
                                    }

                                    var46 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                       .e();
                                 }

                                 var46.k();
                              }

                              this.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                              );
                              if (var1 != null) {
                                 return;
                              }
                           }

                           var45 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .d()) ? 1 : 0);
                        }

                        if (var45 == 0) {
                           return;
                        }

                        label335: {
                           var26 = this;
                           if (var1 != null) {
                              var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                              Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                              var48 = this.a(var10001.a());
                              if (var48 != null) {
                                 break label335;
                              }

                              var26 = this;
                           }

                           IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var49 = var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                           Intrinsics.checkNotNull(var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                           var48 = var49.a();
                        }

                        BlockPos var17 =((BlockPos)( var48));
                        double var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var17, false);
                        double var123;
                        int var50 = (var123 = var19 - 1.0) == 0.0 ? 0 : (var123 < 0.0 ? -1 : 1);
                        if (var1 != null) {
                           if (var50 < 0) {
                              return;
                           }

                           var50 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                              ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e())),
                              ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var17)),
                              0,
                              false);
                        }

                        int var21 = var50;
                        if (var1 != null) {
                           if (var21 == 0) {
                              int var23 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl++;
                              IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var51 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                              Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                              BlockPos var52 = var51.a();
                              short var92 = -3476;
                              short var109 = -32599;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "Walker failed to path, blacklisting berry " + var52
                              );
                              HashSet var53 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
                              var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                              Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                              var53.add(var10001.a());
                              this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                              var26 = this;
                              if (var1 != null) {
                                 if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                                    >= this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI) {
                                    short var55 = -3482;
                                    short var94 = -20439;
                                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                       "Too many pathfinding failures, lobby hopping..."
                                    );
                                    this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                                    this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
                                    this.a(
                                       IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                       2000
                                    );
                                    this.a(
                                       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                    );
                                    if (var1 != null) {
                                       return;
                                    }
                                 }

                                 var26 = this;
                              }

                              var26.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                              );
                              if (var1 != null) {
                                 return;
                              }
                           }

                           this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                        }

                        if (var1 != null) {
                           return;
                        }
                     }

                     var29 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .d();
                  }

                  if (((Boolean)(var29))) {
                     return;
                  }

                  label326: {
                     var26 = this;
                     if (var1 != null) {
                        var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                        Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                        var57 = this.a(var10001.a());
                        if (var57 != null) {
                           break label326;
                        }

                        var26 = this;
                     }

                     IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var58 = var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                     Intrinsics.checkNotNull(var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                     var57 = var58.a();
                  }

                  BlockPos var18 =((BlockPos)( var57));
                  double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var18, false);
                  double var124;
                  int var59 = (var124 = var20 - 1.0) == 0.0 ? 0 : (var124 < 0.0 ? -1 : 1);
                  if (var1 != null) {
                     if (var59 < 0) {
                        return;
                     }

                     var59 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                        ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e())),
                        ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var18)),
                        0,
                        false);
                  }

                  int var22 = var59;
                  if (var1 != null) {
                     if (var22 == 0) {
                        int var24 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl++;
                        IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var60 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                        Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                        BlockPos var61 = var60.a();
                        short var96 = -3476;
                        short var110 = -32599;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                           "Walker failed to path, blacklisting berry " + var61
                        );
                        HashSet var62 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
                        var10001 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                        Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                        var62.add(var10001.a());
                        this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
                        var26 = this;
                        if (var1 != null) {
                           if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                              >= this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI) {
                              short var64 = -3482;
                              short var98 = -20439;
                              me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                                 "Too many pathfinding failures, lobby hopping..."
                              );
                              this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                              this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
                              this.a(
                                 IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                                 2000
                              );
                              this.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              );
                              if (var1 != null) {
                                 return;
                              }
                           }

                           var26 = this;
                        }

                        var26.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        );
                        if (var1 != null) {
                           return;
                        }
                     }

                     this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                  }

                  if (var1 != null) {
                     return;
                  }
               }

               BlockPos var65 = a(this, 0.0, 1, null);
               IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
               Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
               boolean var13 = Intrinsics.areEqual(var65, var99.a());
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var66 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
               Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
               List var3 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                  var66, var99.a(), CollectionsKt.emptyList(), null, 0.0, 0.0, 0.0);
               if (var1 == null) {
                  return;
               }

               me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var67 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
               Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
               if (!(var67.b(var99.a(), false) > 4.0)) {
                  var68 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
                  if (var1 == null) {
                     break label488;
                  }

                  label315:
                  if (!((java.util.function.Supplier<Boolean>)(() -> { this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(3000); return false; })).get()) {
                     boolean var69 = var3.isEmpty();
                     if (var1 != null) {
                        if (var69) {
                           break label315;
                        }

                        var69 = var13;
                     }

                     if (var1 != null) {
                        label302:
                        if (!var69) {
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .k();
                           me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var70 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                           Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                           Vec3 var103 = var99.a().getCenter();
                           short var114 = -3480;
                           short var10004 = 3120;
                           Intrinsics.checkNotNullExpressionValue(var103, "getCenter(...)");
                           BlockPos var15 = ((me.octo.client.PXDyn)(Object)(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                 var70, var103, null, null)
                              )).c();
                           var71 = var15;
                           label281:
                           if (var1 != null) {
                              if (var15 != null) {
                                 ClientLevel var72 = this.ap().level;
                                 Intrinsics.checkNotNull(var72);
                                 net.minecraft.world.level.block.state.BlockState var71b = var72.getBlockState(var15);
                                 if (var1 == null) {
                                    break label281;
                                 }

                                 label285:
                                 if (var71b.is(Blocks.FLOWERING_AZALEA)) {
                                    label295: {
                                       var26 = this;
                                       if (var1 != null) {
                                          ClientLevel var74 = this.ap().level;
                                          Intrinsics.checkNotNull(var74);
                                          if (var74.getBlockState(var15).is(Blocks.FLOWERING_AZALEA)) {
                                             var75 = var15;
                                             if (var1 == null) {
                                                break label295;
                                             }

                                             var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                             Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                             if (!Intrinsics.areEqual(var15, var99.a())) {
                                                break label285;
                                             }
                                          }

                                          var26 = this;
                                       }

                                       IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var76 = var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                                       Intrinsics.checkNotNull(var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                                       var75 = var76.a();
                                    }

                                    Vec3 var77 = var75.getCenter();
                                    short var111 = -3480;
                                    var114 = 3120;
                                    Intrinsics.checkNotNullExpressionValue(var77, "getCenter(...)");
                                    me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var77);
                                    break label302;
                                 }
                              }

                              var71 = ((BlockPos)(CollectionsKt.first(var3)));
                           }

                           me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a((Vec3)(Object)var71);
                        }

                        var69 = var13;
                     }

                     if (var1 != null) {
                        if (var69) {
                           Minecraft var78 = this.ap();
                           var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                           Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                           var78.hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                              var99.a()
                           );
                           me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .j();
                           int var16 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII++;
                           Map var79 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
                           var99 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
                           Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
                           var79.put(var99.a(), System.currentTimeMillis() + 10000L);
                           this.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                           );
                           this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                           this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
                           this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                           me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g();
                           if (var1 != null) {
                              return;
                           }
                        }

                        var69 = me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .i();
                     }

                     if (var69) {
                        return;
                     }

                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     );
                     this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
                     if (var1 != null) {
                        return;
                     }
                     break label454;
                  }
               }

               IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var117 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
               Intrinsics.checkNotNull(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
               this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = b(this, null, var117.a(), 1, null);
               this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               );
               var68 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
               break label488;
            }

            label224: {
               label223: {
                  var26 = this;
                  if (var1 != null) {
                     if (this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll != null) {
                        label218: {
                           if (this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll != null) {
                              BlockState var81 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.b();
                              if (var81 != null) {
                                 var82 = var81.is(Blocks.FLOWERING_AZALEA);
                                 if (var1 != null) {
                                    var82 = !((Boolean)var82);
                                 }
                                 break label218;
                              }
                           }

                           var82 = false;
                        }

                        if (!((Boolean)var82)) {
                           break label223;
                        }
                     }

                     this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
                     var26 = this;
                  }

                  var26.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = b(this, null, null);
                  if (var1 != null) {
                     break label224;
                  }
               }

               this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
               this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
            }

            label207: {
               label206: {
                  var26 = this;
                  if (var1 != null) {
                     if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI == null) {
                        int var14 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl++;
                        var26 = this;
                        if (var1 == null) {
                           break label207;
                        }

                        if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
                           >= this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI) {
                           short var107 = -3473;
                           short var112 = 16986;
                           var112 = -3474;
                           short var116 = 29514;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "Failed to find berry "
                                 + this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI
                                 + " times, lobby hopping..."
                           );
                           this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
                           this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
                           this.a(
                              IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                              2000
                           );
                           this.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           );
                           return;
                        }
                        break label206;
                     }

                     var26 = this;
                  }

                  var26.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
               }

               var26 = this;
            }

            var26.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            );
            return;
         }

         this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
         return;
      }

      var26.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -3464;
      short var10003 = 30781;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 != null && this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null) {
         BlockPos var5 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a();
         if (var5 != null) {
            BlockPos var3 = var5;
            boolean var4 = false;
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               var3,
               null,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .o()
               ),
               1.5F,
               null,
               null,
               0.0F,
               false,
               0.0F);
         }
      }
   }

   private final BlockPos b(double var1) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      LocalPlayer var10001 = this.ap().player;
      Intrinsics.checkNotNull(var10001);
      Entity var8 = var10001;
      LocalPlayer var10004 = this.ap().player;
      Intrinsics.checkNotNull(var10004);
      float var11 = var10004.getYRot();
      LocalPlayer var10005 = this.ap().player;
      Intrinsics.checkNotNull(var10005);
      HitResult var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var8, var1, 1.0F, var11, var10005.getXRot()
      );
      String var3 = var10000;
      HitResult var6 = var4;
      if (var3 != null) {
         if (var4.getType() != Type.BLOCK) {
            return null;
         }

         short var9 = -3459;
         short var10002 = 16068;
         Intrinsics.checkNotNull(var4, "null cannot be cast to non-null type net.minecraft.world.phys.BlockHitResult");
         var6 = var4;
      }

      BlockPos var7 = ((BlockHitResult)var6).getBlockPos();
      short var10 = -3471;
      short var10003 = 13738;
      Intrinsics.checkNotNullExpressionValue(var7, "getBlockPos(...)");
      return var7;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   public final IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a(@Nullable Integer var1, @Nullable BlockPos var2) {
      String var3 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var3 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var7 = var10000;
            boolean var8 = false;
            if (var3 != null) {
               Vec3 var22 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
               if (var22 != null) {
                  Vec3 var4 = var22;
                  if (var3 != null) {
                     ClientLevel var23 = this.ap().level;
                     if (var23 != null) {
                        ClientLevel var5;
                        label83: {
                           var5 = var23;
                           Iterable var17 = this.a(
                              var3 != null && var1 != null
                                 ? var1
                                 : lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a()
                                    .M(),
                              var2
                           );
                           var8 = false;
                           Iterator var9 = var17.iterator();
                           var10000 = ((LocalPlayer)(Object)(var9));
                           if (var3 != null) {
                              if (!var9.hasNext()) {
                                 var10000 = null;
                                 break label83;
                              }

                              var10000 = (LocalPlayer)var9.next();
                           }

                           Object var10 = var10000;
                           var10000 = ((LocalPlayer)(Object)(var9));
                           if (var3 != null) {
                              if (!var9.hasNext()) {
                                 var10000 = (LocalPlayer)var10;
                                 break label83;
                              }

                              var10000 = (LocalPlayer)var10;
                           }

                           BlockPos var11 = (BlockPos)(Object)var10000;
                           boolean var13 = false;
                           double var19 = var11.distToCenterSqr(var4);

                           label50:
                           while (true) {
                              Object var20 = var9.next();
                              BlockPos var14 = (BlockPos)var20;
                              boolean var16 = false;
                              double var21 = var14.distToCenterSqr(var4);
                              if (Double.compare(var19, var21) > 0) {
                                 var10 = var20;
                                 var19 = var21;
                              }

                              while (!var9.hasNext()) {
                                 if (var3 != null) {
                                    var10000 = (LocalPlayer)var10;
                                    break label50;
                                 }

                                 var19 = var21;
                              }
                           }
                        }

                        BlockPos var27 = (BlockPos)(Object)var10000;
                        if ((BlockPos)(Object)var10000 == null) {
                           return null;
                        }

                        BlockPos var6 = var27;
                        BlockState var10003 = var5.getBlockState(var6);
                        short var10005 = -3486;
                        short var10006 = -29815;
                        Intrinsics.checkNotNullExpressionValue(var10003, "getBlockState(...)");
                        return new IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll(var6, var10003);
                     }
                  }

                  return null;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   public final IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll b(@Nullable Integer var1, @Nullable BlockPos var2) {
      BlockPos var24 = null; // PX-FIX
      List var22 = null; // PX-FIX
      String var3 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var3 != null) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var4 = var10000;
            if (var3 != null) {
               LocalPlayer var19 = this.ap().player;
               if (var19 != null) {
                  LocalPlayer var9 = var19;
                  int var10 = 0;
                  if (var3 != null) {
                     Vec3 var20 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var9);
                     if (var20 != null) {
                        Vec3 var5 = var20;
                        List var6 = this.a(
                           var3 != null && var1 != null
                              ? var1
                              : lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                                 .M(),
                           var2
                        );
                        var10000 = ((ClientLevel)(Object)(var6));
                        if (var3 != null) {
                           if (var6.isEmpty()) {
                              return null;
                           }

                           var10000 = ((ClientLevel)(Object)(var6));
                        }

                        List var8 = ((List)(Object)(var10000));
                        boolean var15 = false;
                        List var7 = CollectionsKt.sortedWith(
                           var8,
                           new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                              var5
                           )
                        );
                        var8 = CollectionsKt.take(var7, 5);
                        BlockPos var16 = null;
                        var10 = Integer.MAX_VALUE;
                        Iterator var11 = var8.iterator();

                        label63: {
                           while (true) {
                              if (var11.hasNext()) {
                                 BlockPos var12 = (BlockPos)var11.next();
                                 List var13 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(
                                    me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    var12,
                                    false);
                                 var22 = var13;
                                 if (var3 == null) {
                                    break;
                                 }

                                 if (var3 != null) {
                                    if (var13 == null) {
                                       continue;
                                    }

                                    var22 = var13;
                                 }

                                 int var23 = var22.size();
                                 if (var3 != null) {
                                    if (var23 >= var10) {
                                       continue;
                                    }

                                    var23 = var13.size();
                                 }

                                 var10 = var23;
                                 var16 = var12;
                                 if (var3 != null) {
                                    continue;
                                 }
                              }

                              var24 = var16;
                              if (var3 == null) {
                                 break label63;
                              }

                              if (var16 != null) {
                                 BlockState var10003 = var4.getBlockState(var16);
                                 short var10005 = -3486;
                                 short var10006 = -29815;
                                 Intrinsics.checkNotNullExpressionValue(var10003, "getBlockState(...)");
                                 return new IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll(var16, var10003);
                              }

                              var22 = ((List)(CollectionsKt.first(var7)));
                              break;
                           }

                           var24 = (BlockPos)var22;
                        }

                        BlockPos var18 = var24;
                        BlockState var25 = var4.getBlockState(var18);
                        short var26 = -3486;
                        short var27 = -29815;
                        Intrinsics.checkNotNullExpressionValue(var25, "getBlockState(...)");
                        return new IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll(var18, var25);
                     }
                  }
               }
            }

            return null;
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos a(BlockPos var1) {
      Object var39 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var2 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var7 = var10000;
            int var8 = 0;
            if (var2 != null) {
               Vec3 var30 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
               if (var30 != null) {
                  Vec3 var3 = var30;
                  BlockPos var31 = var1.offset(0, -1, 0);
                  short var10002 = -3475;
                  short var10003 = -25274;
                  Intrinsics.checkNotNullExpressionValue(var31, "offset(...)");
                  BlockPos var4 = var31;
                  List var5 = new ArrayList();
                  int var6 = -1;

                  label187:
                  while (true) {
                     int var32 = var6;

                     label185:
                     while (true) {
                        if (var32 >= 2) {
                           break label187;
                        }

                        int var18 = -1;

                        while (var18 < 2) {
                           var32 = var6;
                           if (var2 == null) {
                              continue label185;
                           }

                           label179: {
                              label201: {
                                 label177:
                                 if (var2 != null) {
                                    if (var6 == 0) {
                                       var32 = var18;
                                       if (var2 == null) {
                                          break label177;
                                       }

                                       if (var18 == 0) {
                                          break label201;
                                       }
                                    }

                                    var32 = -1;
                                 }

                                 var8 = var32;

                                 while (var8 < 2) {
                                    BlockPos var33 = var4.offset(var6, var8, var18);
                                    var10002 = -3460;
                                    var10003 = 2698;
                                    Intrinsics.checkNotNullExpressionValue(var33, "offset(...)");
                                    BlockPos var9 = var33;
                                    if (var2 == null) {
                                       break label179;
                                    }

                                    label165: {
                                       if (var2 != null) {
                                          ClientLevel var34 = this.ap().level;
                                          if (var34 != null) {
                                             ClientLevel var10;
                                             label161: {
                                                label204: {
                                                   var10 = var34;
                                                   BlockState var35 = var10.getBlockState(var9);
                                                   var10002 = -3486;
                                                   var10003 = -29815;
                                                   Intrinsics.checkNotNullExpressionValue(var35, "getBlockState(...)");
                                                   BlockState var12 = var35;
                                                   var36 = var12.isAir();
                                                   if (var2 != null) {
                                                      if (((Boolean)(var36))) {
                                                         break label204;
                                                      }

                                                      var36 = var12.getCollisionShape(var10, var9).isEmpty();
                                                   }

                                                   if (var2 != null) {
                                                      if (((Boolean)(var36))) {
                                                         break label204;
                                                      }

                                                      var36 = var12.liquid();
                                                   }

                                                   if (var2 == null) {
                                                      break label161;
                                                   }

                                                   if (!((Boolean)var36)) {
                                                      var36 = true;
                                                      break label161;
                                                   }
                                                }

                                                var36 = false;
                                             }

                                             boolean var13 =((Boolean)( var36));
                                             BlockState var37 = var10.getBlockState(var9.offset(0, 1, 0));
                                             var10002 = -3486;
                                             var10003 = -29815;
                                             Intrinsics.checkNotNullExpressionValue(var37, "getBlockState(...)");
                                             BlockState var15 = var37;
                                             BlockState var38 = var10.getBlockState(var9.offset(0, 2, 0));
                                             var10002 = -3486;
                                             var10003 = -29815;
                                             Intrinsics.checkNotNullExpressionValue(var38, "getBlockState(...)");
                                             BlockState var16 = var38;
                                             if (var2 == null) {
                                                break label165;
                                             }

                                             label145:
                                             if (var13) {
                                                var39 = var15.isAir();
                                                label143:
                                                if (var2 != null) {
                                                   if (!((Boolean)var39)) {
                                                      var39 = Intrinsics.areEqual(var15, Blocks.SHORT_GRASS);
                                                      if (var2 == null) {
                                                         break label143;
                                                      }

                                                      if (!((Boolean)var39)) {
                                                         var39 = Intrinsics.areEqual(var15, Blocks.SHORT_DRY_GRASS);
                                                         if (var2 == null) {
                                                            break label143;
                                                         }

                                                         if (!((Boolean)var39)) {
                                                            break label145;
                                                         }
                                                      }
                                                   }

                                                   var39 = var16.isAir();
                                                }

                                                if (var2 != null
                                                   && (
                                                      ((Boolean)var39)
                                                         || var2 != null
                                                            && (
                                                               Intrinsics.areEqual(var16, Blocks.SHORT_GRASS)
                                                                  || var2 != null && Intrinsics.areEqual(var16, Blocks.SHORT_DRY_GRASS)
                                                            )
                                                   )) {
                                                   var5.add(var9);
                                                }
                                             }
                                          }
                                       }

                                       var8++;
                                    }

                                    if (var2 == null) {
                                       break;
                                    }
                                 }
                              }

                              var18++;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var6++;
                        if (var2 == null) {
                           break label187;
                        }
                        break;
                     }
                  }

                  Iterable var17 = var5;
                  boolean var19 = false;
                  Iterator var21 = var17.iterator();
                  var10000 = ((LocalPlayer)(Object)(var21));
                  if (var2 != null) {
                     if (!var21.hasNext()) {
                        return (BlockPos)null;
                     }

                     var10000 = (LocalPlayer)var21.next();
                  }

                  Object var22 = var10000;
                  var10000 = ((LocalPlayer)(Object)(var21));
                  if (var2 != null) {
                     if (!var21.hasNext()) {
                        return (BlockPos)var22;
                     }

                     var10000 = (LocalPlayer)var22;
                  }

                  BlockPos var23 = (BlockPos)(Object)var10000;
                  boolean var25 = false;
                  double var24 = var23.distToCenterSqr(var3);

                  while (true) {
                     Object var26 = var21.next();
                     BlockPos var27 = (BlockPos)var26;
                     boolean var29 = false;
                     double var28 = var27.distToCenterSqr(var3);
                     if (Double.compare(var24, var28) > 0) {
                        var22 = var26;
                        var24 = var28;
                     }

                     while (!var21.hasNext()) {
                        if (var2 != null) {
                           return (BlockPos)var22;
                        }

                        var24 = var28;
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @NotNull
   public final List<BlockPos> a(int var1, @Nullable BlockPos var2) {
      Object var32 = null; // PX-FIX
      String var3 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var3 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var4 = var10000;
            if (var3 != null) {
               ClientLevel var30 = this.ap().level;
               if (var30 != null) {
                  ClientLevel var5 = var30;
                  Vec3 var6 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4);
                  int var7 = var4.getBlockY();
                  int var8 = var4.chunkPosition().x();
                  int var9 = var4.chunkPosition().z();
                  int var10 = (var1 >> 4) + 1;
                  double var11 = (double)var1 * var1;
                  int var13 = (var10 + 1) * (var10 + 1);
                  int var14 = RangesKt.coerceAtLeast(
                     var7 - this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII, var5.getMinY()
                  );
                  int var15 = RangesKt.coerceAtMost(
                     var7 + this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII, var5.getMaxY()
                  );
                  long var16 = System.currentTimeMillis();
                  this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII
                     .entrySet()
                     .removeIf(null);
                  ArrayList var18 = new ArrayList();
                  int var19 = var8 - var10;
                  int var20 = var8 + var10;
                  int var31 = var19;
                  int var10001 = var20;
                  if (var3 != null) {
                     if (var19 > var20) {
                        return var18;
                     }

                     var31 = var19;
                     var10001 = var8;
                  }

                  while (true) {
                     label133: {
                        int var21 = var31 - var10001;
                        int var22 = var9 - var10;
                        int var23 = var9 + var10;
                        if (var22 <= var23) {
                           do {
                              int var24 = var22 - var9;
                              var32 = var21 * var21 + var24 * var24;
                              var10001 = var13;
                              if (var3 == null) {
                                 break label133;
                              }

                              label109: {
                                 label108:
                                 if (((Integer)var32) <= (((var13 != 0) ? 1 : 0))) {
                                    long var25 = this.a(var19, var22);
                                    List var33 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.get(var25);
                                    if (var3 == null) {
                                       return var33;
                                    }

                                    label105: {
                                       List var35 = var33;
                                       if (var3 != null) {
                                          if (var33 != null) {
                                             break label105;
                                          }

                                          if (var3 == null) {
                                             break label108;
                                          }

                                          var33 = this.a(var5, var19,((Integer)( var22)), var14, var15, var25);
                                          var35 = var33;
                                       }

                                       if (var35 == null) {
                                          break label108;
                                       }
                                    }

                                    for (BlockPos var29 : (List<BlockPos>)var33) {
                                       var32 = Intrinsics.areEqual(var29, var2);
                                       if (var3 == null) {
                                          break label109;
                                       }

                                       if (var3 != null) {
                                          if (!((Boolean)var32)) {
                                             continue;
                                          }

                                          var32 = this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.contains(var29);
                                       }

                                       if (var3 != null) {
                                          if (!((Boolean)var32)) {
                                             continue;
                                          }

                                          var32 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.containsKey(var29);
                                       }

                                       if (var3 != null) {
                                          if (!((Boolean)var32)) {
                                             continue;
                                          }

                                          double var36;
                                          var32 = (var36 = var29.distToCenterSqr(var6) - var11) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
                                       }

                                       if (var3 != null) {
                                          if (((Boolean)var32)) {
                                             continue;
                                          }

                                          var18.add(var29);
                                       }

                                       if (var3 == null) {
                                          break;
                                       }
                                    }
                                 }

                                 var32 = var22;
                              }

                              var10001 = var23;
                              if (var3 == null) {
                                 break label133;
                              }

                              if ((Boolean)var32 == ((var23 == 0))) {
                                 break;
                              }

                              var22++;
                           } while (var3 != null);
                        }

                        var32 = var19;
                        var10001 = var20;
                     }

                     if ((Boolean)var32 == ((var10001 == 0))) {
                        break;
                     }

                     var19++;
                     if (var3 == null) {
                        break;
                     }

                     var31 = var19;
                     var10001 = var8;
                  }

                  return var18;
               }
            }

            return CollectionsKt.emptyList();
         }
      }

      return CollectionsKt.emptyList();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final List<BlockPos> a(Level var1, int var2, int var3, int var4, int var5, long var6) {
      String var8 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var8 != null) {
         ChunkAccess var10000 = var1.getChunk(var2, var3, ChunkStatus.FEATURES, false);
         if (var10000 != null) {
            ArrayList var13;
            label87: {
               ChunkAccess var9 = var10000;
               int var10 = var2 << 4;
               int var11 = var3 << 4;
               MutableBlockPos var12 = new MutableBlockPos();
               var13 = new ArrayList();
               int var14 = var4;
               int var15;
               int var19;
               if (var8 != null) {
                  if (var4 > var5) {
                     break label87;
                  }

                  var15 = 0;
                  var19 = var15;
               } else {
                  var15 = var4;
                  var19 = var4;
               }

               label86:
               while (true) {
                  int var20;
                  if (var19 < 16) {
                     var20 = 0;
                     if (var8 != null) {
                        int var16 = 0;

                        while (var16 < 16) {
                           var12.set(var10 + var15, var14, var11 + var16);
                           BlockState var21 = var9.getBlockState(var12);
                           short var10002 = -3461;
                           short var10003 = -16370;
                           Intrinsics.checkNotNullExpressionValue(var21, "getBlockState(...)");
                           BlockState var17 = var21;
                           if (var8 != null) {
                              var19 = ((var17.is(Blocks.FLOWERING_AZALEA)) ? 1 : 0);
                              if (var8 == null) {
                                 continue label86;
                              }

                              if (var19 != 0) {
                                 boolean var22 = lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.contains(var12);
                                 if (var8 != null) {
                                    if (!var22) {
                                       var13.add(var12.immutable());
                                    }
                                 }
                              }

                              var16++;
                           }

                           if (var8 == null) {
                              break;
                           }
                        }

                        var15++;
                        if (var8 != null) {
                           var19 = var15;
                           continue;
                        }

                        var20 = var14;
                     }
                  } else {
                     var20 = var14;
                  }

                  if (var20 == var5) {
                     break;
                  }

                  var14++;
                  if (var8 == null) {
                     break;
                  }

                  var15 = 0;
                  var19 = var15;
               }
            }

            List var18 = CollectionsKt.toList(var13);
            if (var8 != null) {
               List var23 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.putIfAbsent(var6, var18);
               if (var23 != null) {
                  return var23;
               }
            }

            return var18;
         }
      }

      return null;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1) {
      boolean var29 = false; // PX-FIX
      Object var27 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -3464;
      short var10003 = 30781;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 != null) {
         BlockPos var22 = var1.k();
         if (var22 != null) {
            BlockPos var3 = var22;
            long var4 = this.a(var3.getX() >> 4, var3.getZ() >> 4);
            if (var2 != null) {
               List var23 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.get(var4);
               if (var23 != null) {
                  List var6;
                  label126: {
                     var6 = var23;
                     if (var2 != null) {
                        BlockState var24 = var1.l();
                        if (var24 != null) {
                           var25 = var24.is(Blocks.FLOWERING_AZALEA);
                           if (var2 != null) {
                              ;
                           }
                           break label126;
                        }
                     }

                     var25 = false;
                  }

                  boolean var7;
                  label120: {
                     var7 =((Boolean)( var25));
                     if (var2 != null) {
                        BlockState var26 = var1.m();
                        if (var26 != null) {
                           var27 = var26.is(Blocks.FLOWERING_AZALEA);
                           if (var2 != null) {
                              ;
                           }
                           break label120;
                        }
                     }

                     var27 = false;
                  }

                  boolean var8 =((Boolean)( var27));
                  if (var7 == var8) {
                     return;
                  }

                  BlockPos var9;
                  BlockPos var28 = var3.immutable();
                  var10002 = -3483;
                  var10003 = -21880;
                  Intrinsics.checkNotNullExpressionValue(var28, "immutable(...)");
                  var9 = var28;
                  var29 = var7;
                  label112:
                  if (var2 != null) {
                     if (!var7) {
                        var29 = var8;
                        if (var2 == null) {
                           break label112;
                        }

                        if (var8) {
                           label138: {
                              boolean var30 = lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.contains(var9);
                              if (var2 != null) {
                                 if (var30) {
                                    return;
                                 }

                                 if (var2 == null) {
                                    break label138;
                                 }

                                 var30 = var6.contains(var9);
                              }

                              if (var30) {
                                 return;
                              }

                              this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI
                                 .put(var4, CollectionsKt.plus(var6, var9));
                           }

                           if (var2 != null) {
                              return;
                           }
                        }
                     }

                     var29 = var7;
                  }

                  if (var2 != null) {
                     if (!var29) {
                        return;
                     }

                     var29 = var8;
                  }

                  if (var2 != null) {
                     if (var29) {
                        return;
                     }

                     var29 = var6.contains(var9);
                  }

                  if (!var29) {
                     return;
                  }

                  Map var10 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
                  Long var11 = var4;
                  Iterable var12 = var6;
                  boolean var13 = false;
                  var var15 = new ArrayList();
                  boolean var16 = false;

                  for (Object var18 : var12) {
                     BlockPos var19 = (BlockPos)var18;
                     boolean var20 = false;
                     if (var2 == null) {
                        return;
                     }

                     boolean var31 = Intrinsics.areEqual(var19, var9);
                     if (var2 != null) {
                        if (var31) {
                           continue;
                        }

                        var15.add(var18);
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  List var21 = var15;
                  var10.put(var11, var21);
                  return;
               }
            }

            return;
         }
      }
   }

   @SubscribeEvent
   public final void b(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -3462;
      short var10002 = -15547;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.clear();
   }

   public final void bc() {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               (kotlin.jvm.functions.Function1)(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl::g),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl::h),
               120,
               null
            )
         );
   }

   private final void bd() {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = null;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = false;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Override
   public void M() {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      this.aM();
      String var1 = var10000;
      if (var1 != null) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )
          {
            this.b(
               CollectionsKt.listOf(
                  IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               )
            );
            this.N();
            return;
         }

         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.clear();
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.clear();
         super.M();
      }

      llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var2 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl::be,
            true
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl::bf,
            false
         ),
         new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl::bg,
            false
         )
      };
      this.a(CollectionsKt.listOf(var2));
      this.bc();
   }

   @Override
   public void N() {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.clear();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.clear();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.clear();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      this.aN();
      super.N();
   }

   @Override
   public void ah() {
      this.bc();
   }

   @Override
   public void aB() {
      this.bc();
   }

   @Override
   public void aH() {
      this.bc();
   }

   private static final long a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var0.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl,
         var0.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.size(),
         var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null
            ? var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a()
            : null,
         var0.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll != null
            ? var0.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.a()
            : null,
         var0.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
      );
   }

   private static final Object d(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null
            ? var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a()
            : null,
         var0.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll != null
            ? var0.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.a()
            : null,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         var0.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final Object e(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII,
         var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI != null
            ? var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.a()
            : null,
         a(var0, 0.0, 1, null),
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .i()
      );
   }

   private static final Unit f(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      Integer var10002 = 20;
      IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll var10003 = var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
      Intrinsics.checkNotNull(var0.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
      var0.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var0.b(var10002, var10003.a());
      var0.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = false;
      return Unit.INSTANCE;
   }

   private static final boolean a(long var0, Entry var2) {
      String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -3458;
      short var10003 = -29684;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;
      long var5;
      int var4 = (var5 = ((Number)var2.getValue()).longValue() - var0) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var3 != null) {
         var4 = var4 <= 0 ? 1 : 0;
      }

      return (var4 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit g(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      var0.bc();
      return Unit.INSTANCE;
   }

   private static final Unit h(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0) {
      var0.bd();
      return Unit.INSTANCE;
   }

   private static final boolean be() {
      return lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .b();
   }

   private static final boolean bf() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bg() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   @NotNull
   public static final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl bh() {
      return lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.a();
   }

    // --- W7-4: hand-written synthetic bridges/accessors (jar flags 0x1008/0x1019) ---
    // javac cannot emit ACC_SYNTHETIC/ACC_BRIDGE; acceptance is descriptor-exact (name+descriptor).
    static net.minecraft.core.BlockPos a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0, double var1, int var3, Object var4) {   /* flags 0x1008 static synthetic default-arg bridge; default 5.0 */
        if ((var3 & 1) != 0) {
            var1 = 5.0d;
        }
        return var0.b(var1);
    }

    public static IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0, Integer var1, BlockPos var2, int var3, Object var4) {   /* flags 0x1009 default-arg bridge */
        String var5 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
        if (var5 != null) {
            if ((var3 & 1) != 0) {
                var1 = null;
            }
            if ((var3 & 2) != 0) {
                var2 = null;
            }
        } else if ((var3 & 1) != 0) {
            var2 = null;
        }
        return var0.a(var1, var2);
    }

    public static IlIIllIIlIlIlIllIIIlIIIlIIIllIlIlIIIlIIlIIIIIlllIIlllllIIlIllIIllIIIIlIIIIlIIIlIIIIll b(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0, Integer var1, BlockPos var2, int var3, Object var4) {   /* flags 0x1009 default-arg bridge */
        String var5 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
        if (var5 != null) {
            if ((var3 & 1) != 0) {
                var1 = null;
            }
            if ((var3 & 2) != 0) {
                var2 = null;
            }
        } else if ((var3 & 1) != 0) {
            var2 = null;
        }
        return var0.b(var1, var2);
    }

    public static java.util.List a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0, int var1, BlockPos var2, int var3, Object var4) {   /* flags 0x1009 default-arg bridge; default 300 */
        String var5 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
        if (var5 != null) {
            if ((var3 & 1) != 0) {
                var1 = 300;
            }
            if ((var3 & 2) != 0) {
                var2 = null;
            }
        } else if ((var3 & 1) != 0) {
            var2 = null;
        }
        return var0.a(var1, var2);
    }

    public static final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl bi() { return IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll; }   /* flags 0x1019 -> public static final; ACC_SYNTHETIC unreproducible */

    public static final java.util.Set bj() { return lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl; }   /* flags 0x1019 -> public static final; ACC_SYNTHETIC unreproducible */

    public static final void a(IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) { var0.a(var1); }   /* flags 0x1019 static synthetic lambda body */

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "fsØ\u0006S»\u0017Ü6\u00916æ=Þ\b\u0011ç5ý*¥`ú\nÌ´\nÏÓÛ\u0081[Â¡\fð~\u008d\u0096#ð\u0086%\u0017\u0005(£*\u0094¾¨\u0013F(á2%ng;WN\u001bÞRËØMþ\u0012ÆbrÔò|P¼sEÍ\u0002Z®þ\u007fa\u0083W¬\u000b\u0013Ðm!µs\u0097×\u00adÔ\u0095\u0018\tG\u0087\u009d\u0006>å\u0097%RÅ}Ñai;ÓwºÀ´øo1\u0015®ÒÙ\u0099Í\u0088\u0090à\u0005-¦?.\u0007+6Ïx\u0095tn\n\u000b°òOÌËb_¦ç/êÇ\u0007¸ØluÔqW\u00897*º$ÏOÑ¸'Td\u0093¤±r\u009b0Q¿üÐ\u0003§@ÎZ\fâC\u0090¿o\u0088\u008bVc\u0012¨\u009b\u0001\u001aa\u0018n\u0087Íi\u0003tv\u009cDÌ¦¹\nüä\fÅ\u0013\u009a\u0087yÐ¥\u000b\u0087¡cmþ\u008f\u0004Ù[ïé\u000ey\u0010íUÞ.\u0083\u0089g\u0013é¶ÆÔ/ÑB`\b4zè\u0016Â\u000fÿ<äÛýãtTß\u0097¸r\u000ef\u0002*í;\u009fÞ%ü8\"'~¶\u001a\u007f\u0081#ç\u0019\u0083E7º\u0007\rÏ\u0094r¡µB\u0005\u0088\u0097VÆ *N¯ó1-l\u008cº\u0088\u007fÒ\u0019á\nÍV\u0088Ú\u0083o\u0095V«êßÅG^æø¥Í\u0017\u0013\u0001\u008c\u0095;\f\u000bú½\u0005aÃkL\u0007\u0012µÖ¢³\u0015-à!\u001c½9î1Ï¬¦»ô\u000brÈA\"0\u0013'Û»UWLßqß{íÓ8vxé:Há\u0088_çEbFO\u0086ÏVþcÅýµ/%¹\u0087u\u0093ä,\u009eÉp9×p\u0015üh½aç¶¨\u000es§R$Ò&\u009e¬6T\u0080\u0015ú\u009b6xV^?°$\u0096ÚtÊ\u0002vØ&ÏDÉOqÀTi§\u0097\u0084\u0096ß\u001e\u001bº\nØûdãZuù{\u0001*¶íÛô;\u0018\u0004p\u0095D¾";
      int var4 = "fsØ\u0006S»\u0017Ü6\u00916æ=Þ\b\u0011ç5ý*¥`ú\nÌ´\nÏÓÛ\u0081[Â¡\fð~\u008d\u0096#ð\u0086%\u0017\u0005(£*\u0094¾¨\u0013F(á2%ng;WN\u001bÞRËØMþ\u0012ÆbrÔò|P¼sEÍ\u0002Z®þ\u007fa\u0083W¬\u000b\u0013Ðm!µs\u0097×\u00adÔ\u0095\u0018\tG\u0087\u009d\u0006>å\u0097%RÅ}Ñai;ÓwºÀ´øo1\u0015®ÒÙ\u0099Í\u0088\u0090à\u0005-¦?.\u0007+6Ïx\u0095tn\n\u000b°òOÌËb_¦ç/êÇ\u0007¸ØluÔqW\u00897*º$ÏOÑ¸'Td\u0093¤±r\u009b0Q¿üÐ\u0003§@ÎZ\fâC\u0090¿o\u0088\u008bVc\u0012¨\u009b\u0001\u001aa\u0018n\u0087Íi\u0003tv\u009cDÌ¦¹\nüä\fÅ\u0013\u009a\u0087yÐ¥\u000b\u0087¡cmþ\u008f\u0004Ù[ïé\u000ey\u0010íUÞ.\u0083\u0089g\u0013é¶ÆÔ/ÑB`\b4zè\u0016Â\u000fÿ<äÛýãtTß\u0097¸r\u000ef\u0002*í;\u009fÞ%ü8\"'~¶\u001a\u007f\u0081#ç\u0019\u0083E7º\u0007\rÏ\u0094r¡µB\u0005\u0088\u0097VÆ *N¯ó1-l\u008cº\u0088\u007fÒ\u0019á\nÍV\u0088Ú\u0083o\u0095V«êßÅG^æø¥Í\u0017\u0013\u0001\u008c\u0095;\f\u000bú½\u0005aÃkL\u0007\u0012µÖ¢³\u0015-à!\u001c½9î1Ï¬¦»ô\u000brÈA\"0\u0013'Û»UWLßqß{íÓ8vxé:Há\u0088_çEbFO\u0086ÏVþcÅýµ/%¹\u0087u\u0093ä,\u009eÉp9×p\u0015üh½aç¶¨\u000es§R$Ò&\u009e¬6T\u0080\u0015ú\u009b6xV^?°$\u0096ÚtÊ\u0002vØ&ÏDÉOqÀTi§\u0097\u0084\u0096ß\u001e\u001bº\nØûdãZuù{\u0001*¶íÛô;\u0018\u0004p\u0095D¾"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 84;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 123;
                     case 1 -> 72;
                     case 2 -> 90;
                     case 3 -> 53;
                     case 4 -> 66;
                     case 5 -> 70;
                     default -> 86;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     h = var5;
                     i = new String[26];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl();
                     lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = SetsKt.setOf(new BlockPos(-600, 113, -43));
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¯ÿ±Ç.Óè\u0081\u0099j\u0093ÉÙk\u0010¦ì\u0090¤\u0003\u009fr'\u001d68ëZî³\u0013";
                  var4 = "¯ÿ±Ç.Óè\u0081\u0099j\u0093ÉÙk\u0010¦ì\u0090¤\u0003\u009fr'\u001d68ëZî³\u0013".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 70;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -3480) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 155;
            case 2 -> 225;
            case 3 -> 82;
            case 4 -> 99;
            case 5 -> 76;
            case 6 -> 24;
            case 7 -> 71;
            case 8 -> 28;
            case 9 -> 124;
            case 10 -> 65;
            case 11 -> 199;
            case 12 -> 236;
            case 13 -> 16;
            case 14 -> 128;
            case 15 -> 42;
            case 16 -> 105;
            case 17 -> 8;
            case 18 -> 251;
            case 19 -> 133;
            case 20 -> 37;
            case 21 -> 158;
            case 22 -> 121;
            case 23 -> 69;
            case 24 -> 27;
            case 25 -> 212;
            case 26 -> 219;
            case 27 -> 152;
            case 28 -> 25;
            case 29 -> 229;
            case 30 -> 231;
            case 31 -> 145;
            case 32 -> 186;
            case 33 -> 183;
            case 34 -> 180;
            case 35 -> 136;
            case 36 -> 108;
            case 37 -> 132;
            case 38 -> 68;
            case 39 -> 197;
            case 40 -> 12;
            case 41 -> 227;
            case 42 -> 168;
            case 43 -> 3;
            case 44 -> 34;
            case 45 -> 30;
            case 46 -> 146;
            case 47 -> 179;
            case 48 -> 217;
            case 49 -> 5;
            case 50 -> 218;
            case 51 -> 148;
            case 52 -> 72;
            case 53 -> 207;
            case 54 -> 95;
            case 55 -> 63;
            case 56 -> 221;
            case 57 -> 178;
            case 58 -> 61;
            case 59 -> 191;
            case 60 -> 243;
            case 61 -> 150;
            case 62 -> 31;
            case 63 -> 118;
            case 64 -> 113;
            case 65 -> 154;
            case 66 -> 213;
            case 67 -> 131;
            case 68 -> 18;
            case 69 -> 0;
            case 70 -> 112;
            case 71 -> 36;
            case 72 -> 85;
            case 73 -> 2;
            case 74 -> 235;
            case 75 -> 96;
            case 76 -> 120;
            case 77 -> 194;
            case 78 -> 26;
            case 79 -> 21;
            case 80 -> 156;
            case 81 -> 167;
            case 82 -> 172;
            case 83 -> 137;
            case 84 -> 51;
            case 85 -> 214;
            case 86 -> 73;
            case 87 -> 52;
            case 88 -> 255;
            case 89 -> 220;
            case 90 -> 135;
            case 91 -> 193;
            case 92 -> 83;
            case 93 -> 88;
            case 94 -> 246;
            case 95 -> 142;
            case 96 -> 77;
            case 97 -> 240;
            case 98 -> 205;
            case 99 -> 233;
            case 100 -> 234;
            case 101 -> 20;
            case 102 -> 140;
            case 103 -> 203;
            case 104 -> 45;
            case 105 -> 97;
            case 106 -> 60;
            case 107 -> 54;
            case 108 -> 102;
            case 109 -> 91;
            case 110 -> 239;
            case 111 -> 64;
            case 112 -> 223;
            case 113 -> 164;
            case 114 -> 106;
            case 115 -> 160;
            case 116 -> 177;
            case 117 -> 23;
            case 118 -> 249;
            case 119 -> 57;
            case 120 -> 175;
            case 121 -> 161;
            case 122 -> 67;
            case 123 -> 187;
            case 124 -> 56;
            case 125 -> 254;
            case 126 -> 202;
            case 127 -> 171;
            case 128 -> 103;
            case 129 -> 147;
            case 130 -> 144;
            case 131 -> 224;
            case 132 -> 253;
            case 133 -> 110;
            case 134 -> 245;
            case 135 -> 169;
            case 136 -> 139;
            case 137 -> 94;
            case 138 -> 100;
            case 139 -> 192;
            case 140 -> 170;
            case 141 -> 62;
            case 142 -> 141;
            case 143 -> 238;
            case 144 -> 29;
            case 145 -> 157;
            case 146 -> 32;
            case 147 -> 40;
            case 148 -> 182;
            case 149 -> 129;
            case 150 -> 93;
            case 151 -> 9;
            case 152 -> 109;
            case 153 -> 48;
            case 154 -> 17;
            case 155 -> 174;
            case 156 -> 241;
            case 157 -> 184;
            case 158 -> 41;
            case 159 -> 143;
            case 160 -> 104;
            case 161 -> 210;
            case 162 -> 98;
            case 163 -> 226;
            case 164 -> 6;
            case 165 -> 90;
            case 166 -> 201;
            case 167 -> 123;
            case 168 -> 49;
            case 169 -> 163;
            case 170 -> 151;
            case 171 -> 14;
            case 172 -> 19;
            case 173 -> 87;
            case 174 -> 176;
            case 175 -> 181;
            case 176 -> 115;
            case 177 -> 130;
            case 178 -> 84;
            case 179 -> 211;
            case 180 -> 188;
            case 181 -> 74;
            case 182 -> 92;
            case 183 -> 58;
            case 184 -> 134;
            case 185 -> 50;
            case 186 -> 126;
            case 187 -> 189;
            case 188 -> 75;
            case 189 -> 232;
            case 190 -> 15;
            case 191 -> 173;
            case 192 -> 7;
            case 193 -> 216;
            case 194 -> 44;
            case 195 -> 252;
            case 196 -> 208;
            case 197 -> 138;
            case 198 -> 125;
            case 199 -> 165;
            case 200 -> 222;
            case 201 -> 80;
            case 202 -> 55;
            case 203 -> 149;
            case 204 -> 250;
            case 205 -> 79;
            case 206 -> 1;
            case 207 -> 43;
            case 208 -> 117;
            case 209 -> 244;
            case 210 -> 116;
            case 211 -> 122;
            case 212 -> 53;
            case 213 -> 22;
            case 214 -> 242;
            case 215 -> 70;
            case 216 -> 10;
            case 217 -> 35;
            case 218 -> 46;
            case 219 -> 4;
            case 220 -> 107;
            case 221 -> 185;
            case 222 -> 159;
            case 223 -> 166;
            case 224 -> 200;
            case 225 -> 198;
            case 226 -> 47;
            case 227 -> 195;
            case 228 -> 13;
            case 229 -> 209;
            case 230 -> 33;
            case 231 -> 204;
            case 232 -> 114;
            case 233 -> 86;
            case 234 -> 215;
            case 235 -> 248;
            case 236 -> 153;
            case 237 -> 111;
            case 238 -> 66;
            case 239 -> 206;
            case 240 -> 38;
            case 241 -> 81;
            case 242 -> 119;
            case 243 -> 59;
            case 244 -> 196;
            case 245 -> 190;
            case 246 -> 78;
            case 247 -> 89;
            case 248 -> 101;
            case 249 -> 162;
            case 250 -> 230;
            case 251 -> 237;
            case 252 -> 11;
            case 253 -> 247;
            case 254 -> 127;
            default -> 39;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @Nullable
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @Nullable BlockPos var1, @Nullable BlockPos var2, boolean var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = 23646;
         short var10002 = 3866;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      @Nullable
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final BlockPos f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @Nullable BlockPos var1, @Nullable BlockPos var2, boolean var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = 23644;
         short var10002 = 20165;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 23641;
         Triple var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockPos var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 26109;
         short var10002 = 23642;
         short var10003 = 4430;
         short var10004 = 23640;
         short var10005 = -25431;
         short var10006 = 23647;
         short var10007 = -24233;
         short var10008 = 23643;
         short var10009 = -21055;
         return "MoveProgress(berry=" + var5 + ", nextBerry=" + var4 + ", walkerFinished=" + var3 + ", failedAttempts=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var6;
         label25: {
            var1 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            BlockPos var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var6 = 0;
                  break label25;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var6 = var10000.hashCode();
         }

         int var8;
         label19: {
            int var2 = var6;
            var6 = var2 * 31;
            BlockPos var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var8 = 0;
                  break label19;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var8 = var10001.hashCode();
         }

         int var3 = var6 + var8;
         var3 = var3 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var3 = var3 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var3 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         label64: {
            int var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            if (var2 != null) {
               if (var4 !=( (!var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0)) {
                  return false;
               }

               var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var2 == null) {
                  break label64;
               }

               var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "FË;ñ\u0080ZB£\u0007ûlB\f-KHè*\\\nØï|\u001d\f\u0011\rRKÆ '÷çF\u009dá¢5\u001f©Õõ\u0013\u009eRudzî\u001dñdä\n\u001a\u00ad[\u008a\u0000Þ\u008cæ\t\u001dH\u0088X\u0005ö^úÕ";
         int var4 = "FË;ñ\u0080ZB£\u0007ûlB\f-KHè*\\\nØï|\u001d\f\u0011\rRKÆ '÷çF\u009dá¢5\u001f©Õõ\u0013\u009eRudzî\u001dñdä\n\u001a\u00ad[\u008a\u0000Þ\u008cæ\t\u001dH\u0088X\u0005ö^úÕ"
            .length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 33;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 81;
                        case 1 -> 23;
                        case 2 -> 27;
                        case 3 -> 46;
                        case 4 -> 90;
                        case 5 -> 25;
                        default -> 41;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[7];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "Þîý\u008c\u009d´(¹gBå6/Åû_Q\t\u0097V\u0004FIè\nä\u0082";
                     var4 = "Þîý\u008c\u009d´(¹gBå6/Åû_Q\t\u0097V\u0004FIè\nä\u0082".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 63;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 23642) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 30;
               case 1 -> 124;
               case 2 -> 24;
               case 3 -> 6;
               case 4 -> 106;
               case 5 -> 22;
               case 6 -> 29;
               case 7 -> 149;
               case 8 -> 221;
               case 9 -> 28;
               case 10 -> 31;
               case 11 -> 239;
               case 12 -> 143;
               case 13 -> 225;
               case 14 -> 146;
               case 15 -> 252;
               case 16 -> 101;
               case 17 -> 49;
               case 18 -> 65;
               case 19 -> 181;
               case 20 -> 174;
               case 21 -> 94;
               case 22 -> 21;
               case 23 -> 110;
               case 24 -> 243;
               case 25 -> 214;
               case 26 -> 85;
               case 27 -> 223;
               case 28 -> 244;
               case 29 -> 93;
               case 30 -> 211;
               case 31 -> 61;
               case 32 -> 227;
               case 33 -> 84;
               case 34 -> 97;
               case 35 -> 231;
               case 36 -> 107;
               case 37 -> 178;
               case 38 -> 248;
               case 39 -> 237;
               case 40 -> 210;
               case 41 -> 116;
               case 42 -> 232;
               case 43 -> 48;
               case 44 -> 47;
               case 45 -> 5;
               case 46 -> 75;
               case 47 -> 135;
               case 48 -> 166;
               case 49 -> 63;
               case 50 -> 156;
               case 51 -> 73;
               case 52 -> 4;
               case 53 -> 153;
               case 54 -> 52;
               case 55 -> 182;
               case 56 -> 123;
               case 57 -> 249;
               case 58 -> 242;
               case 59 -> 139;
               case 60 -> 68;
               case 61 -> 183;
               case 62 -> 39;
               case 63 -> 233;
               case 64 -> 169;
               case 65 -> 172;
               case 66 -> 122;
               case 67 -> 23;
               case 68 -> 64;
               case 69 -> 155;
               case 70 -> 43;
               case 71 -> 77;
               case 72 -> 118;
               case 73 -> 202;
               case 74 -> 7;
               case 75 -> 171;
               case 76 -> 11;
               case 77 -> 163;
               case 78 -> 218;
               case 79 -> 195;
               case 80 -> 245;
               case 81 -> 17;
               case 82 -> 126;
               case 83 -> 92;
               case 84 -> 215;
               case 85 -> 55;
               case 86 -> 217;
               case 87 -> 46;
               case 88 -> 34;
               case 89 -> 184;
               case 90 -> 189;
               case 91 -> 50;
               case 92 -> 2;
               case 93 -> 80;
               case 94 -> 125;
               case 95 -> 10;
               case 96 -> 83;
               case 97 -> 99;
               case 98 -> 1;
               case 99 -> 71;
               case 100 -> 170;
               case 101 -> 108;
               case 102 -> 18;
               case 103 -> 198;
               case 104 -> 246;
               case 105 -> 98;
               case 106 -> 152;
               case 107 -> 250;
               case 108 -> 234;
               case 109 -> 253;
               case 110 -> 132;
               case 111 -> 41;
               case 112 -> 117;
               case 113 -> 216;
               case 114 -> 127;
               case 115 -> 209;
               case 116 -> 74;
               case 117 -> 120;
               case 118 -> 165;
               case 119 -> 167;
               case 120 -> 25;
               case 121 -> 157;
               case 122 -> 131;
               case 123 -> 70;
               case 124 -> 179;
               case 125 -> 88;
               case 126 -> 51;
               case 127 -> 96;
               case 128 -> 206;
               case 129 -> 241;
               case 130 -> 16;
               case 131 -> 200;
               case 132 -> 236;
               case 133 -> 19;
               case 134 -> 79;
               case 135 -> 105;
               case 136 -> 176;
               case 137 -> 129;
               case 138 -> 57;
               case 139 -> 162;
               case 140 -> 62;
               case 141 -> 102;
               case 142 -> 81;
               case 143 -> 212;
               case 144 -> 0;
               case 145 -> 224;
               case 146 -> 27;
               case 147 -> 3;
               case 148 -> 235;
               case 149 -> 222;
               case 150 -> 113;
               case 151 -> 66;
               case 152 -> 26;
               case 153 -> 188;
               case 154 -> 160;
               case 155 -> 147;
               case 156 -> 136;
               case 157 -> 115;
               case 158 -> 72;
               case 159 -> 192;
               case 160 -> 128;
               case 161 -> 137;
               case 162 -> 154;
               case 163 -> 199;
               case 164 -> 213;
               case 165 -> 13;
               case 166 -> 114;
               case 167 -> 150;
               case 168 -> 204;
               case 169 -> 109;
               case 170 -> 67;
               case 171 -> 151;
               case 172 -> 180;
               case 173 -> 35;
               case 174 -> 20;
               case 175 -> 175;
               case 176 -> 187;
               case 177 -> 161;
               case 178 -> 130;
               case 179 -> 91;
               case 180 -> 205;
               case 181 -> 54;
               case 182 -> 190;
               case 183 -> 78;
               case 184 -> 9;
               case 185 -> 32;
               case 186 -> 59;
               case 187 -> 111;
               case 188 -> 158;
               case 189 -> 14;
               case 190 -> 12;
               case 191 -> 201;
               case 192 -> 191;
               case 193 -> 121;
               case 194 -> 134;
               case 195 -> 112;
               case 196 -> 220;
               case 197 -> 186;
               case 198 -> 194;
               case 199 -> 82;
               case 200 -> 44;
               case 201 -> 53;
               case 202 -> 40;
               case 203 -> 38;
               case 204 -> 247;
               case 205 -> 45;
               case 206 -> 95;
               case 207 -> 141;
               case 208 -> 164;
               case 209 -> 144;
               case 210 -> 238;
               case 211 -> 219;
               case 212 -> 229;
               case 213 -> 140;
               case 214 -> 119;
               case 215 -> 100;
               case 216 -> 185;
               case 217 -> 86;
               case 218 -> 255;
               case 219 -> 251;
               case 220 -> 89;
               case 221 -> 226;
               case 222 -> 142;
               case 223 -> 42;
               case 224 -> 69;
               case 225 -> 138;
               case 226 -> 254;
               case 227 -> 8;
               case 228 -> 15;
               case 229 -> 240;
               case 230 -> 103;
               case 231 -> 196;
               case 232 -> 33;
               case 233 -> 104;
               case 234 -> 177;
               case 235 -> 203;
               case 236 -> 133;
               case 237 -> 87;
               case 238 -> 90;
               case 239 -> 193;
               case 240 -> 230;
               case 241 -> 159;
               case 242 -> 148;
               case 243 -> 37;
               case 244 -> 207;
               case 245 -> 36;
               case 246 -> 228;
               case 247 -> 208;
               case 248 -> 173;
               case 249 -> 60;
               case 250 -> 145;
               case 251 -> 58;
               case 252 -> 76;
               case 253 -> 197;
               case 254 -> 168;
               default -> 56;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
   
public static me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, net.minecraft.core.BlockPos p1, net.minecraft.core.BlockPos p2, boolean p3, int p4, kotlin.Triple p5, int p6, java.lang.Object p7) {
         return (me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) null;
      }
}

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final BlockPos lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         int var1, int var2, @Nullable BlockPos var3, @Nullable BlockPos var4, int var5
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         int var1, int var2, @Nullable BlockPos var3, @Nullable BlockPos var4, int var5
      ) {
         return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -7880;
         int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         BlockPos var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -23589;
         short var10002 = -7878;
         short var10003 = -18483;
         short var10004 = -7879;
         short var10005 = -25328;
         short var10006 = -7877;
         short var10007 = -16690;
         short var10008 = -7874;
         short var10009 = -21322;
         return "ScanProgress(failedAttempts="
            + var5
            + ", blacklistSize="
            + var4
            + ", berry="
            + var3
            + ", nextBerry="
            + var2
            + ", lastScanElapsed="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var6;
         int var8;
         label25: {
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var1 = var10000;
            var6 = var2 * 31;
            BlockPos var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var8 = 0;
                  break label25;
               }

               var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var8 = var10001.hashCode();
         }

         label19: {
            int var4 = var6 + var8;
            var6 = var4 * 31;
            BlockPos var9 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var8 = 0;
                  break label19;
               }

               var9 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var8 = var9.hashCode();
         }

         int var5 = var6 + var8;
         return var5 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3;
         label64: {
            var3 = (IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == null) {
                  break label64;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var2 != null) {
            if ((Boolean)var4 != ((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == 0))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "\u0002AÁß½~\u0011ÒB\u0082ÇÔlYÒ,\f©à¸â\u0006æu=ÙVÁ\u0001\u001c4\u0099\u0094íEk\u001dH\\\u00ad{Å]C\u0099¤X\nDÎ\u0094º\u0002\u008aF/Â¢";
         int var4 = "\u0002AÁß½~\u0011ÒB\u0082ÇÔlYÒ,\f©à¸â\u0006æu=ÙVÁ\u0001\u001c4\u0099\u0094íEk\u001dH\\\u00ad{Å]C\u0099¤X\nDÎ\u0094º\u0002\u008aF/Â¢"
            .length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 15;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 124;
                        case 1 -> 41;
                        case 2 -> 43;
                        case 3 -> 116;
                        case 4 -> 65;
                        case 5 -> 103;
                        default -> 70;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[5];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¹\u0097Ç}\u001fbWB\u0012ÉnÇFÑ\u0087\u0085f\u0096\u0096\u0014¦x´>ó\u0085D";
                     var4 = "¹\u0097Ç}\u001fbWB\u0012ÉnÇFÑ\u0087\u0085f\u0096\u0096\u0014¦x´>ó\u0085D".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -7878) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 191;
               case 1 -> 97;
               case 2 -> 17;
               case 3 -> 33;
               case 4 -> 184;
               case 5 -> 82;
               case 6 -> 10;
               case 7 -> 236;
               case 8 -> 217;
               case 9 -> 107;
               case 10 -> 94;
               case 11 -> 85;
               case 12 -> 84;
               case 13 -> 126;
               case 14 -> 123;
               case 15 -> 185;
               case 16 -> 66;
               case 17 -> 193;
               case 18 -> 253;
               case 19 -> 234;
               case 20 -> 163;
               case 21 -> 144;
               case 22 -> 251;
               case 23 -> 14;
               case 24 -> 91;
               case 25 -> 64;
               case 26 -> 146;
               case 27 -> 69;
               case 28 -> 198;
               case 29 -> 158;
               case 30 -> 255;
               case 31 -> 182;
               case 32 -> 218;
               case 33 -> 13;
               case 34 -> 160;
               case 35 -> 70;
               case 36 -> 43;
               case 37 -> 119;
               case 38 -> 120;
               case 39 -> 131;
               case 40 -> 75;
               case 41 -> 48;
               case 42 -> 221;
               case 43 -> 90;
               case 44 -> 247;
               case 45 -> 6;
               case 46 -> 233;
               case 47 -> 111;
               case 48 -> 124;
               case 49 -> 147;
               case 50 -> 164;
               case 51 -> 190;
               case 52 -> 194;
               case 53 -> 175;
               case 54 -> 219;
               case 55 -> 121;
               case 56 -> 159;
               case 57 -> 156;
               case 58 -> 211;
               case 59 -> 50;
               case 60 -> 62;
               case 61 -> 192;
               case 62 -> 87;
               case 63 -> 168;
               case 64 -> 45;
               case 65 -> 114;
               case 66 -> 228;
               case 67 -> 59;
               case 68 -> 117;
               case 69 -> 57;
               case 70 -> 226;
               case 71 -> 199;
               case 72 -> 136;
               case 73 -> 230;
               case 74 -> 47;
               case 75 -> 96;
               case 76 -> 8;
               case 77 -> 116;
               case 78 -> 248;
               case 79 -> 141;
               case 80 -> 22;
               case 81 -> 32;
               case 82 -> 200;
               case 83 -> 174;
               case 84 -> 24;
               case 85 -> 71;
               case 86 -> 245;
               case 87 -> 202;
               case 88 -> 189;
               case 89 -> 152;
               case 90 -> 188;
               case 91 -> 244;
               case 92 -> 222;
               case 93 -> 154;
               case 94 -> 23;
               case 95 -> 7;
               case 96 -> 31;
               case 97 -> 149;
               case 98 -> 171;
               case 99 -> 142;
               case 100 -> 12;
               case 101 -> 134;
               case 102 -> 235;
               case 103 -> 30;
               case 104 -> 229;
               case 105 -> 161;
               case 106 -> 153;
               case 107 -> 243;
               case 108 -> 127;
               case 109 -> 173;
               case 110 -> 145;
               case 111 -> 240;
               case 112 -> 128;
               case 113 -> 112;
               case 114 -> 0;
               case 115 -> 36;
               case 116 -> 79;
               case 117 -> 237;
               case 118 -> 20;
               case 119 -> 204;
               case 120 -> 213;
               case 121 -> 178;
               case 122 -> 197;
               case 123 -> 102;
               case 124 -> 56;
               case 125 -> 95;
               case 126 -> 181;
               case 127 -> 125;
               case 128 -> 35;
               case 129 -> 180;
               case 130 -> 157;
               case 131 -> 51;
               case 132 -> 93;
               case 133 -> 46;
               case 134 -> 113;
               case 135 -> 148;
               case 136 -> 206;
               case 137 -> 61;
               case 138 -> 16;
               case 139 -> 5;
               case 140 -> 109;
               case 141 -> 101;
               case 142 -> 100;
               case 143 -> 26;
               case 144 -> 103;
               case 145 -> 205;
               case 146 -> 143;
               case 147 -> 209;
               case 148 -> 162;
               case 149 -> 108;
               case 150 -> 63;
               case 151 -> 68;
               case 152 -> 92;
               case 153 -> 106;
               case 154 -> 86;
               case 155 -> 176;
               case 156 -> 42;
               case 157 -> 238;
               case 158 -> 99;
               case 159 -> 73;
               case 160 -> 166;
               case 161 -> 89;
               case 162 -> 77;
               case 163 -> 58;
               case 164 -> 78;
               case 165 -> 196;
               case 166 -> 81;
               case 167 -> 76;
               case 168 -> 67;
               case 169 -> 49;
               case 170 -> 60;
               case 171 -> 239;
               case 172 -> 227;
               case 173 -> 115;
               case 174 -> 252;
               case 175 -> 19;
               case 176 -> 41;
               case 177 -> 165;
               case 178 -> 18;
               case 179 -> 220;
               case 180 -> 167;
               case 181 -> 208;
               case 182 -> 151;
               case 183 -> 54;
               case 184 -> 179;
               case 185 -> 133;
               case 186 -> 15;
               case 187 -> 195;
               case 188 -> 88;
               case 189 -> 140;
               case 190 -> 203;
               case 191 -> 232;
               case 192 -> 207;
               case 193 -> 186;
               case 194 -> 210;
               case 195 -> 1;
               case 196 -> 241;
               case 197 -> 110;
               case 198 -> 223;
               case 199 -> 44;
               case 200 -> 52;
               case 201 -> 249;
               case 202 -> 122;
               case 203 -> 104;
               case 204 -> 135;
               case 205 -> 74;
               case 206 -> 65;
               case 207 -> 11;
               case 208 -> 224;
               case 209 -> 169;
               case 210 -> 139;
               case 211 -> 231;
               case 212 -> 246;
               case 213 -> 2;
               case 214 -> 38;
               case 215 -> 72;
               case 216 -> 3;
               case 217 -> 27;
               case 218 -> 216;
               case 219 -> 214;
               case 220 -> 55;
               case 221 -> 105;
               case 222 -> 250;
               case 223 -> 212;
               case 224 -> 118;
               case 225 -> 25;
               case 226 -> 34;
               case 227 -> 187;
               case 228 -> 98;
               case 229 -> 155;
               case 230 -> 225;
               case 231 -> 21;
               case 232 -> 40;
               case 233 -> 242;
               case 234 -> 37;
               case 235 -> 254;
               case 236 -> 177;
               case 237 -> 83;
               case 238 -> 130;
               case 239 -> 39;
               case 240 -> 129;
               case 241 -> 170;
               case 242 -> 132;
               case 243 -> 137;
               case 244 -> 80;
               case 245 -> 201;
               case 246 -> 4;
               case 247 -> 183;
               case 248 -> 215;
               case 249 -> 9;
               case 250 -> 28;
               case 251 -> 29;
               case 252 -> 138;
               case 253 -> 53;
               case 254 -> 150;
               default -> 172;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
   
public static me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p0, int p1, int p2, net.minecraft.core.BlockPos p3, net.minecraft.core.BlockPos p4, int p5, int p6, java.lang.Object p7) {
         return (me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) null;
      }
}

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1, @Nullable BlockPos var2, @Nullable BlockPos var3, boolean var4
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, @Nullable BlockPos var2, @Nullable BlockPos var3, boolean var4
      ) {
         return new IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 24610;
         boolean var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockPos var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 5680;
         short var10002 = 24611;
         short var10003 = -16367;
         short var10004 = 24609;
         short var10005 = -8865;
         short var10006 = 24608;
         short var10007 = -20198;
         return "MineProgress(collected=" + var4 + ", berry=" + var3 + ", targetBlock=" + var2 + ", rotating=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var5;
         int var7;
         label25: {
            String var10000 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var5 = var2 * 31;
            BlockPos var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var7 = 0;
                  break label25;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var7 = var10001.hashCode();
         }

         label19: {
            int var3 = var5 + var7;
            var5 = var3 * 31;
            BlockPos var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var7 = 0;
                  break label19;
               }

               var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var7 = var8.hashCode();
         }

         int var4 = var5 + var7;
         return var4 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IllIIIIllIlIlIllllllllIIllIIllIIlllIllIlllIlIIIIlIIlIIlIlllllIlllIlllIIllIIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 !=( (!var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "'¿e§±v§\u001eb\t<6Æ<\u000byÖ¨\u0084ÈÛ_pbqÇ";
         int var4 = "'¿e§±v§\u001eb\t<6Æ<\u000byÖ¨\u0084ÈÛ_pbqÇ".length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 1;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 67;
                        case 1 -> 89;
                        case 2 -> 21;
                        case 3 -> 31;
                        case 4 -> 22;
                        case 5 -> 106;
                        default -> 43;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[4];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "õ¼&Ì\u0002\u0085Â\u0091\u0017Ó÷£Å\u001d¤QïÈ@L(\u001b¼\u0001æ\u009dB«RØôý";
                     var4 = "õ¼&Ì\u0002\u0085Â\u0091\u0017Ó÷£Å\u001d¤QïÈ@L(\u001b¼\u0001æ\u009dB«RØôý".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 98;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 24609) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 228;
               case 1 -> 8;
               case 2 -> 218;
               case 3 -> 189;
               case 4 -> 233;
               case 5 -> 90;
               case 6 -> 47;
               case 7 -> 69;
               case 8 -> 148;
               case 9 -> 150;
               case 10 -> 206;
               case 11 -> 249;
               case 12 -> 159;
               case 13 -> 152;
               case 14 -> 7;
               case 15 -> 27;
               case 16 -> 41;
               case 17 -> 116;
               case 18 -> 239;
               case 19 -> 195;
               case 20 -> 158;
               case 21 -> 14;
               case 22 -> 223;
               case 23 -> 12;
               case 24 -> 83;
               case 25 -> 188;
               case 26 -> 26;
               case 27 -> 108;
               case 28 -> 102;
               case 29 -> 229;
               case 30 -> 4;
               case 31 -> 99;
               case 32 -> 171;
               case 33 -> 65;
               case 34 -> 245;
               case 35 -> 190;
               case 36 -> 53;
               case 37 -> 10;
               case 38 -> 177;
               case 39 -> 143;
               case 40 -> 2;
               case 41 -> 74;
               case 42 -> 251;
               case 43 -> 210;
               case 44 -> 59;
               case 45 -> 28;
               case 46 -> 203;
               case 47 -> 146;
               case 48 -> 105;
               case 49 -> 134;
               case 50 -> 250;
               case 51 -> 84;
               case 52 -> 160;
               case 53 -> 235;
               case 54 -> 220;
               case 55 -> 24;
               case 56 -> 56;
               case 57 -> 230;
               case 58 -> 42;
               case 59 -> 3;
               case 60 -> 77;
               case 61 -> 178;
               case 62 -> 145;
               case 63 -> 151;
               case 64 -> 33;
               case 65 -> 132;
               case 66 -> 209;
               case 67 -> 202;
               case 68 -> 136;
               case 69 -> 66;
               case 70 -> 173;
               case 71 -> 107;
               case 72 -> 57;
               case 73 -> 166;
               case 74 -> 208;
               case 75 -> 115;
               case 76 -> 162;
               case 77 -> 247;
               case 78 -> 181;
               case 79 -> 123;
               case 80 -> 193;
               case 81 -> 137;
               case 82 -> 244;
               case 83 -> 51;
               case 84 -> 121;
               case 85 -> 141;
               case 86 -> 194;
               case 87 -> 243;
               case 88 -> 79;
               case 89 -> 217;
               case 90 -> 89;
               case 91 -> 120;
               case 92 -> 153;
               case 93 -> 94;
               case 94 -> 180;
               case 95 -> 212;
               case 96 -> 164;
               case 97 -> 154;
               case 98 -> 182;
               case 99 -> 241;
               case 100 -> 175;
               case 101 -> 22;
               case 102 -> 92;
               case 103 -> 232;
               case 104 -> 183;
               case 105 -> 198;
               case 106 -> 205;
               case 107 -> 201;
               case 108 -> 40;
               case 109 -> 16;
               case 110 -> 110;
               case 111 -> 48;
               case 112 -> 176;
               case 113 -> 192;
               case 114 -> 104;
               case 115 -> 185;
               case 116 -> 38;
               case 117 -> 91;
               case 118 -> 156;
               case 119 -> 6;
               case 120 -> 138;
               case 121 -> 131;
               case 122 -> 31;
               case 123 -> 144;
               case 124 -> 163;
               case 125 -> 58;
               case 126 -> 35;
               case 127 -> 34;
               case 128 -> 255;
               case 129 -> 155;
               case 130 -> 68;
               case 131 -> 60;
               case 132 -> 39;
               case 133 -> 128;
               case 134 -> 200;
               case 135 -> 112;
               case 136 -> 82;
               case 137 -> 222;
               case 138 -> 135;
               case 139 -> 169;
               case 140 -> 37;
               case 141 -> 21;
               case 142 -> 101;
               case 143 -> 64;
               case 144 -> 127;
               case 145 -> 199;
               case 146 -> 70;
               case 147 -> 18;
               case 148 -> 227;
               case 149 -> 196;
               case 150 -> 161;
               case 151 -> 106;
               case 152 -> 5;
               case 153 -> 172;
               case 154 -> 17;
               case 155 -> 50;
               case 156 -> 81;
               case 157 -> 61;
               case 158 -> 36;
               case 159 -> 254;
               case 160 -> 242;
               case 161 -> 72;
               case 162 -> 147;
               case 163 -> 216;
               case 164 -> 32;
               case 165 -> 253;
               case 166 -> 170;
               case 167 -> 214;
               case 168 -> 133;
               case 169 -> 197;
               case 170 -> 29;
               case 171 -> 125;
               case 172 -> 207;
               case 173 -> 103;
               case 174 -> 167;
               case 175 -> 225;
               case 176 -> 97;
               case 177 -> 142;
               case 178 -> 238;
               case 179 -> 100;
               case 180 -> 78;
               case 181 -> 0;
               case 182 -> 157;
               case 183 -> 44;
               case 184 -> 122;
               case 185 -> 114;
               case 186 -> 234;
               case 187 -> 117;
               case 188 -> 49;
               case 189 -> 86;
               case 190 -> 52;
               case 191 -> 11;
               case 192 -> 109;
               case 193 -> 54;
               case 194 -> 67;
               case 195 -> 226;
               case 196 -> 63;
               case 197 -> 126;
               case 198 -> 73;
               case 199 -> 87;
               case 200 -> 211;
               case 201 -> 224;
               case 202 -> 215;
               case 203 -> 246;
               case 204 -> 187;
               case 205 -> 149;
               case 206 -> 179;
               case 207 -> 130;
               case 208 -> 71;
               case 209 -> 45;
               case 210 -> 30;
               case 211 -> 55;
               case 212 -> 25;
               case 213 -> 95;
               case 214 -> 168;
               case 215 -> 96;
               case 216 -> 9;
               case 217 -> 13;
               case 218 -> 248;
               case 219 -> 252;
               case 220 -> 1;
               case 221 -> 98;
               case 222 -> 75;
               case 223 -> 80;
               case 224 -> 19;
               case 225 -> 62;
               case 226 -> 76;
               case 227 -> 236;
               case 228 -> 139;
               case 229 -> 85;
               case 230 -> 15;
               case 231 -> 219;
               case 232 -> 20;
               case 233 -> 93;
               case 234 -> 240;
               case 235 -> 174;
               case 236 -> 140;
               case 237 -> 111;
               case 238 -> 213;
               case 239 -> 119;
               case 240 -> 186;
               case 241 -> 43;
               case 242 -> 113;
               case 243 -> 184;
               case 244 -> 191;
               case 245 -> 118;
               case 246 -> 129;
               case 247 -> 46;
               case 248 -> 88;
               case 249 -> 221;
               case 250 -> 237;
               case 251 -> 124;
               case 252 -> 204;
               case 253 -> 231;
               case 254 -> 165;
               default -> 23;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
   
public static me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, net.minecraft.core.BlockPos p2, net.minecraft.core.BlockPos p3, boolean p4, int p5, java.lang.Object p6) {
         return (me.octo.client.IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) null;
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl a() {
         return IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
      }

      @NotNull
      public final Set<BlockPos> c() {
         return IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
   public static void b() {
   }
}
}
