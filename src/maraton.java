

public class maraton {
    private final String[] isimdizisi;
    private final int[] dakikalardizisi;

    public maraton(String[] yarismacilar, int[] dakikalar) {
        this.isimdizisi = yarismacilar;
        this.dakikalardizisi = dakikalar;
    }

    public String[] getYarismacilar() {
        return isimdizisi;
    }

    public int[] getDakikalardizisi() {
        return dakikalardizisi;
    }


    public int getfirst() {
        int zaman1 = dakikalardizisi[0];
        for (int a : dakikalardizisi) {
            if (a < zaman1) {
                zaman1 = a;
            }
        }
        return zaman1;
    }

    public int getsecond() {
        int zaman2 = dakikalardizisi[0];
        int smallest = getfirst();
        for (int b : dakikalardizisi) {
            if (b > smallest && b < zaman2) {
                zaman2 = b;
            }
        }
        return zaman2;
    }

    public int getthird() {
        int zaman3 = dakikalardizisi[0];
        int smallest2 = getsecond();
        for (int c : dakikalardizisi) {
            if (c < zaman3 && c > smallest2) {
                zaman3 = c;
            }
        }
        return zaman3;
    }

    public int Asinifi() {
        int A = 0;
        for (int time : dakikalardizisi) {
            if (time >= 200 && time <= 299) {
                A++;
            }
        }
        return A;
    }

    public int Bsinifi() {
        int B = 0;
        for (int time : dakikalardizisi) {
            if (time >= 300 && time <= 399) {
                B++;
            }
        }
        return B;
    }

    public int Csinifi() {
        int C = 0;
        for (int time : dakikalardizisi) {
            if (time >= 400 && time <= 499) {
                C++;
            }
        }
        return C;
    }

    public String indisbulma1() {
        int i = 0;
        while (getfirst() != dakikalardizisi[i]) {
            i++;
        }
        return isimdizisi[i];
    }

    public String indisbulma2() {
        int i = 0;
        while (getsecond() != dakikalardizisi[i]) {
            i++;
        }
        return isimdizisi[i];
    }

    public String indisbulma3() {
        int i = 0;
        while (getthird() != dakikalardizisi[i]) {
            i++;
        }
        return isimdizisi[i];
    }


    public void outputs() {
        System.out.println("Cumhuriyet üniversitesi maratonuna hoşgeldiniz " + getYarismacilar());
        System.out.println("birinci: " + indisbulma1() + " " + getfirst() + "\'");
        System.out.println("ikinci: " + indisbulma2() + " " + getsecond() + "\'");
        System.out.println("üçüncü: " + indisbulma3() + " " + getthird() + "\'");
        System.out.println("A-->" + Asinifi());
        System.out.println("B-->" + Bsinifi());
        System.out.println("C-->" + Csinifi());
    }
}

