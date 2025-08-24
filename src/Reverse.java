import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        System.out.print("Enter any name:- ");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();

        int Lenthofname=name.length();

        String emptyString ="";

        for (int i=0;i<Lenthofname;i++){
            emptyString+=name.charAt(Lenthofname-i-1);

        }
        System.out.println("this Reverse string:---"+emptyString);

    }
}
