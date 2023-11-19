import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
//        welcome();
//        total(10, 5);

        System.out.print(miness(100, 10));

    }

    public static void welcome(){
        System.out.print("enetr Your Name: ");
        Scanner input = new Scanner(System.in);
        String full_name = input.nextLine();

        System.out.print("hello " + full_name);

    }

    public static void total(int n1, int n2){
        int to = n1 + n2;
        System.out.print("total tow number is: " + to);
    }

    public static int miness(int x, int y){
        int mi = x - y;
        return mi;

    }


}
