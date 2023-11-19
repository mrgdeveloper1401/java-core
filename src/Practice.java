import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String name;
        int number;
        int counts = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = input.next();
        System.out.println("Welcome " + name);

        System.out.print("Enter Number: ");
        number = input.nextInt();

        while (counts <= number){
            System.out.print("*");
            counts++;
        }



    }
}
