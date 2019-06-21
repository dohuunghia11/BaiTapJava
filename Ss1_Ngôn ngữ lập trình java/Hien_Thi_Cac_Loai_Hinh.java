package season1;

public class Hien_Thi_Cac_Loai_Hinh {
    public static void paintRectangle(int weight, int height){
        for(int i = 0 ; i < weight; i++){
            for(int j = 0; j < height; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public  static void paintTriangular(int weight){
        for (int i = 1; i <= weight; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void paintTriangular1(int weight){
        for( int i = weight; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap weight ");
        int weight = CheckPrime.scanner.nextInt();
        System.out.println("Nhap height ");
        int height = CheckPrime.scanner.nextInt();
        paintRectangle(weight,height);
        System.out.println("\n");
        paintTriangular(weight);
        System.out.println("\n");
        paintTriangular1(weight);
    }
}
