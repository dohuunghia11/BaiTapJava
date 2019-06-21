package season1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void solveFirstrOderEquation( double numberOne, double numberTwo){
        if(numberOne != 0){
            double solution = (-numberTwo/numberOne) ;
            System.out.println("Phuong trinh co nghiem duy nhat : " + solution);
        } else if(numberTwo != 0){
            System.out.println("Phuong trinh vo nghiem ");
        } else {
            System.out.println("Phuong trinh co vo so nghiem");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a ");
        double a = scanner.nextInt();
        System.out.println("Nhap he so b ");
        double b = scanner.nextInt();
        solveFirstrOderEquation(a,b);

    }
}
