package season1;

public class Find_greatest_common_divisor {
    public static void findGreatestCommonDivisor(int numberOne, int numberTwo){
        if(numberOne == 0 || numberTwo == 0){
            System.out.println("No greatest common factor");
        } else {
            while (numberOne != numberTwo){
                if(numberOne > numberTwo){
                    numberOne -= numberTwo;
                } else {
                    numberTwo -= numberOne;
                }
            }
            System.out.println("Uoc chung lon nhat cua hai so " + numberOne );
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int numberOne = CheckPrime.scanner.nextInt();
        numberOne = Math.abs(numberOne);
        System.out.println("Enter b: ");
        int numberTwo = CheckPrime.scanner.nextInt();
        numberTwo = Math.abs(numberTwo);
        findGreatestCommonDivisor(numberOne, numberTwo);
    }
}
