import java.util.Scanner;
public class LVL3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("The swapped numbers are " + n1 + " and " + n2);
    }
}