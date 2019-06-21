package season1;

public class Calculate_loan_interest {
    public static double calculateInterest(double money, int month, double interest_rate){
        double total_interest = 0;
        total_interest = money * (interest_rate/100)/12 * month;
        return total_interest;
    }
    public static void main(String[] args) {
        System.out.println("Enter month");
        int month = CheckPrime.scanner.nextInt();
        System.out.println("Enter money");
        double money = CheckPrime.scanner.nextDouble();
        System.out.println("Enter interset");
        double interest_rate = CheckPrime.scanner.nextDouble();
        System.out.println("Interest :" + calculateInterest(money,month,interest_rate));
    }
}
