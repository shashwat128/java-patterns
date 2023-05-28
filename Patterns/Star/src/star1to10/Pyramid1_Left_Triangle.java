package star1to10;

public class Pyramid1_Left_Triangle {

    public static void main(String[] args) {
        int rows = 5;
        starPattern(rows);
    }

    private static void starPattern(int rows) {

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
