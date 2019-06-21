package season3;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }

    private double getRoot1(){
            return (- b + Math.sqrt(getDiscriminant()))/ 2 * a;
    }

    private double getRoot2(){
            return (- b - Math.sqrt(getDiscriminant()))/ 2 * a;
    }

    public void solveTheEquation(){
        if(getDiscriminant() < 0 ){
            System.out.println("The equation has no roots");
        } else {
            if(getDiscriminant() == 0){
                System.out.println("The equation has one roots : " + getRoot1());
            } else {
                System.out.println("The equation has two roots : " + getRoot1() + " and " + getRoot2());
            }
        }
    }
}
