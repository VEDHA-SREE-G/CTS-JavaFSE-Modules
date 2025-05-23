public class MethodOverloading {
    public int sum(int a, int b){
        return a + b;
    }
    public double sum(double a, double b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String args[]){
        MethodOverloading object = new MethodOverloading();
        int result1 = object.sum(9,7);
        double result2 = object.sum(9.9,7.7);
        int result3 = object.sum(9,4,6);
        System.out.println("Sum Of Two Int Numbers : "+result1);
        System.out.println("Sum Of Two Double Numbers : "+result2);
        System.out.println("Sum Of Three Int Numbers : "+result3);
    }
}
