import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of dimensions: ");
        int D = input.nextInt();

        System.out.print("Enter base (alpha) address: ");
        long base = input.nextLong();  

        System.out.print("Enter element size: ");
        int elementSize = input.nextInt();

        int[] UB = new int[D];
        System.out.println("Enter upper bounds for each dimension:");
        for (int i = 0; i < D; i++) {
            System.out.print("Upper bound of dimension " + (i + 1) + ": ");
            UB[i] = input.nextInt();
        }

        int[] index = new int[D];
        System.out.println("Enter target element index:");
        for (int i = 0; i < D; i++) {
            System.out.print("Index for dimension " + (i + 1) + ": ");
            index[i] = input.nextInt();
        }

        

        long EleDist = 0;  
        for (int i = 0; i < D; i++) {
            long product = 1; 
            for (int j = i + 1; j < D; j++) {
                product *= (UB[j] + 1);  
            }
            EleDist += (long) index[i] * product;  
        }

        long address = base + (EleDist * elementSize);  

        System.out.println("\nThe position: " + address);

       
    }
}