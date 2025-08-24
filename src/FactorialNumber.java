import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.print("Enter any number:-");
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        int fact=1;

        for (int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("the Factorial of :-"+a +" is a:-----"+fact);

    }
}
