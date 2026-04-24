public import java.util.Scanner;

public class PartA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num == 0) System.out.print(0);
        
        String result = "";
        while (num > 0) {
            int remainder = num % 2;
            result = remainder + result; // Adding to front to keep correct order
            num = num / 2;
        }
        System.out.println("Binary: " + result);
    }
}