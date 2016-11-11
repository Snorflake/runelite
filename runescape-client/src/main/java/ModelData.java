import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("ModelData")
public class ModelData extends Renderable {
   @ObfuscatedName("f")
   short[] field1745;
   @ObfuscatedName("h")
   int[] field1746;
   @ObfuscatedName("e")
   int[] field1747;
   @ObfuscatedName("g")
   int[] field1748;
   @ObfuscatedName("as")
   int[] field1749;
   @ObfuscatedName("u")
   int[] field1750;
   @ObfuscatedName("ax")
   int field1751;
   @ObfuscatedName("l")
   int[] field1752;
   @ObfuscatedName("m")
   byte[] field1753;
   @ObfuscatedName("y")
   byte[] field1754;
   @ObfuscatedName("ag")
   VertexNormal[] field1755;
   @ObfuscatedName("s")
   byte[] field1756;
   @ObfuscatedName("i")
   int field1757 = 0;
   @ObfuscatedName("v")
   short[] field1758;
   @ObfuscatedName("r")
   byte field1759 = 0;
   @ObfuscatedName("ad")
   int[] field1760;
   @ObfuscatedName("w")
   byte[] field1761;
   @ObfuscatedName("ah")
   int field1762;
   @ObfuscatedName("k")
   short[] field1763;
   @ObfuscatedName("z")
   short[] field1764;
   @ObfuscatedName("q")
   short[] field1765;
   @ObfuscatedName("o")
   short[] field1766;
   @ObfuscatedName("ap")
   static int[] field1767 = new int[10000];
   @ObfuscatedName("b")
   short[] field1768;
   @ObfuscatedName("x")
   short[] field1769;
   @ObfuscatedName("a")
   short[] field1770;
   @ObfuscatedName("am")
   byte[] field1771;
   @ObfuscatedName("j")
   byte[] field1772;
   @ObfuscatedName("p")
   short[] field1773;
   @ObfuscatedName("af")
   int[][] field1774;
   @ObfuscatedName("ak")
   int[][] field1775;
   @ObfuscatedName("aq")
   FaceNormal[] field1776;
   @ObfuscatedName("an")
   VertexNormal[] field1777;
   @ObfuscatedName("aa")
   static int field1778 = 0;
   @ObfuscatedName("al")
   public short field1779;
   @ObfuscatedName("n")
   int field1780 = 0;
   @ObfuscatedName("c")
   int field1781;
   @ObfuscatedName("aw")
   int field1782;
   @ObfuscatedName("au")
   public short field1783;
   @ObfuscatedName("ao")
   int field1784;
   @ObfuscatedName("d")
   int[] field1785;
   @ObfuscatedName("ac")
   int field1786;
   @ObfuscatedName("ai")
   static int[] field1787 = new int[10000];
   @ObfuscatedName("t")
   short[] field1788;
   @ObfuscatedName("ar")
   boolean field1789 = false;
   @ObfuscatedName("ay")
   static int[] field1790;
   @ObfuscatedName("ab")
   static int[] field1791;

