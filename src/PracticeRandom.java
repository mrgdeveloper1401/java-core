import java.util.Random;

public class PracticeRandom {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] count = {1,2,3,4,5,6};

        for (int i = 0; i <= 100; i++){
            System.out.println(rnd.nextInt(6) +1);
        }
    }
}
