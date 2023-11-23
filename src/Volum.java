public class Volum {
    public static void main(String[] args) {
        int r = 2;
        int h = 5;

        double mashahat = mashatDireh(r);
        double hajm = HajmOstevaneh(mashahat, h);
        System.out.print(hajm);

    }

    private static double HajmOstevaneh(double mashahat, int h) {
        double hajm = mashahat * h;
        return  hajm;
    }

    private static double mashatDireh(int r) {
        double mashaat = r * r * 3.14;
        return mashaat;
    }


}