   static {
      field1790 = class94.field1623;
      field1791 = class94.field1642;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lclass170;II)LModelData;",
      garbageValue = "0"
   )
   public static ModelData method2245(class170 var0, int var1, int var2) {
      byte[] var3 = var0.method3292(var1, var2);
      return var3 == null?null:new ModelData(var3);
   }

   ModelData(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2246(var1);
      } else {
         this.method2247(var1);
      }

   }

   @ObfuscatedName("h")
   void method2246(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = var1.length - 23;
      int var9 = var2.method2546();
      int var10 = var2.method2546();
      int var11 = var2.method2544();
      int var12 = var2.method2544();
      int var13 = var2.method2544();
      int var14 = var2.method2544();
      int var15 = var2.method2544();
      int var16 = var2.method2544();
      int var17 = var2.method2544();
      int var18 = var2.method2546();
      int var19 = var2.method2546();
      int var20 = var2.method2546();
      int var21 = var2.method2546();
      int var22 = var2.method2546();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field1761 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field1761[var26] = var2.method2545();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field1757 = var9;
      this.field1780 = var10;
      this.field1781 = var11;
      this.field1746 = new int[var9];
      this.field1747 = new int[var9];
      this.field1748 = new int[var9];
      this.field1750 = new int[var10];
      this.field1785 = new int[var10];
      this.field1752 = new int[var10];
      if(var17 == 1) {
         this.field1749 = new int[var9];
      }

      if(var12 == 1) {
         this.field1753 = new byte[var10];
      }

      if(var13 == 255) {
         this.field1772 = new byte[var10];
      } else {
         this.field1759 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1754 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1760 = new int[var10];
      }

      if(var16 == 1) {
         this.field1758 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field1756 = new byte[var10];
      }

      this.field1773 = new short[var10];
      if(var11 > 0) {
         this.field1769 = new short[var11];
         this.field1763 = new short[var11];
         this.field1764 = new short[var11];
         if(var24 > 0) {
            this.field1765 = new short[var24];
            this.field1766 = new short[var24];
            this.field1745 = new short[var24];
            this.field1768 = new short[var24];
            this.field1771 = new byte[var24];
            this.field1788 = new short[var24];
         }

         if(var25 > 0) {
            this.field1770 = new short[var25];
         }
      }

      var2.offset = var11;
      var3.offset = var38;
      var4.offset = var39;
      var5.offset = var40;
      var6.offset = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method2544();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method2556();
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method2556();
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method2556();
         }

         this.field1746[var51] = var48 + var53;
         this.field1747[var51] = var49 + var54;
         this.field1748[var51] = var50 + var55;
         var48 = this.field1746[var51];
         var49 = this.field1747[var51];
         var50 = this.field1748[var51];
         if(var17 == 1) {
            this.field1749[var51] = var6.method2544();
         }
      }

      var2.offset = var37;
      var3.offset = var28;
      var4.offset = var30;
      var5.offset = var33;
      var6.offset = var31;
      var7.offset = var35;
      var8.offset = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field1773[var51] = (short)var2.method2546();
         if(var12 == 1) {
            this.field1753[var51] = var3.method2545();
         }

         if(var13 == 255) {
            this.field1772[var51] = var4.method2545();
         }

         if(var14 == 1) {
            this.field1754[var51] = var5.method2545();
         }

         if(var15 == 1) {
            this.field1760[var51] = var6.method2544();
         }

         if(var16 == 1) {
            this.field1758[var51] = (short)(var7.method2546() - 1);
         }

         if(this.field1756 != null && this.field1758[var51] != -1) {
            this.field1756[var51] = (byte)(var8.method2544() - 1);
         }
      }

      var2.offset = var34;
      var3.offset = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method2544();
         if(var56 == 1) {
            var51 = var2.method2556() + var54;
            var52 = var2.method2556() + var51;
            var53 = var2.method2556() + var52;
            var54 = var53;
            this.field1750[var55] = var51;
            this.field1785[var55] = var52;
            this.field1752[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method2556() + var54;
            var54 = var53;
            this.field1750[var55] = var51;
            this.field1785[var55] = var52;
            this.field1752[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method2556() + var54;
            var54 = var53;
            this.field1750[var55] = var51;
            this.field1785[var55] = var52;
            this.field1752[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method2556() + var54;
            var54 = var53;
            this.field1750[var55] = var51;
            this.field1785[var55] = var57;
            this.field1752[var55] = var53;
         }
      }

      var2.offset = var41;
      var3.offset = var42;
      var4.offset = var43;
      var5.offset = var44;
      var6.offset = var45;
      var7.offset = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field1761[var55] & 255;
         if(var56 == 0) {
            this.field1769[var55] = (short)var2.method2546();
            this.field1763[var55] = (short)var2.method2546();
            this.field1764[var55] = (short)var2.method2546();
         }

         if(var56 == 1) {
            this.field1769[var55] = (short)var3.method2546();
            this.field1763[var55] = (short)var3.method2546();
            this.field1764[var55] = (short)var3.method2546();
            this.field1765[var55] = (short)var4.method2546();
            this.field1766[var55] = (short)var4.method2546();
            this.field1745[var55] = (short)var4.method2546();
            this.field1768[var55] = (short)var5.method2546();
            this.field1771[var55] = var6.method2545();
            this.field1788[var55] = (short)var7.method2546();
         }

         if(var56 == 2) {
            this.field1769[var55] = (short)var3.method2546();
            this.field1763[var55] = (short)var3.method2546();
            this.field1764[var55] = (short)var3.method2546();
            this.field1765[var55] = (short)var4.method2546();
            this.field1766[var55] = (short)var4.method2546();
            this.field1745[var55] = (short)var4.method2546();
            this.field1768[var55] = (short)var5.method2546();
            this.field1771[var55] = var6.method2545();
            this.field1788[var55] = (short)var7.method2546();
            this.field1770[var55] = (short)var7.method2546();
         }

         if(var56 == 3) {
            this.field1769[var55] = (short)var3.method2546();
            this.field1763[var55] = (short)var3.method2546();
            this.field1764[var55] = (short)var3.method2546();
            this.field1765[var55] = (short)var4.method2546();
            this.field1766[var55] = (short)var4.method2546();
            this.field1745[var55] = (short)var4.method2546();
            this.field1768[var55] = (short)var5.method2546();
            this.field1771[var55] = var6.method2545();
            this.field1788[var55] = (short)var7.method2546();
         }
      }

      var2.offset = var26;
      var55 = var2.method2544();
      if(var55 != 0) {
         new class93();
         var2.method2546();
         var2.method2546();
         var2.method2546();
         var2.method2549();
      }

   }

   @ObfuscatedName("g")
   void method2247(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = var1.length - 18;
      int var9 = var4.method2546();
      int var10 = var4.method2546();
      int var11 = var4.method2544();
      int var12 = var4.method2544();
      int var13 = var4.method2544();
      int var14 = var4.method2544();
      int var15 = var4.method2544();
      int var16 = var4.method2544();
      int var17 = var4.method2546();
      int var18 = var4.method2546();
      int var19 = var4.method2546();
      int var20 = var4.method2546();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field1757 = var9;
      this.field1780 = var10;
      this.field1781 = var11;
      this.field1746 = new int[var9];
      this.field1747 = new int[var9];
      this.field1748 = new int[var9];
      this.field1750 = new int[var10];
      this.field1785 = new int[var10];
      this.field1752 = new int[var10];
      if(var11 > 0) {
         this.field1761 = new byte[var11];
         this.field1769 = new short[var11];
         this.field1763 = new short[var11];
         this.field1764 = new short[var11];
      }

      if(var16 == 1) {
         this.field1749 = new int[var9];
      }

      if(var12 == 1) {
         this.field1753 = new byte[var10];
         this.field1756 = new byte[var10];
         this.field1758 = new short[var10];
      }

      if(var13 == 255) {
         this.field1772 = new byte[var10];
      } else {
         this.field1759 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1754 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1760 = new int[var10];
      }

      this.field1773 = new short[var10];
      var4.offset = var21;
      var5.offset = var32;
      var6.offset = var33;
      var7.offset = var45;
      var8.offset = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method2544();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method2556();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method2556();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method2556();
         }

         this.field1746[var38] = var35 + var40;
         this.field1747[var38] = var36 + var41;
         this.field1748[var38] = var37 + var42;
         var35 = this.field1746[var38];
         var36 = this.field1747[var38];
         var37 = this.field1748[var38];
         if(var16 == 1) {
            this.field1749[var38] = var8.method2544();
         }
      }

      var4.offset = var30;
      var5.offset = var26;
      var6.offset = var24;
      var7.offset = var28;
      var8.offset = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field1773[var38] = (short)var4.method2546();
         if(var12 == 1) {
            var39 = var5.method2544();
            if((var39 & 1) == 1) {
               this.field1753[var38] = 1;
               var2 = true;
            } else {
               this.field1753[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field1756[var38] = (byte)(var39 >> 2);
               this.field1758[var38] = this.field1773[var38];
               this.field1773[var38] = 127;
               if(this.field1758[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field1756[var38] = -1;
               this.field1758[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field1772[var38] = var6.method2545();
         }

         if(var14 == 1) {
            this.field1754[var38] = var7.method2545();
         }

         if(var15 == 1) {
            this.field1760[var38] = var8.method2544();
         }
      }

      var4.offset = var29;
      var5.offset = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method2544();
         if(var43 == 1) {
            var38 = var4.method2556() + var41;
            var39 = var4.method2556() + var38;
            var40 = var4.method2556() + var39;
            var41 = var40;
            this.field1750[var42] = var38;
            this.field1785[var42] = var39;
            this.field1752[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method2556() + var41;
            var41 = var40;
            this.field1750[var42] = var38;
            this.field1785[var42] = var39;
            this.field1752[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method2556() + var41;
            var41 = var40;
            this.field1750[var42] = var38;
            this.field1785[var42] = var39;
            this.field1752[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method2556() + var41;
            var41 = var40;
            this.field1750[var42] = var38;
            this.field1785[var42] = var44;
            this.field1752[var42] = var40;
         }
      }

      var4.offset = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field1761[var42] = 0;
         this.field1769[var42] = (short)var4.method2546();
         this.field1763[var42] = (short)var4.method2546();
         this.field1764[var42] = (short)var4.method2546();
      }

      if(this.field1756 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field1756[var43] & 255;
            if(var44 != 255) {
               if((this.field1769[var44] & '\uffff') == this.field1750[var43] && (this.field1763[var44] & '\uffff') == this.field1785[var43] && (this.field1764[var44] & '\uffff') == this.field1752[var43]) {
                  this.field1756[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            this.field1756 = null;
         }
      }

      if(!var3) {
         this.field1758 = null;
      }

      if(!var2) {
         this.field1753 = null;
      }

   }

   public ModelData(ModelData[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field1757 = 0;
      this.field1780 = 0;
      this.field1781 = 0;
      this.field1759 = -1;

      int var9;
      ModelData var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field1757 += var10.field1757;
            this.field1780 += var10.field1780;
            this.field1781 += var10.field1781;
            if(var10.field1772 != null) {
               var4 = true;
            } else {
               if(this.field1759 == -1) {
                  this.field1759 = var10.field1759;
               }

               if(this.field1759 != var10.field1759) {
                  var4 = true;
               }
            }

            var3 |= var10.field1753 != null;
            var5 |= var10.field1754 != null;
            var6 |= var10.field1760 != null;
            var7 |= var10.field1758 != null;
            var8 |= var10.field1756 != null;
         }
      }

      this.field1746 = new int[this.field1757];
      this.field1747 = new int[this.field1757];
      this.field1748 = new int[this.field1757];
      this.field1749 = new int[this.field1757];
      this.field1750 = new int[this.field1780];
      this.field1785 = new int[this.field1780];
      this.field1752 = new int[this.field1780];
      if(var3) {
         this.field1753 = new byte[this.field1780];
      }

      if(var4) {
         this.field1772 = new byte[this.field1780];
      }

      if(var5) {
         this.field1754 = new byte[this.field1780];
      }

      if(var6) {
         this.field1760 = new int[this.field1780];
      }

      if(var7) {
         this.field1758 = new short[this.field1780];
      }

      if(var8) {
         this.field1756 = new byte[this.field1780];
      }

      this.field1773 = new short[this.field1780];
      if(this.field1781 > 0) {
         this.field1761 = new byte[this.field1781];
         this.field1769 = new short[this.field1781];
         this.field1763 = new short[this.field1781];
         this.field1764 = new short[this.field1781];
         this.field1765 = new short[this.field1781];
         this.field1766 = new short[this.field1781];
         this.field1745 = new short[this.field1781];
         this.field1768 = new short[this.field1781];
         this.field1771 = new byte[this.field1781];
         this.field1788 = new short[this.field1781];
         this.field1770 = new short[this.field1781];
      }

      this.field1757 = 0;
      this.field1780 = 0;
      this.field1781 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field1780; ++var11) {
               if(var3 && var10.field1753 != null) {
                  this.field1753[this.field1780] = var10.field1753[var11];
               }

               if(var4) {
                  if(var10.field1772 != null) {
                     this.field1772[this.field1780] = var10.field1772[var11];
                  } else {
                     this.field1772[this.field1780] = var10.field1759;
                  }
               }

               if(var5 && var10.field1754 != null) {
                  this.field1754[this.field1780] = var10.field1754[var11];
               }

               if(var6 && var10.field1760 != null) {
                  this.field1760[this.field1780] = var10.field1760[var11];
               }

               if(var7) {
                  if(var10.field1758 != null) {
                     this.field1758[this.field1780] = var10.field1758[var11];
                  } else {
                     this.field1758[this.field1780] = -1;
                  }
               }

               if(var8) {
                  if(var10.field1756 != null && var10.field1756[var11] != -1) {
                     this.field1756[this.field1780] = (byte)(var10.field1756[var11] + this.field1781);
                  } else {
                     this.field1756[this.field1780] = -1;
                  }
               }

               this.field1773[this.field1780] = var10.field1773[var11];
               this.field1750[this.field1780] = this.method2285(var10, var10.field1750[var11]);
               this.field1785[this.field1780] = this.method2285(var10, var10.field1785[var11]);
               this.field1752[this.field1780] = this.method2285(var10, var10.field1752[var11]);
               ++this.field1780;
            }

            for(var11 = 0; var11 < var10.field1781; ++var11) {
               byte var12 = this.field1761[this.field1781] = var10.field1761[var11];
               if(var12 == 0) {
                  this.field1769[this.field1781] = (short)this.method2285(var10, var10.field1769[var11]);
                  this.field1763[this.field1781] = (short)this.method2285(var10, var10.field1763[var11]);
                  this.field1764[this.field1781] = (short)this.method2285(var10, var10.field1764[var11]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.field1769[this.field1781] = var10.field1769[var11];
                  this.field1763[this.field1781] = var10.field1763[var11];
                  this.field1764[this.field1781] = var10.field1764[var11];
                  this.field1765[this.field1781] = var10.field1765[var11];
                  this.field1766[this.field1781] = var10.field1766[var11];
                  this.field1745[this.field1781] = var10.field1745[var11];
                  this.field1768[this.field1781] = var10.field1768[var11];
                  this.field1771[this.field1781] = var10.field1771[var11];
                  this.field1788[this.field1781] = var10.field1788[var11];
               }

               if(var12 == 2) {
                  this.field1770[this.field1781] = var10.field1770[var11];
               }

               ++this.field1781;
            }
         }
      }

   }

   @ObfuscatedSignature(
      signature = "(LModelData;ZZZZ)V",
      garbageValue = "1"
   )
   public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1757 = var1.field1757;
      this.field1780 = var1.field1780;
      this.field1781 = var1.field1781;
      int var6;
      if(var2) {
         this.field1746 = var1.field1746;
         this.field1747 = var1.field1747;
         this.field1748 = var1.field1748;
      } else {
         this.field1746 = new int[this.field1757];
         this.field1747 = new int[this.field1757];
         this.field1748 = new int[this.field1757];

         for(var6 = 0; var6 < this.field1757; ++var6) {
            this.field1746[var6] = var1.field1746[var6];
            this.field1747[var6] = var1.field1747[var6];
            this.field1748[var6] = var1.field1748[var6];
         }
      }

      if(var3) {
         this.field1773 = var1.field1773;
      } else {
         this.field1773 = new short[this.field1780];

         for(var6 = 0; var6 < this.field1780; ++var6) {
            this.field1773[var6] = var1.field1773[var6];
         }
      }

      if(!var4 && var1.field1758 != null) {
         this.field1758 = new short[this.field1780];

         for(var6 = 0; var6 < this.field1780; ++var6) {
            this.field1758[var6] = var1.field1758[var6];
         }
      } else {
         this.field1758 = var1.field1758;
      }

      this.field1754 = var1.field1754;
      this.field1750 = var1.field1750;
      this.field1785 = var1.field1785;
      this.field1752 = var1.field1752;
      this.field1753 = var1.field1753;
      this.field1772 = var1.field1772;
      this.field1756 = var1.field1756;
      this.field1759 = var1.field1759;
      this.field1761 = var1.field1761;
      this.field1769 = var1.field1769;
      this.field1763 = var1.field1763;
      this.field1764 = var1.field1764;
      this.field1765 = var1.field1765;
      this.field1766 = var1.field1766;
      this.field1745 = var1.field1745;
      this.field1768 = var1.field1768;
      this.field1771 = var1.field1771;
      this.field1788 = var1.field1788;
      this.field1770 = var1.field1770;
      this.field1749 = var1.field1749;
      this.field1760 = var1.field1760;
      this.field1774 = var1.field1774;
      this.field1775 = var1.field1775;
      this.field1777 = var1.field1777;
      this.field1776 = var1.field1776;
      this.field1755 = var1.field1755;
      this.field1779 = var1.field1779;
      this.field1783 = var1.field1783;
   }

   @ObfuscatedName("u")
   public ModelData method2249() {
      ModelData var1 = new ModelData();
      if(this.field1753 != null) {
         var1.field1753 = new byte[this.field1780];

         for(int var2 = 0; var2 < this.field1780; ++var2) {
            var1.field1753[var2] = this.field1753[var2];
         }
      }

      var1.field1757 = this.field1757;
      var1.field1780 = this.field1780;
      var1.field1781 = this.field1781;
      var1.field1746 = this.field1746;
      var1.field1747 = this.field1747;
      var1.field1748 = this.field1748;
      var1.field1750 = this.field1750;
      var1.field1785 = this.field1785;
      var1.field1752 = this.field1752;
      var1.field1772 = this.field1772;
      var1.field1754 = this.field1754;
      var1.field1756 = this.field1756;
      var1.field1773 = this.field1773;
      var1.field1758 = this.field1758;
      var1.field1759 = this.field1759;
      var1.field1761 = this.field1761;
      var1.field1769 = this.field1769;
      var1.field1763 = this.field1763;
      var1.field1764 = this.field1764;
      var1.field1765 = this.field1765;
      var1.field1766 = this.field1766;
      var1.field1745 = this.field1745;
      var1.field1768 = this.field1768;
      var1.field1771 = this.field1771;
      var1.field1788 = this.field1788;
      var1.field1770 = this.field1770;
      var1.field1749 = this.field1749;
      var1.field1760 = this.field1760;
      var1.field1774 = this.field1774;
      var1.field1775 = this.field1775;
      var1.field1777 = this.field1777;
      var1.field1776 = this.field1776;
      var1.field1779 = this.field1779;
      var1.field1783 = this.field1783;
      return var1;
   }

   @ObfuscatedName("w")
   public void method2250(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1757; ++var4) {
         this.field1746[var4] += var1;
         this.field1747[var4] += var2;
         this.field1748[var4] += var3;
      }

      this.method2281();
   }

   @ObfuscatedName("l")
   @Export("computeAnimationTables")
   void computeAnimationTables() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field1749 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1757; ++var3) {
            var4 = this.field1749[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1774 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1774[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1757; this.field1774[var4][var1[var4]++] = var3++) {
            var4 = this.field1749[var3];
         }

         this.field1749 = null;
      }

      if(this.field1760 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1780; ++var3) {
            var4 = this.field1760[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1775 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1775[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1780; this.field1775[var4][var1[var4]++] = var3++) {
            var4 = this.field1760[var3];
         }

         this.field1760 = null;
      }

   }

   @ObfuscatedName("m")
   public void method2252() {
      for(int var1 = 0; var1 < this.field1757; ++var1) {
         int var2 = this.field1746[var1];
         this.field1746[var1] = this.field1748[var1];
         this.field1748[var1] = -var2;
      }

      this.method2281();
   }

   @ObfuscatedName("j")
   public void method2253() {
      for(int var1 = 0; var1 < this.field1757; ++var1) {
         this.field1746[var1] = -this.field1746[var1];
         this.field1748[var1] = -this.field1748[var1];
      }

      this.method2281();
   }

   @ObfuscatedName("as")
   static final int method2255(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedName("k")
   public void method2258(short var1, short var2) {
      if(this.field1758 != null) {
         for(int var3 = 0; var3 < this.field1780; ++var3) {
            if(this.field1758[var3] == var1) {
               this.field1758[var3] = var2;
            }
         }

      }
   }

   @ObfuscatedName("z")
   public void method2259() {
      int var1;
      for(var1 = 0; var1 < this.field1757; ++var1) {
         this.field1748[var1] = -this.field1748[var1];
      }

      for(var1 = 0; var1 < this.field1780; ++var1) {
         int var2 = this.field1750[var1];
         this.field1750[var1] = this.field1752[var1];
         this.field1752[var1] = var2;
      }

      this.method2281();
   }

   @ObfuscatedName("q")
   public void method2260(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1757; ++var4) {
         this.field1746[var4] = this.field1746[var4] * var1 / 128;
         this.field1747[var4] = this.field1747[var4] * var2 / 128;
         this.field1748[var4] = this.field1748[var4] * var3 / 128;
      }

      this.method2281();
   }

   @ObfuscatedName("o")
   @Export("computeNormals")
   public void computeNormals() {
      if(this.field1777 == null) {
         this.field1777 = new VertexNormal[this.field1757];

         int var1;
         for(var1 = 0; var1 < this.field1757; ++var1) {
            this.field1777[var1] = new VertexNormal();
         }

         for(var1 = 0; var1 < this.field1780; ++var1) {
            int var2 = this.field1750[var1];
            int var3 = this.field1785[var1];
            int var4 = this.field1752[var1];
            int var5 = this.field1746[var3] - this.field1746[var2];
            int var6 = this.field1747[var3] - this.field1747[var2];
            int var7 = this.field1748[var3] - this.field1748[var2];
            int var8 = this.field1746[var4] - this.field1746[var2];
            int var9 = this.field1747[var4] - this.field1747[var2];
            int var10 = this.field1748[var4] - this.field1748[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field1753 == null) {
               var15 = 0;
            } else {
               var15 = this.field1753[var1];
            }

            if(var15 == 0) {
               VertexNormal var16 = this.field1777[var2];
               var16.field1689 += var11;
               var16.field1684 += var12;
               var16.field1685 += var13;
               ++var16.field1683;
               var16 = this.field1777[var3];
               var16.field1689 += var11;
               var16.field1684 += var12;
               var16.field1685 += var13;
               ++var16.field1683;
               var16 = this.field1777[var4];
               var16.field1689 += var11;
               var16.field1684 += var12;
               var16.field1685 += var13;
               ++var16.field1683;
            } else if(var15 == 1) {
               if(this.field1776 == null) {
                  this.field1776 = new FaceNormal[this.field1780];
               }

               FaceNormal var17 = this.field1776[var1] = new FaceNormal();
               var17.field1504 = var11;
               var17.field1506 = var12;
               var17.field1503 = var13;
            }
         }

      }
   }

   @ObfuscatedName("b")
   void method2263() {
      if(!this.field1789) {
         super.modelHeight = 0;
         this.field1782 = 0;
         this.field1762 = 999999;
         this.field1784 = -999999;
         this.field1751 = -99999;
         this.field1786 = 99999;

         for(int var1 = 0; var1 < this.field1757; ++var1) {
            int var2 = this.field1746[var1];
            int var3 = this.field1747[var1];
            int var4 = this.field1748[var1];
            if(var2 < this.field1762) {
               this.field1762 = var2;
            }

            if(var2 > this.field1784) {
               this.field1784 = var2;
            }

            if(var4 < this.field1786) {
               this.field1786 = var4;
            }

            if(var4 > this.field1751) {
               this.field1751 = var4;
            }

            if(-var3 > super.modelHeight) {
               super.modelHeight = -var3;
            }

            if(var3 > this.field1782) {
               this.field1782 = var3;
            }
         }

         this.field1789 = true;
      }
   }

   @ObfuscatedName("t")
   static void method2264(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      var0.method2263();
      var0.computeNormals();
      var1.method2263();
      var1.computeNormals();
      ++field1778;
      int var6 = 0;
      int[] var7 = var1.field1746;
      int var8 = var1.field1757;

      int var9;
      for(var9 = 0; var9 < var0.field1757; ++var9) {
         VertexNormal var10 = var0.field1777[var9];
         if(var10.field1683 != 0) {
            int var11 = var0.field1747[var9] - var3;
            if(var11 <= var1.field1782) {
               int var12 = var0.field1746[var9] - var2;
               if(var12 >= var1.field1762 && var12 <= var1.field1784) {
                  int var13 = var0.field1748[var9] - var4;
                  if(var13 >= var1.field1786 && var13 <= var1.field1751) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        VertexNormal var15 = var1.field1777[var14];
                        if(var12 == var7[var14] && var13 == var1.field1748[var14] && var11 == var1.field1747[var14] && var15.field1683 != 0) {
                           if(var0.field1755 == null) {
                              var0.field1755 = new VertexNormal[var0.field1757];
                           }

                           if(var1.field1755 == null) {
                              var1.field1755 = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.field1755[var9];
                           if(var16 == null) {
                              var16 = var0.field1755[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.field1755[var14];
                           if(var17 == null) {
                              var17 = var1.field1755[var14] = new VertexNormal(var15);
                           }

                           var16.field1689 += var15.field1689;
                           var16.field1684 += var15.field1684;
                           var16.field1685 += var15.field1685;
                           var16.field1683 += var15.field1683;
                           var17.field1689 += var10.field1689;
                           var17.field1684 += var10.field1684;
                           var17.field1685 += var10.field1685;
                           var17.field1683 += var10.field1683;
                           ++var6;
                           field1787[var9] = field1778;
                           field1767[var14] = field1778;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field1780; ++var9) {
            if(field1787[var0.field1750[var9]] == field1778 && field1787[var0.field1785[var9]] == field1778 && field1787[var0.field1752[var9]] == field1778) {
               if(var0.field1753 == null) {
                  var0.field1753 = new byte[var0.field1780];
               }

               var0.field1753[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field1780; ++var9) {
            if(field1767[var1.field1750[var9]] == field1778 && field1767[var1.field1785[var9]] == field1778 && field1767[var1.field1752[var9]] == field1778) {
               if(var1.field1753 == null) {
                  var1.field1753 = new byte[var1.field1780];
               }

               var1.field1753[var9] = 2;
            }
         }

      }
   }

   @ObfuscatedName("a")
   public final Model method2265(int var1, int var2, int var3, int var4, int var5) {
      this.computeNormals();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.field1871 = new int[this.field1780];
      var8.field1885 = new int[this.field1780];
      var8.field1856 = new int[this.field1780];
      if(this.field1781 > 0 && this.field1756 != null) {
         int[] var16 = new int[this.field1781];

         int var10;
         for(var10 = 0; var10 < this.field1780; ++var10) {
            if(this.field1756[var10] != -1) {
               ++var16[this.field1756[var10] & 255];
            }
         }

         var8.field1875 = 0;

         for(var10 = 0; var10 < this.field1781; ++var10) {
            if(var16[var10] > 0 && this.field1761[var10] == 0) {
               ++var8.field1875;
            }
         }

         var8.field1908 = new int[var8.field1875];
         var8.field1877 = new int[var8.field1875];
         var8.field1918 = new int[var8.field1875];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field1781; ++var11) {
            if(var16[var11] > 0 && this.field1761[var11] == 0) {
               var8.field1908[var10] = this.field1769[var11] & '\uffff';
               var8.field1877[var10] = this.field1763[var11] & '\uffff';
               var8.field1918[var10] = this.field1764[var11] & '\uffff';
               var16[var11] = var10++;
            } else {
               var16[var11] = -1;
            }
         }

         var8.field1873 = new byte[this.field1780];

         for(var11 = 0; var11 < this.field1780; ++var11) {
            if(this.field1756[var11] != -1) {
               var8.field1873[var11] = (byte)var16[this.field1756[var11] & 255];
            } else {
               var8.field1873[var11] = -1;
            }
         }
      }

      for(int var9 = 0; var9 < this.field1780; ++var9) {
         byte var17;
         if(this.field1753 == null) {
            var17 = 0;
         } else {
            var17 = this.field1753[var9];
         }

         byte var18;
         if(this.field1754 == null) {
            var18 = 0;
         } else {
            var18 = this.field1754[var9];
         }

         short var12;
         if(this.field1758 == null) {
            var12 = -1;
         } else {
            var12 = this.field1758[var9];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         VertexNormal var13;
         int var14;
         FaceNormal var19;
         if(var12 == -1) {
            if(var17 != 0) {
               if(var17 == 1) {
                  var19 = this.field1776[var9];
                  var14 = var1 + (var3 * var19.field1504 + var4 * var19.field1506 + var5 * var19.field1503) / (var7 + var7 / 2);
                  var8.field1871[var9] = method2266(this.field1773[var9] & '\uffff', var14);
                  var8.field1856[var9] = -1;
               } else if(var17 == 3) {
                  var8.field1871[var9] = 128;
                  var8.field1856[var9] = -1;
               } else {
                  var8.field1856[var9] = -2;
               }
            } else {
               int var15 = this.field1773[var9] & '\uffff';
               if(this.field1755 != null && this.field1755[this.field1750[var9]] != null) {
                  var13 = this.field1755[this.field1750[var9]];
               } else {
                  var13 = this.field1777[this.field1750[var9]];
               }

               var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
               var8.field1871[var9] = method2266(var15, var14);
               if(this.field1755 != null && this.field1755[this.field1785[var9]] != null) {
                  var13 = this.field1755[this.field1785[var9]];
               } else {
                  var13 = this.field1777[this.field1785[var9]];
               }

               var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
               var8.field1885[var9] = method2266(var15, var14);
               if(this.field1755 != null && this.field1755[this.field1752[var9]] != null) {
                  var13 = this.field1755[this.field1752[var9]];
               } else {
                  var13 = this.field1777[this.field1752[var9]];
               }

               var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
               var8.field1856[var9] = method2266(var15, var14);
            }
         } else if(var17 != 0) {
            if(var17 == 1) {
               var19 = this.field1776[var9];
               var14 = var1 + (var3 * var19.field1504 + var4 * var19.field1506 + var5 * var19.field1503) / (var7 + var7 / 2);
               var8.field1871[var9] = method2255(var14);
               var8.field1856[var9] = -1;
            } else {
               var8.field1856[var9] = -2;
            }
         } else {
            if(this.field1755 != null && this.field1755[this.field1750[var9]] != null) {
               var13 = this.field1755[this.field1750[var9]];
            } else {
               var13 = this.field1777[this.field1750[var9]];
            }

            var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
            var8.field1871[var9] = method2255(var14);
            if(this.field1755 != null && this.field1755[this.field1785[var9]] != null) {
               var13 = this.field1755[this.field1785[var9]];
            } else {
               var13 = this.field1777[this.field1785[var9]];
            }

            var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
            var8.field1885[var9] = method2255(var14);
            if(this.field1755 != null && this.field1755[this.field1752[var9]] != null) {
               var13 = this.field1755[this.field1752[var9]];
            } else {
               var13 = this.field1777[this.field1752[var9]];
            }

            var14 = var1 + (var3 * var13.field1689 + var4 * var13.field1684 + var5 * var13.field1685) / (var7 * var13.field1683);
            var8.field1856[var9] = method2255(var14);
         }
      }

      this.computeAnimationTables();
      var8.field1859 = this.field1757;
      var8.verticesX = this.field1746;
      var8.verticesY = this.field1747;
      var8.verticesZ = this.field1748;
      var8.field1863 = this.field1780;
      var8.indices1 = this.field1750;
      var8.indices2 = this.field1785;
      var8.indices3 = this.field1752;
      var8.field1903 = this.field1772;
      var8.field1912 = this.field1754;
      var8.field1874 = this.field1759;
      var8.field1879 = this.field1774;
      var8.field1880 = this.field1775;
      var8.field1884 = this.field1758;
      return var8;
   }

   @ObfuscatedName("am")
   static final int method2266(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "256"
   )
   public void method2272(int var1) {
      int var2 = field1790[var1];
      int var3 = field1791[var1];

      for(int var4 = 0; var4 < this.field1757; ++var4) {
         int var5 = this.field1748[var4] * var2 + this.field1746[var4] * var3 >> 16;
         this.field1748[var4] = this.field1748[var4] * var3 - this.field1746[var4] * var2 >> 16;
         this.field1746[var4] = var5;
      }

      this.method2281();
   }

   @ObfuscatedName("f")
   void method2281() {
      this.field1777 = null;
      this.field1755 = null;
      this.field1776 = null;
      this.field1789 = false;
   }

   @ObfuscatedName("n")
   final int method2285(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = var1.field1746[var2];
      int var5 = var1.field1747[var2];
      int var6 = var1.field1748[var2];

      for(int var7 = 0; var7 < this.field1757; ++var7) {
         if(var4 == this.field1746[var7] && var5 == this.field1747[var7] && var6 == this.field1748[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field1746[this.field1757] = var4;
         this.field1747[this.field1757] = var5;
         this.field1748[this.field1757] = var6;
         if(var1.field1749 != null) {
            this.field1749[this.field1757] = var1.field1749[var2];
         }

         var3 = this.field1757++;
      }

      return var3;
   }

   ModelData() {
   }

   @ObfuscatedName("r")
   public void method2310() {
      for(int var1 = 0; var1 < this.field1757; ++var1) {
         int var2 = this.field1748[var1];
         this.field1748[var1] = this.field1746[var1];
         this.field1746[var1] = -var2;
      }

      this.method2281();
   }

   @ObfuscatedName("d")
   public ModelData method2311(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2263();
      int var7 = var2 + this.field1762;
      int var8 = var2 + this.field1784;
      int var9 = var4 + this.field1786;
      int var10 = var4 + this.field1751;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11 = new ModelData();
            var11.field1757 = this.field1757;
            var11.field1780 = this.field1780;
            var11.field1781 = this.field1781;
            var11.field1746 = this.field1746;
            var11.field1748 = this.field1748;
            var11.field1750 = this.field1750;
            var11.field1785 = this.field1785;
            var11.field1752 = this.field1752;
            var11.field1753 = this.field1753;
            var11.field1772 = this.field1772;
            var11.field1754 = this.field1754;
            var11.field1756 = this.field1756;
            var11.field1773 = this.field1773;
            var11.field1758 = this.field1758;
            var11.field1759 = this.field1759;
            var11.field1761 = this.field1761;
            var11.field1769 = this.field1769;
            var11.field1763 = this.field1763;
            var11.field1764 = this.field1764;
            var11.field1765 = this.field1765;
            var11.field1766 = this.field1766;
            var11.field1745 = this.field1745;
            var11.field1768 = this.field1768;
            var11.field1771 = this.field1771;
            var11.field1788 = this.field1788;
            var11.field1770 = this.field1770;
            var11.field1749 = this.field1749;
            var11.field1760 = this.field1760;
            var11.field1774 = this.field1774;
            var11.field1775 = this.field1775;
            var11.field1779 = this.field1779;
            var11.field1783 = this.field1783;
            var11.field1747 = new int[var11.field1757];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field1757; ++var12) {
                  var13 = this.field1746[var12] + var2;
                  var14 = this.field1748[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1747[var12] = this.field1747[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1757; ++var12) {
                  var13 = (-this.field1747[var12] << 16) / super.modelHeight;
                  if(var13 < var6) {
                     var14 = this.field1746[var12] + var2;
                     var15 = this.field1748[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1747[var12] = this.field1747[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method2281();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("x")
   public void method2315(short var1, short var2) {
      for(int var3 = 0; var3 < this.field1780; ++var3) {
         if(this.field1773[var3] == var1) {
            this.field1773[var3] = var2;
         }
      }

   }
}