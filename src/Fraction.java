public class Fraction {
    int numerator = 1, denominator = 1;
    String fract = numerator + "/" + denominator;


//    void reducing_fractions() {
//        int h = 2, a = 0, b = 0, p = 0;
//        a = this.numerator;
//        b = this.denominator;
//        while (h <= this.numerator) {
//            if (a % h == 0 && b % h == 0) {
//                a = a / h;
//                b = b / h;
//                p = 1;
//
//            } else {
//                h = h + 1;
//            }
//            //else
//        }
//        if (p == 1) {
//            this.numerator = a;
//            this.denominator = b;
//        }
//    }

    int getNum() {
        return numerator;
    }

    int getDen() {
        return denominator;
    }

    void setNum(int x) {
        this.numerator = x;
        fract = numerator + "/" + denominator;
    }

    void setDen(int x) {
        this.denominator = x;
        fract = numerator + "/" + denominator;
    }

    public Fraction(int x, int y) {
        this.numerator = x;
        this.denominator = y;
        fract = numerator + "/" + denominator;
    }

    String getFrac() {
        return numerator + "/" + denominator;
    }

    static Fraction sum(Fraction f1, Fraction f2) {  //f1+f2
        int a, b;
        a = f1.getNum() * f2.getDen() + f2.getNum() * f1.getDen();
        b = f1.getDen() * f2.getDen();
        return new Fraction(a, b);

    }

    void sum(Fraction frac) {  // this+fract

        this.numerator = this.numerator * frac.getDen() + this.denominator * frac.getNum();
        this.denominator = this.denominator * frac.getDen();
        this.fract = numerator + "/" + denominator;

    }

    void difference(Fraction f1, Fraction f2) {  // f1-f2
        int a, b;
        a = f1.getNum() * f2.getDen() - f2.getNum() * f1.getDen();
        b = f1.getDen() * f2.getDen();
        this.fract = a + "/" + b;
        this.numerator = a;
        this.denominator = b;

    }

    void subtract(Fraction frac) { //this - frac
        this.numerator = this.numerator * frac.getDen() - this.denominator * frac.getNum();
        this.denominator = this.denominator * frac.getDen();
        this.fract = numerator + "/" + denominator;

    }

    void product(Fraction f1, Fraction f2) {  // f1*f2
        int a, b;
        a = f1.getNum() * f2.getNum();
        b = f1.getDen() * f2.getDen();
        this.fract = a + "/" + b;
        this.numerator = a; // каскадное присваевание
        this.denominator = b;

    }

    void multiply(Fraction frac) { //this * frac
        this.numerator = this.numerator * frac.getNum();
        this.denominator = this.denominator * frac.getDen();
        this.fract = numerator + "/" + denominator;

    }

    void quotient(Fraction f1, Fraction f2) {  // f1/f2
        int a, b;
        a = f1.getNum() * f2.getDen();
        b = f1.getDen() * f2.getNum();
        this.fract = a + "/" + b;
        this.numerator = a;
        this.denominator = b;
    }
}
