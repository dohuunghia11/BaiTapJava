package season3;

import season1.CheckPrime;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter a :");
        double a = CheckPrime.scanner.nextDouble();
        System.out.println("Enter b :");
        double b = CheckPrime.scanner.nextDouble();
        System.out.println("Enter c :");
        double c = CheckPrime.scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.solveTheEquation();
    }
}
