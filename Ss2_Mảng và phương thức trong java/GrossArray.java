package season2;

import season1.CheckPrime;

public class GrossArray {
    public static int[] grossArray(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];
        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        for(int i = arr1.length; i < arr.length; i++){
            arr[i] = arr2[i - arr1.length];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang thu nhat");
        int length1 = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang thu nhat");
        int[] arr1 = InsertArray.importArrayOneWay(length1);

        System.out.println("Nhap so phan tu cua mang thu hai");
        int length2 = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang thu hai");
        int[] arr2 = InsertArray.importArrayOneWay(length2);
        System.out.println("Gop 2 mang ta duoc mang sau ");
        InsertArray.displayArray(grossArray(arr1,arr2));
    }
}
