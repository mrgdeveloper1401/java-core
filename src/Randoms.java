import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random rnd = new Random();
//        System.out.println(rnd.nextInt(50));

//        (all_range -min + +max +1) + -min
//        100 -(-10) + 10 +1) -10
        System.out.print(rnd.nextInt(100 +10 + 1) -10);
    }
}