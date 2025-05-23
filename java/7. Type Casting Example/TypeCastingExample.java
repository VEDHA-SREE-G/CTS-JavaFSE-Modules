public class TypeCastingExample {
    public static void main(String args[]){
        double doubleVal = 99.9999;
        int intVal = 58;
        int result1 = (int) doubleVal;
        double result2 = intVal;
        System.out.println("Type Casting Example");
        System.out.println("Explicit TypeCasting (Double -> Int): " + doubleVal + " to " + result1);
        System.out.println("Implicit TypeCasting (Int -> Double): " + intVal + " to " + result2);
    }
}
