package season3;

public class DemoStopWatch {
//        private static int sum() {
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//
//    private static void doJob(int count) {
//        // Gọi phương thức 'sum' với số lần cho bởi tham số.
//        for (int i = 0; i < count; i++) {
//            sum();
//        }
//    }
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start(System.currentTimeMillis());
        System.out.println("Start : " + time.getStartTime());

        time.stop(System.currentTimeMillis());
        System.out.println("End : " + time.getEndTime());
        System.out.println("Time has pass : " + time.getElapsedTime());
    }
//    private static int sum() {
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//
//    private static void doJob(int count) {
//        // Gọi phương thức 'sum' với số lần cho bởi tham số.
//        for (int i = 0; i < count; i++) {
//            sum();
//        }
//    }
//
//    public static void main(String[] args) {
//        long millis1 = System.currentTimeMillis();
//
//        doJob(10000);
//
//        long millis2 = System.currentTimeMillis();
//
//        long distance = millis2 - millis1;
//
//        System.out.println("Distance time in milli second: " + distance);
//    }
}
