
package de.paystory.thermal_printer;

public class a {
    private static volatile a a;

    public a() {
    }

    public static a a() {
        if (a == null) {
            Class var0 = a.class;
            synchronized(a.class){}

            Throwable var10000;
            boolean var10001;
            a var14;
            try {
                var14 = a;
            } catch (Throwable var13) {
                var10000 = var13;
                var10001 = false;
                throw var10000;
            }

            if (var14 == null) {
                try {
                    a = new a();
                } catch (Throwable var12) {
                    var10000 = var12;
                    var10001 = false;
                    throw var10000;
                }
            }

            try {
                return a;
            } catch (Throwable var11) {
                var10000 = var11;
                var10001 = false;
                throw var10000;
            }
        } else {
            return a;
        }
    }

    public void b() {
        // $FF: Couldn't be decompiled
    }
}
