package season1;

public class display_numbers_Prime_First {
    public static int[] displayPrime(int number){
        int[] arr = new int[number];
        int i = 0;
        for (int j = 2; i < number; j++){
            if(CheckPrime.isPrime(j)){
                arr[i] = j;
                i++;
            }
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so ");
        int number = CheckPrime.scanner.nextInt();
        System.out.println(number + " so nguyen to dau tien la : ");
        int[] arr = displayPrime(number);
        displayArray(arr);
    }
}
