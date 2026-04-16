public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        setDenominator(denominator);

        if (denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = gcd(numerator, denominator);

        this.numerator = (numerator / gcd);
        this.denominator = (denominator / gcd);
    }

    public void setDenominator(int denominator) {
        if (denominator > 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Знаменник не можу бути менше 0!");
        }
    }

    private int gcd(int a, int b){
        if (b == 0){
            return a;
        }

        return gcd(b, a % b);
    }

    public Fraction addFraction(Fraction other){

        int newNumerator = this.numerator * other.denominator + other.numerator * this.numerator;
        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other){
        int newNumerator =  this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public double toDecimal(){
        return (double) (numerator / denominator);
    }

    public void displayInfo(){
        System.out.println(numerator + "/" + denominator);
    }
}
