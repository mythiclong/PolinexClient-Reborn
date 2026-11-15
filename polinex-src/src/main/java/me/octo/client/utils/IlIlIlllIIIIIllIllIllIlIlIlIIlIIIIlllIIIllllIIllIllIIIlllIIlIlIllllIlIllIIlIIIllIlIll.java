package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.PlayerScoreEntry;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll {
    public static <T> T a(Object p0) { return null; } // PX-FIX mr3
   @NotNull
   public static IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Regex lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   private IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll() {
   }

   public final boolean a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(boolean var1) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean b() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void b(boolean var1) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   @Nullable
   public final String c() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(@Nullable String var1) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   @Nullable
   public final ArrayList<String> d() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var1 == null
         && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level
            != null) {
         Scoreboard var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .level
            .getScoreboard();
         if (var10000 != null) {
            Scoreboard var2 = var10000;
            if (var1 == null) {
               Objective var26 = var2.getDisplayObjective(DisplaySlot.SIDEBAR);
               if (var26 != null) {
                  Objective var3 = var26;
                  ArrayList var4 = new ArrayList();
                  Collection var27 = var2.listPlayerScores(var3);
                  short var10002 = -4006;
                  short var10003 = -20716;
                  Intrinsics.checkNotNullExpressionValue(var27, "listPlayerScores(...)");
                  Iterable var6 = var27;
                  boolean var7 = false;
                  var6 = CollectionsKt.sortedWith(
                     var6,
                     new IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
                  );
                  var7 = false;
                  var var9 = new ArrayList();
                  boolean var10 = false;
                  boolean var12 = false;

                  for (Object var14 : var6) {
                     boolean var16 = false;
                     PlayerScoreEntry var17 = (PlayerScoreEntry)var14;
                     boolean var18 = false;
                     String var28 = var17.owner();
                     var10002 = -4012;
                     var10003 = -18816;
                     Intrinsics.checkNotNullExpressionValue(var28, "owner(...)");
                     String var19 = var28;
                     PlayerTeam var20 = var2.getPlayersTeam(var19);
                     IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var29 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var10001 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     MutableComponent var33 = PlayerTeam.formatNameForTeam(var20, Component.literal(var19));
                     short var10004 = -4002;
                     short var10005 = 29255;
                     Intrinsics.checkNotNullExpressionValue(var33, "formatNameForTeam(...)");
                     String var21 = var29.a(var10001.a(var33));
                     if (var1 == null) {
                        String var30 = StringsKt.isBlank(var21) ? null : var21;
                        if (var30 != null) {
                           String var22 = var30;
                           boolean var23 = false;
                           var9.add(var22);
                        }

                        if (var1 == null) {
                           continue;
                        }
                     }
                     break;
                  }

                  List var5 = var9;
                  IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var31 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var34 = var3.getDisplayName().getString();
                  short var36 = -4014;
                  short var37 = -16684;
                  Intrinsics.checkNotNullExpressionValue(var34, "getString(...)");
                  var4.add(var31.a(var34));
                  var4.addAll(var5);
                  return var4;
               }
            }

            return null;
         }
      }

      return null;
   }

   @Nullable
   public final List<String> e() {
       List<String> var14 = null; // PX-FIX decl var14
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (var1 == null
         && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level
            != null) {
         Scoreboard var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .level
            .getScoreboard();
         if (var10000 != null) {
            Scoreboard var2 = var10000;
            if (var1 == null) {
               Objective var11 = var2.getDisplayObjective(DisplaySlot.SIDEBAR);
               if (var11 != null) {
                  Objective var3 = var11;
                  Collection var12 = var2.listPlayerScores(var3);
                  short var10002 = -4005;
                  short var10003 = -27876;
                  Intrinsics.checkNotNullExpressionValue(var12, "listPlayerScores(...)");
                  Iterable var5 = var12;
                  boolean var6 = false;
                  List var4 = CollectionsKt.sortedWith(
                     var5,
                     new IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
                  );
                  List var9 = new ArrayList();
                  Iterator var10 = var4.iterator();

                  while (true) {
                     if (var10.hasNext()) {
                        var10000 = (Scoreboard)var10.next();
                        var10002 = -4003;
                        var10003 = -7919;
                        Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                        PlayerScoreEntry var7 = (PlayerScoreEntry)(Object)var10000;
                        PlayerTeam var8 = var2.getPlayersTeam(var7.owner());
                        var14 = var9;
                        if (var1 != null) {
                           break;
                        }

                        MutableComponent var16 = PlayerTeam.formatNameForTeam(var8, Component.literal(var7.owner()));
                        short var10004 = -4010;
                        short var10005 = 13138;
                        Intrinsics.checkNotNullExpressionValue(var16, "formatNameForTeam(...)");
                        var9.add(this.a(var16));
                        if (var1 == null) {
                           continue;
                        }
                     }

                     var14 = var9;
                     break;
                  }

                  return var14;
               }
            }

            return null;
         }
      }

      return null;
   }

   public final boolean b(@NotNull String var1) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -4008;
      short var10003 = -29934;
      Intrinsics.checkNotNullParameter(var1, "line");
      String var2 = var10000;
      if (var2 == null) {
         ArrayList var9 = this.d();
         if (var9 != null) {
            var var3 = var9;
            boolean var4 = false;
            var10000 = String.valueOf(var3);
            label41:
            if (var2 == null) {
               if (var3 instanceof Collection) {
                  var10000 = String.valueOf(var3);
                  if (var2 != null) {
                     break label41;
                  }

                  if (var10000.isEmpty()) {
                     return false;
                  }
               }

               var10000 = String.valueOf(var3);
            }

            for (Object var6 : (Iterable<?>)(Object)(var10000)) {
               String var7 = (String)var6;
               boolean var8 = false;
               boolean var10 = StringsKt.contains(
                  IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var7),
                  var1,
                  false);

               while (var10) {
                  var10 = true;
                  if (var2 == null) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      return false;
   }

   @NotNull
   public final String a(@NotNull Component var1) {
      short var10001 = -4004;
      short var10002 = 17280;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      StringBuilder var2 = new StringBuilder();
      var1.visit((net.minecraft.network.chat.FormattedText.StyledContentConsumer)((style, str) -> a(var2, style, str)), Style.EMPTY);
      String var10000 = var2.toString();
      var10002 = -4013;
      short var10003 = 9500;
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      CharSequence var3 = var10000;
      Regex var4 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String var5 = "";
      return var4.replace(var3, var5);
   }

   public final void f() {
      short var10000 = -4015;
      short var10001 = -21918;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§6Error Determining active slayer type, please report."
      );
   }

   private static final Optional a(StringBuilder var0, Style var1, String var2) {
      String var3;
      String var6;
      label30: {
         var6 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         short var10002 = -4009;
         short var10003 = -21439;
         Intrinsics.checkNotNullParameter(var1, "style");
         var3 = var6;
         short var10001 = -4011;
         var10002 = -9948;
         Intrinsics.checkNotNullParameter(var2, "string");
         if (var3 == null) {
            TextColor var5 = var1.getColor();
            if (var5 != null) {
               var6 = var5.serialize();
               break label30;
            }
         }

         var6 = null;
      }

      ChatFormatting var4 = ChatFormatting.getByName(var6);
      if (var4 != null) {
         var0.append("§" + var4.getChar());
      }

      boolean var7 = var1.isUnderlined();
      if (var3 == null) {
         if (var7) {
            short var8 = -4007;
            short var11 = 32548;
            var0.append("§n");
         }

         var7 = var1.isBold();
      }

      if (var7) {
         short var9 = -4016;
         short var12 = 20347;
         var0.append("§l");
      }

      var0.append(var2);
      return Optional.empty();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var14 = 0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "ó¶\u0091%»\u001cÿ¢9K½\u001bG>\u000bTòódqÂV\nxÂ5\u0015Ê\u0085j\u008dnS\u0006/_\u0001dâú\t\u00900þ§T,\u0002ú®\u0015Õ4\u001fªzÏÿÛûhù\u0086e&ñ§èÛÊ²\u0010\u0015\rø\u00043\u0019ü\u0093½v¤H\u001fS\u00157Á0\u0017Ñ+s\u0004Á&\u0080ù\u0002î#\u0016!²Ë¥ð\f\u0096 \u0014\u000b\u0018\u0013ó?\u009dt ÷>ñ\u0089F\u0005bá\u001f¶\u0004\nÓJ¡©1Ø¿¢\u001e¡\u0006\u00909J¨Ï:\u000e\u0087à8\u009a]\u0014³jyñ\u0096é\u001bt\r\u00adÄ+rúÑ\u0086£wæñÍð";
      int var4 = "ó¶\u0091%»\u001cÿ¢9K½\u001bG>\u000bTòódqÂV\nxÂ5\u0015Ê\u0085j\u008dnS\u0006/_\u0001dâú\t\u00900þ§T,\u0002ú®\u0015Õ4\u001fªzÏÿÛûhù\u0086e&ñ§èÛÊ²\u0010\u0015\rø\u00043\u0019ü\u0093½v¤H\u001fS\u00157Á0\u0017Ñ+s\u0004Á&\u0080ù\u0002î#\u0016!²Ë¥ð\f\u0096 \u0014\u000b\u0018\u0013ó?\u009dt ÷>ñ\u0089F\u0005bá\u001f¶\u0004\nÓJ¡©1Ø¿¢\u001e¡\u0006\u00909J¨Ï:\u000e\u0087à8\u009a]\u0014³jyñ\u0096é\u001bt\r\u00adÄ+rúÑ\u0086£wæñÍð"
         .length();
      char var1 = 22;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 13;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
                var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 86;
                     case 1 -> 45;
                     case 2 -> 81;
                     case 3 -> 21;
                     case 4 -> 82;
                     case 5 -> 2;
                     default -> 109;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[16];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll();
                     var10002 = -4001;
                     short var31 = 22563;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Regex("§[^a-f0-9]");
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "û'6öÔ\u008dv\u0088ã¦\u0016òÆ\u0088Òç\u0007a\u0010D¡\rÉ²¶1õÄ9~dO®4\u0093\u0004å1)òSb%ë\u0015®|*ÉÞüc\u001b\u0094*\nñ";
                  var4 = "û'6öÔ\u008dv\u0088ã¦\u0016òÆ\u0088Òç\u0007a\u0010D¡\rÉ²¶1õÄ9~dO®4\u0093\u0004å1)òSb%ë\u0015®|*ÉÞüc\u001b\u0094*\nñ".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 84;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4002) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 86;
            case 1 -> 134;
            case 2 -> 206;
            case 3 -> 148;
            case 4 -> 8;
            case 5 -> 38;
            case 6 -> 251;
            case 7 -> 91;
            case 8 -> 66;
            case 9 -> 130;
            case 10 -> 9;
            case 11 -> 85;
            case 12 -> 70;
            case 13 -> 111;
            case 14 -> 146;
            case 15 -> 102;
            case 16 -> 157;
            case 17 -> 40;
            case 18 -> 173;
            case 19 -> 90;
            case 20 -> 117;
            case 21 -> 103;
            case 22 -> 73;
            case 23 -> 178;
            case 24 -> 37;
            case 25 -> 144;
            case 26 -> 211;
            case 27 -> 105;
            case 28 -> 236;
            case 29 -> 43;
            case 30 -> 229;
            case 31 -> 158;
            case 32 -> 140;
            case 33 -> 76;
            case 34 -> 110;
            case 35 -> 159;
            case 36 -> 215;
            case 37 -> 32;
            case 38 -> 112;
            case 39 -> 33;
            case 40 -> 59;
            case 41 -> 104;
            case 42 -> 166;
            case 43 -> 82;
            case 44 -> 60;
            case 45 -> 235;
            case 46 -> 187;
            case 47 -> 240;
            case 48 -> 188;
            case 49 -> 48;
            case 50 -> 13;
            case 51 -> 126;
            case 52 -> 237;
            case 53 -> 189;
            case 54 -> 155;
            case 55 -> 244;
            case 56 -> 224;
            case 57 -> 247;
            case 58 -> 69;
            case 59 -> 230;
            case 60 -> 24;
            case 61 -> 0;
            case 62 -> 42;
            case 63 -> 194;
            case 64 -> 98;
            case 65 -> 252;
            case 66 -> 109;
            case 67 -> 253;
            case 68 -> 191;
            case 69 -> 36;
            case 70 -> 243;
            case 71 -> 81;
            case 72 -> 180;
            case 73 -> 164;
            case 74 -> 233;
            case 75 -> 184;
            case 76 -> 122;
            case 77 -> 100;
            case 78 -> 216;
            case 79 -> 115;
            case 80 -> 113;
            case 81 -> 79;
            case 82 -> 147;
            case 83 -> 129;
            case 84 -> 161;
            case 85 -> 67;
            case 86 -> 226;
            case 87 -> 212;
            case 88 -> 62;
            case 89 -> 227;
            case 90 -> 254;
            case 91 -> 58;
            case 92 -> 131;
            case 93 -> 205;
            case 94 -> 125;
            case 95 -> 68;
            case 96 -> 97;
            case 97 -> 160;
            case 98 -> 175;
            case 99 -> 195;
            case 100 -> 179;
            case 101 -> 174;
            case 102 -> 52;
            case 103 -> 152;
            case 104 -> 209;
            case 105 -> 99;
            case 106 -> 12;
            case 107 -> 11;
            case 108 -> 94;
            case 109 -> 10;
            case 110 -> 217;
            case 111 -> 204;
            case 112 -> 221;
            case 113 -> 181;
            case 114 -> 213;
            case 115 -> 123;
            case 116 -> 56;
            case 117 -> 77;
            case 118 -> 46;
            case 119 -> 124;
            case 120 -> 57;
            case 121 -> 75;
            case 122 -> 54;
            case 123 -> 250;
            case 124 -> 1;
            case 125 -> 197;
            case 126 -> 63;
            case 127 -> 231;
            case 128 -> 214;
            case 129 -> 106;
            case 130 -> 53;
            case 131 -> 55;
            case 132 -> 238;
            case 133 -> 16;
            case 134 -> 239;
            case 135 -> 107;
            case 136 -> 153;
            case 137 -> 6;
            case 138 -> 95;
            case 139 -> 84;
            case 140 -> 114;
            case 141 -> 172;
            case 142 -> 50;
            case 143 -> 30;
            case 144 -> 2;
            case 145 -> 137;
            case 146 -> 45;
            case 147 -> 167;
            case 148 -> 49;
            case 149 -> 93;
            case 150 -> 118;
            case 151 -> 242;
            case 152 -> 61;
            case 153 -> 207;
            case 154 -> 28;
            case 155 -> 198;
            case 156 -> 71;
            case 157 -> 119;
            case 158 -> 7;
            case 159 -> 185;
            case 160 -> 220;
            case 161 -> 27;
            case 162 -> 241;
            case 163 -> 41;
            case 164 -> 249;
            case 165 -> 101;
            case 166 -> 202;
            case 167 -> 138;
            case 168 -> 121;
            case 169 -> 23;
            case 170 -> 162;
            case 171 -> 222;
            case 172 -> 145;
            case 173 -> 65;
            case 174 -> 246;
            case 175 -> 201;
            case 176 -> 132;
            case 177 -> 149;
            case 178 -> 74;
            case 179 -> 200;
            case 180 -> 228;
            case 181 -> 18;
            case 182 -> 193;
            case 183 -> 51;
            case 184 -> 64;
            case 185 -> 151;
            case 186 -> 31;
            case 187 -> 168;
            case 188 -> 196;
            case 189 -> 169;
            case 190 -> 4;
            case 191 -> 142;
            case 192 -> 223;
            case 193 -> 89;
            case 194 -> 182;
            case 195 -> 192;
            case 196 -> 245;
            case 197 -> 80;
            case 198 -> 208;
            case 199 -> 171;
            case 200 -> 5;
            case 201 -> 120;
            case 202 -> 218;
            case 203 -> 108;
            case 204 -> 190;
            case 205 -> 44;
            case 206 -> 88;
            case 207 -> 133;
            case 208 -> 83;
            case 209 -> 141;
            case 210 -> 26;
            case 211 -> 116;
            case 212 -> 143;
            case 213 -> 47;
            case 214 -> 3;
            case 215 -> 255;
            case 216 -> 199;
            case 217 -> 203;
            case 218 -> 127;
            case 219 -> 136;
            case 220 -> 25;
            case 221 -> 210;
            case 222 -> 35;
            case 223 -> 177;
            case 224 -> 248;
            case 225 -> 170;
            case 226 -> 87;
            case 227 -> 156;
            case 228 -> 39;
            case 229 -> 219;
            case 230 -> 96;
            case 231 -> 163;
            case 232 -> 139;
            case 233 -> 72;
            case 234 -> 78;
            case 235 -> 150;
            case 236 -> 14;
            case 237 -> 22;
            case 238 -> 92;
            case 239 -> 135;
            case 240 -> 225;
            case 241 -> 176;
            case 242 -> 17;
            case 243 -> 128;
            case 244 -> 15;
            case 245 -> 20;
            case 246 -> 154;
            case 247 -> 186;
            case 248 -> 34;
            case 249 -> 29;
            case 250 -> 232;
            case 251 -> 165;
            case 252 -> 21;
            case 253 -> 183;
            case 254 -> 234;
            default -> 19;
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
