import java.util.Scanner;
public class ArraySumAndAverage {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Sum And Average Of Array");
        System.out.print("Enter no of Elements: ");
        int n = read.nextInt();
        int sum = 0;
        int[] array = new int[n];
        System.out.println("Enter Elements Of Array: ");
        for(int i=0; i<n; i++){
            array[i] = read.nextInt();
            sum += array[i];
        }
        float avg = sum/(float)n;
        System.out.println("Sum Of Array: "+sum);
        System.out.println("Average Of Array: "+avg);
        read.close();
    }
}
