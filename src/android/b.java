package de.paystory.thermal_printer;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class b {
  private static String e;
  private static volatile b f;
  private String a = null;
  private double b = 0.0;
  private boolean c = false;
  private boolean d;

  private b() {
    new ArrayList();
    this.d = false;
    this.a = this.f();
  }

  public static b e() {
    if (f == null) {
      Class var0 = b.class;
      synchronized(b.class){}

      Throwable var10000;
      boolean var10001;
      b var14;
      try {
        var14 = f;
      } catch (Throwable var13) {
        var10000 = var13;
        var10001 = false;
        try {
          throw var10000;
        } catch (Throwable ex) {
          throw new RuntimeException(ex);
        }
      }

      if (var14 == null) {
        try {
          f = new b();
        } catch (Throwable var12) {
          var10000 = var12;
          var10001 = false;
          try {
            throw var10000;
          } catch (Throwable ex) {
            throw new RuntimeException(ex);
          }
        }
      }

      try {
        return f;
      } catch (Throwable var11) {
        var10000 = var11;
        var10001 = false;
        try {
          throw var10000;
        } catch (Throwable ex) {
          throw new RuntimeException(ex);
        }
      }
    } else {
      return f;
    }
  }

  private boolean j() {
    return !TextUtils.isEmpty(this.a) && (this.a.contains("D3-504") || this.a.contains("D3-505") || this.a.contains("D3-506") || this.a.contains("D1-Pro") || this.a.equals("D1") || this.a.contains("D1-503") || this.a.contains("D1-501") || this.a.contains("D1p-602") || this.a.contains("D1p-603") || this.a.contains("D2-401") || this.a.contains("D2-402") || this.a.contains("D2 Pro") || this.a.contains("D1w-703") || this.a.contains("D1w-702") || this.a.contains("D1w-701") || this.a.contains("D4-501") || this.a.contains("D4-502") || this.a.contains("D4-503") || this.a.contains("D4-504") || this.a.contains("D4-505") || this.a.contains("K2-201") || this.a.contains("K1-101") || this.a.contains("R1-202") || this.a.contains("R1-201") || this.a.contains("S1-701") || this.a.contains("S1-702") || this.a.contains("M2-Max") || this.a.contains("M2-Pro") || this.a.contains("M2-203") || this.a.contains("M2-202") || this.a.contains("I22T01") || this.a.contains("IF22-1") || this.a.contains("Swift 1") || this.a.contains("Swan 1") || this.a.contains("Lark 1") || this.a.contains("DS1-11") || this.a.contains("Falcon 1"));
  }

  private String a(String var1) {
    byte var2;
    label276: {
      var2 = -1;
      byte var10000;
      switch (var1.hashCode()) {
        case 46970555:
          if (!var1.equals("1824D")) {
            break label276;
          }

          var10000 = 31;
          break;
        case 46970564:
          if (!var1.equals("1824M")) {
            break label276;
          }

          var10000 = 30;
          break;
        case 46970567:
          if (!var1.equals("1824P")) {
            break label276;
          }

          var10000 = 16;
          break;
        case 64337798:
          if (!var1.equals("D20TX")) {
            break label276;
          }

          var10000 = 34;
          break;
        case 64337922:
          if (!var1.equals("D20XX")) {
            break label276;
          }

          var10000 = 33;
          break;
        case 64338711:
          if (!var1.equals("D224G")) {
            break label276;
          }

          var10000 = 43;
          break;
        case 64339720:
          if (!var1.equals("D22TX")) {
            break label276;
          }

          var10000 = 45;
          break;
        case 64339844:
          if (!var1.equals("D22XX")) {
            break label276;
          }

          var10000 = 44;
          break;
        case 70803282:
          if (!var1.equals("K21PX")) {
            break label276;
          }

          var10000 = 47;
          break;
        case 70803530:
          if (!var1.equals("K21XX")) {
            break label276;
          }

          var10000 = 32;
          break;
        case 75423669:
          if (!var1.equals("P24MP")) {
            break label276;
          }

          var10000 = 17;
          break;
        case 75424010:
          if (!var1.equals("P24XP")) {
            break label276;
          }

          var10000 = 18;
          break;
        case 80953364:
          if (!var1.equals("V1GPX")) {
            break label276;
          }

          var10000 = 12;
          break;
        case 80953612:
          if (!var1.equals("V1GXX")) {
            break label276;
          }

          var10000 = 11;
          break;
        case 80962261:
          if (!var1.equals("V1PXX")) {
            break label276;
          }

          var10000 = 14;
          break;
        case 80969949:
          if (!var1.equals("V1XXX")) {
            break label276;
          }

          var10000 = 13;
          break;
        case 80978598:
          if (!var1.equals("V2BXX")) {
            break label276;
          }

          var10000 = 15;
          break;
        case 81861075:
          if (!var1.equals("W17BX")) {
            break label276;
          }

          var10000 = 35;
          break;
        case 81861509:
          if (!var1.equals("W17PX")) {
            break label276;
          }

          var10000 = 37;
          break;
        case 81861757:
          if (!var1.equals("W17XX")) {
            break label276;
          }

          var10000 = 36;
          break;
        case 81885162:
          if (!var1.equals("W21DX")) {
            break label276;
          }

          var10000 = 2;
          break;
        case 81885441:
          if (!var1.equals("W21MX")) {
            break label276;
          }

          var10000 = 1;
          break;
        case 81885782:
          if (!var1.equals("W21XX")) {
            break label276;
          }

          var10000 = 0;
          break;
        case 81886102:
          if (!var1.equals("W22DC")) {
            break label276;
          }

          var10000 = 6;
          break;
        case 81886123:
          if (!var1.equals("W22DX")) {
            break label276;
          }

          var10000 = 5;
          break;
        case 81886402:
          if (!var1.equals("W22MX")) {
            break label276;
          }

          var10000 = 4;
          break;
        case 81886743:
          if (!var1.equals("W22XX")) {
            break label276;
          }

          var10000 = 3;
          break;
        case 81887063:
          if (!var1.equals("W23DC")) {
            break label276;
          }

          var10000 = 10;
          break;
        case 81887076:
          if (!var1.equals("W23DP")) {
            break label276;
          }

          var10000 = 50;
          break;
        case 81887084:
          if (!var1.equals("W23DX")) {
            break label276;
          }

          var10000 = 9;
          break;
        case 81887355:
          if (!var1.equals("W23MP")) {
            break label276;
          }

          var10000 = 49;
          break;
        case 81887363:
          if (!var1.equals("W23MX")) {
            break label276;
          }

          var10000 = 8;
          break;
        case 81887456:
          if (!var1.equals("W23PX")) {
            break label276;
          }

          var10000 = 48;
          break;
        case 81887704:
          if (!var1.equals("W23XX")) {
            break label276;
          }

          var10000 = 7;
          break;
        case 81890052:
          if (!var1.equals("W26GP")) {
            break label276;
          }

          var10000 = 42;
          break;
        case 81890071:
          if (!var1.equals("W26HD")) {
            break label276;
          }

          var10000 = 40;
          break;
        case 81890074:
          if (!var1.equals("W26HG")) {
            break label276;
          }

          var10000 = 41;
          break;
        case 81890080:
          if (!var1.equals("W26HM")) {
            break label276;
          }

          var10000 = 39;
          break;
        case 81890091:
          if (!var1.equals("W26HX")) {
            break label276;
          }

          var10000 = 38;
          break;
        case 81890238:
          if (!var1.equals("W26MP")) {
            break label276;
          }

          var10000 = 22;
          break;
        case 81890246:
          if (!var1.equals("W26MX")) {
            break label276;
          }

          var10000 = 21;
          break;
        case 81890339:
          if (!var1.equals("W26PX")) {
            break label276;
          }

          var10000 = 20;
          break;
        case 81890587:
          if (!var1.equals("W26XX")) {
            break label276;
          }

          var10000 = 19;
          break;
        case 81890920:
          if (!var1.equals("W27DP")) {
            break label276;
          }

          var10000 = 46;
          break;
        case 81890928:
          if (!var1.equals("W27DX")) {
            break label276;
          }

          var10000 = 29;
          break;
        case 81891156:
          if (!var1.equals("W27LD")) {
            break label276;
          }

          var10000 = 24;
          break;
        case 81891176:
          if (!var1.equals("W27LX")) {
            break label276;
          }

          var10000 = 23;
          break;
        case 81891199:
          if (!var1.equals("W27MP")) {
            break label276;
          }

          var10000 = 28;
          break;
        case 81891207:
          if (!var1.equals("W27MX")) {
            break label276;
          }

          var10000 = 27;
          break;
        case 81891300:
          if (!var1.equals("W27PX")) {
            break label276;
          }

          var10000 = 26;
          break;
        case 81891548:
          if (!var1.equals("W27XX")) {
            break label276;
          }

          var10000 = 25;
          break;
        case 81891982:
          if (!var1.equals("W28GX")) {
            break label276;
          }

          var10000 = 53;
          break;
        case 81892168:
          if (!var1.equals("W28MX")) {
            break label276;
          }

          var10000 = 52;
          break;
        case 81892509:
          if (var1.equals("W28XX")) {
            var10000 = 51;
            break;
          }
        default:
          break label276;
      }

      var2 = var10000;
    }

    switch (var2) {
      case 0:
        return "D1-501";
      case 1:
        return "D1-502";
      case 2:
        return "D1-503";
      case 3:
        return "D1p-601";
      case 4:
        return "D1p-602";
      case 5:
        return "D1p-603";
      case 6:
        return "D1p-604";
      case 7:
        return "D1w-701";
      case 8:
        return "D1w-702";
      case 9:
        return "D1w-703";
      case 10:
        return "D1w-704";
      case 11:
      case 12:
        return "D2-401";
      case 13:
      case 14:
        return "D2-402";
      case 15:
        return "D2 Pro";
      case 16:
        return "D3-501";
      case 17:
        return "D3-503";
      case 18:
        return "D3-502";
      case 19:
      case 20:
        return "D3-504";
      case 21:
      case 22:
        return "D3-505";
      case 23:
        return "D4-501";
      case 24:
        return "D4-502";
      case 25:
      case 26:
        return "D4-503";
      case 27:
      case 28:
        return "D4-504";
      case 29:
        return "D4-505";
      case 30:
        return "1824M";
      case 31:
        return "1824D";
      case 32:
        return "K1-101";
      case 33:
        return "R1-201";
      case 34:
        return "R1-202";
      case 35:
        this.b = 21.5;
        this.c = true;
        return "S1-702";
      case 36:
      case 37:
        this.b = 21.5;
        this.c = true;
        return "S1-701";
      case 38:
        return "D3-504";
      case 39:
        return "D3-505";
      case 40:
        return "D3-506";
      case 41:
      case 42:
        return "K2-201";
      case 43:
        return "R2-301";
      case 44:
        return "R2-301";
      case 45:
        return "R2-302";
      case 46:
        return "D4-505";
      case 47:
        return "K1-101";
      case 48:
        return "D1w-701";
      case 49:
        return "D1w-702";
      case 50:
        return "D1w-703";
      case 51:
        return "Swan 1";
      case 52:
        return "Swan 1";
      case 53:
        return "Swan 1k";
      default:
        return "";
    }
  }

  public String i() {
    if (VERSION.SDK_INT >= 29) {
      return "".equals(this.b("ro.serialno")) ? this.b("persist.sys.imin.sn") : this.b("ro.serialno");
    } else {
      return Build.SERIAL;
    }
  }

  public String f() {
    String var1;
    if ((var1 = this.a) != null) {
      return var1;
    } else {
      this.a = "";
      this.d = false;
      if (!TextUtils.isEmpty(var1 = this.g()) && var1.startsWith("mt")) {
        this.a = this.b("ro.neostra.imin_model");
      } else if (!TextUtils.isEmpty(var1) && var1.startsWith("ums512")) {
        this.a = Build.MODEL;
      } else if (!TextUtils.isEmpty(var1) && var1.startsWith("sp9863a")) {
        if ((this.a = Build.MODEL).equals("I22M01")) {
          this.a = "MS1-11";
        }
      } else {
        this.a = this.b("sys.neostra_oem_id");
        Log.d(e, "model " + this.a);
        if (!TextUtils.isEmpty(this.a) && this.a.length() > 4) {
          this.a = this.a(this.a.substring(0, 5));
          if ((var1 = this.b("sys.neostra_oem_id")).length() > 27 && var1.startsWith("W26MP") && "S".equalsIgnoreCase(String.valueOf(var1.charAt(27)))) {
            this.a = "D3-510";
          }
        } else {
          this.a = this.b("ro.neostra.imin_model");
        }

        if ("".equals(this.a) && (this.a = Build.MODEL).equals("I22D01")) {
          this.a = "DS1-11";
        }
      }

      return this.a;
    }
  }

  public String a() {
    String var1;
    if (!(var1 = Build.BRAND).equals("yimin") && !var1.equals("YiMin") && !var1.equals("yiMin")) {
      return !TextUtils.isEmpty(this.a) && this.j() ? "iMin" : var1;
    } else {
      return "YiMin";
    }
  }

  public String c() {
    String var1;
    if ("D4-505".equals(this.a) && !TextUtils.isEmpty(var1 = this.b("sys.neostra_oem_id")) && var1.startsWith("W27DP")) {
      return "Rockchip 6 Core\nDual-core Cortex-A72\nQuad-core Cortex-A53";
    } else {
      byte var2;
      label165: {
        String var10000 = var1 = this.a;
        var2 = -1;
        byte var4;
        switch (var10000.hashCode()) {
          case -2138853759:
            if (!var1.equals("IF22-1")) {
              break label165;
            }

            var4 = 25;
            break;
          case -2101139221:
            if (!var1.equals("K1-101")) {
              break label165;
            }

            var4 = 9;
            break;
          case -2100214739:
            if (!var1.equals("K2-201")) {
              break label165;
            }

            var4 = 3;
            break;
          case -2042956436:
            if (!var1.equals("M2-202")) {
              break label165;
            }

            var4 = 27;
            break;
          case -2042956435:
            if (!var1.equals("M2-203")) {
              break label165;
            }

            var4 = 28;
            break;
          case -2042928900:
            if (!var1.equals("M2-Max")) {
              break label165;
            }

            var4 = 16;
            break;
          case -2042925499:
            if (!var1.equals("M2-Pro")) {
              break label165;
            }

            var4 = 17;
            break;
          case -2026070241:
            if (!var1.equals("Lark 1")) {
              break label165;
            }

            var4 = 26;
            break;
          case -2012365854:
            if (!var1.equals("MS1-11")) {
              break label165;
            }

            var4 = 20;
            break;
          case -1899809721:
            if (!var1.equals("R2-301")) {
              break label165;
            }

            var4 = 12;
            break;
          case -1872100247:
            if (!var1.equals("S1-701")) {
              break label165;
            }

            var4 = 10;
            break;
          case -1872100246:
            if (!var1.equals("S1-702")) {
              break label165;
            }

            var4 = 11;
            break;
          case -1805852286:
            if (!var1.equals("Swan 1")) {
              break label165;
            }

            var4 = 23;
            break;
          case -139615932:
            if (!var1.equals("Swift 1")) {
              break label165;
            }

            var4 = 21;
            break;
          case 2157:
            if (!var1.equals("D1")) {
              break label165;
            }

            var4 = 18;
            break;
          case 1993455917:
            if (!var1.equals("D1-Pro")) {
              break label165;
            }

            var4 = 19;
            break;
          case 1993992155:
            if (!var1.equals("D2 Pro")) {
              break label165;
            }

            var4 = 15;
            break;
          case 1994350422:
            if (!var1.equals("D2-401")) {
              break label165;
            }

            var4 = 14;
            break;
          case 1994350423:
            if (!var1.equals("D2-402")) {
              break label165;
            }

            var4 = 13;
            break;
          case 1995274907:
            if (!var1.equals("D3-504")) {
              break label165;
            }

            var4 = 0;
            break;
          case 1995274908:
            if (!var1.equals("D3-505")) {
              break label165;
            }

            var4 = 1;
            break;
          case 1995274909:
            if (!var1.equals("D3-506")) {
              break label165;
            }

            var4 = 2;
            break;
          case 1996198425:
            if (!var1.equals("D4-501")) {
              break label165;
            }

            var4 = 4;
            break;
          case 1996198426:
            if (!var1.equals("D4-502")) {
              break label165;
            }

            var4 = 5;
            break;
          case 1996198427:
            if (!var1.equals("D4-503")) {
              break label165;
            }

            var4 = 6;
            break;
          case 1996198428:
            if (!var1.equals("D4-504")) {
              break label165;
            }

            var4 = 7;
            break;
          case 1996198429:
            if (!var1.equals("D4-505")) {
              break label165;
            }

            var4 = 8;
            break;
          case 2024939083:
            if (!var1.equals("DS1-11")) {
              break label165;
            }

            var4 = 22;
            break;
          case 2072996647:
            if (var1.equals("FI22-1")) {
              var4 = 24;
              break;
            }
          default:
            break label165;
        }

        var2 = var4;
      }

      switch (var2) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
          if ("W17PX".equals(this.f())) {
            return "Quad-Core ARM Cortex-A55";
          }

          return "Quad-core ARM Cortex-A17";
        case 12:
          return "Rockchip 6 core \nDual-Core Cortex-A72 UP to 1.8GHz\nQual-Core Cortex-A53 UP to 1.4GHz";
        case 13:
        case 14:
        case 15:
          String var3;
          return TextUtils.isEmpty(var3 = this.b("sys.neostra_oem_id")) || !var3.startsWith("V1GPX") && !var3.startsWith("V1PXX") ? "Quad-core ARM Cortex-A53" : "Quad-core Cortex-A55";
        case 16:
        case 17:
        case 18:
        case 19:
          return "8-core \nDual*A75 UP to 1.8GHz\nHexa*A55 UP to 1.8GHz";
        case 20:
        case 21:
          return "8-core ARM Cortex-A55";
        case 22:
        case 23:
          return "Quad-core ARM Cortex-A55";
        case 24:
        case 25:
        case 26:
          return "8-Core Arm Cortex-A55";
        case 27:
          return "4-Core, Quad*Cortex-A35, 1.3GHz";
        case 28:
          return "Quad-core ARM Cortex-A53 1.28GHz";
        default:
          return "";
      }
    }
  }

  public String b() {
    String var1;
    if ("D4-505".equals(this.a) && !TextUtils.isEmpty(var1 = this.b("sys.neostra_oem_id")) && var1.startsWith("W27DP")) {
      return "1.8GHz";
    } else {
      String var10000 = var1 = this.a;
      byte var2 = -1;
      switch (var10000.hashCode()) {
        case -2138853759:
          if (var1.equals("IF22-1")) {
            var2 = 7;
          }
          break;
        case -2026070241:
          if (var1.equals("Lark 1")) {
            var2 = 8;
          }
          break;
        case -2012365854:
          if (var1.equals("MS1-11")) {
            var2 = 4;
          }
          break;
        case -1899809721:
          if (var1.equals("R2-301")) {
            var2 = 0;
          }
          break;
        case -1872100247:
          if (var1.equals("S1-701")) {
            var2 = 11;
          }
          break;
        case -1805852286:
          if (var1.equals("Swan 1")) {
            var2 = 10;
          }
          break;
        case -139615932:
          if (var1.equals("Swift 1")) {
            var2 = 5;
          }
          break;
        case 1993992155:
          if (var1.equals("D2 Pro")) {
            var2 = 3;
          }
          break;
        case 1994350422:
          if (var1.equals("D2-401")) {
            var2 = 2;
          }
          break;
        case 1994350423:
          if (var1.equals("D2-402")) {
            var2 = 1;
          }
          break;
        case 2024939083:
          if (var1.equals("DS1-11")) {
            var2 = 9;
          }
          break;
        case 2072996647:
          if (var1.equals("FI22-1")) {
            var2 = 6;
          }
      }

      switch (var2) {
        case 0:
          return "0";
        case 1:
        case 2:
        case 3:
          String var3;
          return TextUtils.isEmpty(var3 = this.b("sys.neostra_oem_id")) || !var3.startsWith("V1GPX") && !var3.startsWith("V1PXX") ? "1.5GHz" : "1.8GHz";
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
          return "1.6GHz";
        case 9:
        case 10:
          return "2.0GHz";
        case 11:
          return "2.0GHZ";
        default:
          return "";
      }
    }
  }

  public String d() {
    return this.b("sys.dualscreen");
  }

  public boolean l() {
    return this.d;
  }

  public boolean m() {
    String var3;
    String var10000 = var3 = this.a;
    byte var1 = -1;
    int var2;
    if ((var2 = var10000.hashCode()) != -2138853759) {
      if (var2 != -2026070241) {
        if (var2 != -1899809721) {
          if (var2 == 2072996647 && var3.equals("FI22-1")) {
            var1 = 1;
          }
        } else if (var3.equals("R2-301")) {
          var1 = 0;
        }
      } else if (var3.equals("Lark 1")) {
        var1 = 3;
      }
    } else if (var3.equals("IF22-1")) {
      var1 = 2;
    }

    switch (var1) {
      case 0:
      case 1:
      case 2:
      case 3:
        return false;
      default:
        return true;
    }
  }

  public boolean k() {
    String var2;
    String var10000 = var2 = this.a;
    byte var1 = -1;
    switch (var10000.hashCode()) {
      case -2138853759:
        if (var2.equals("IF22-1")) {
          var1 = 6;
        }
        break;
      case -2042928900:
        if (var2.equals("M2-Max")) {
          var1 = 1;
        }
        break;
      case -2042925499:
        if (var2.equals("M2-Pro")) {
          var1 = 2;
        }
        break;
      case -2026070241:
        if (var2.equals("Lark 1")) {
          var1 = 7;
        }
        break;
      case -2012365854:
        if (var2.equals("MS1-11")) {
          var1 = 3;
        }
        break;
      case -1899809721:
        if (var2.equals("R2-301")) {
          var1 = 0;
        }
        break;
      case -1872100247:
        if (var2.equals("S1-701")) {
          var1 = 8;
        }
        break;
      case -139615932:
        if (var2.equals("Swift 1")) {
          var1 = 4;
        }
        break;
      case 2072996647:
        if (var2.equals("FI22-1")) {
          var1 = 5;
        }
    }

    switch (var1) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
        return false;
      default:
        return true;
    }
  }

  public long a(long var1) {
    long var3;
    if ((var3 = var1 / 1024L / 1024L / 1024L) <= 0L) {
      var3 = 0L;
    } else if (var3 <= 1L) {
      var3 = 1L;
    } else if (var3 <= 2L) {
      var3 = 2L;
    } else if (var3 <= 4L) {
      var3 = 4L;
    } else if (var3 <= 8L) {
      var3 = 8L;
    } else if (var3 <= 16L) {
      var3 = 16L;
    } else if (var3 <= 32L) {
      var3 = 32L;
    } else if (var3 <= 64L) {
      var3 = 64L;
    } else if (var3 <= 128L) {
      var3 = 128L;
    } else if (var3 <= 256L) {
      var3 = 256L;
    }

    return var3 * 1024L * 1024L * 1024L;
  }

  public String g() {
    return this.b("ro.board.platform");
  }

  public String b(String var1) {
    String var6 = "";

    String var8;
    label50: {
      label45: {
        Class var10000;
        boolean var10001;
        try {
          var10000 = Class.forName("android.os.SystemProperties");
        } catch (Exception var5) {
          var10001 = false;
          break label45;
        }

        String var9 = "get";

        Class[] var10002;
        try {
          var10002 = new Class[1];
        } catch (Exception var4) {
          var10001 = false;
          break label45;
        }

        Class[] var10003 = var10002;
        byte var10004 = 0;

        Method var7;
        try {
          var10003[var10004] = String.class;
          var7 = var10000.getDeclaredMethod(var9, var10002);
        } catch (Exception var3) {
          var10001 = false;
          break label45;
        }

        var9 = null;

        try {
          var8 = (String)var7.invoke(var9, var1);
          break label50;
        } catch (Exception var2) {
          var10001 = false;
        }
      }

      Log.d(e, "Unable to read system properties");
      return var6;
    }

    var6 = var8;
    return var6;
  }

  public double h() {
    return this.b;
  }

  public boolean n() {
    return this.c;
  }
}

