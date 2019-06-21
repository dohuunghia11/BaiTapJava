package season1;

public class body_weight_index {
    public static void calculateBodyWeightIndex(double weight, double height){
        double bodyWeightIndex = weight/ Math.pow(height,2);
        if (bodyWeightIndex < 18)
            System.out.println("Underweight");
        else if (bodyWeightIndex < 25.0)
            System.out.println("Normal");
        else if (bodyWeightIndex < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
    public static void main(String[] args) {
        System.out.println("Enter weight : ");
        double weight = CheckPrime.scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = CheckPrime.scanner.nextDouble();
        calculateBodyWeightIndex(weight,height);
    }
}
