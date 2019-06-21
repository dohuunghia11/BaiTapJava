package season1;

public class ChuyenDoiTienTe {
    public static final int RATE = 23000;
    public static double changeMoney(double usd){
        return usd * RATE;
    }

    public static void main(String[] args) {
        System.out.println("Enter USD :");
        double usd = CheckPrime.scanner.nextDouble();
        System.out.println(usd + " USD = " + changeMoney(usd) + " VND");
    }
}
