package season1;

import java.util.Scanner;

public class CheckPrime {
    public static Scanner scanner = new Scanner(System.in);
    public static Boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        System.out.println("Nhap mot so ");
        int number = scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number + " la so nguyen to");
        } else {
            System.out.println(number + " khong la so nguyen to");
        }
    }
}
