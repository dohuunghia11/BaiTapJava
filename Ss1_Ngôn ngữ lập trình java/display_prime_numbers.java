package season1;

public class display_prime_numbers {
    public static void displayPrime(int amount){
        for (int i = 2; i <= amount; i++){
            int j = 0;
            if(CheckPrime.isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so");
        int amount = CheckPrime.scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon " + amount + " la : ");
        displayPrime(amount);
    }
}
