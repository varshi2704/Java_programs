import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = ob.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}