package star1to10;

public class Pyramid6_3_Centre_inverted_triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows){

        int numspace = 0;
        int numStars = (2 * rows) - 1;
        for(int i = rows; i >= 1; i--) {
            for (int j = 1; j <= numspace; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= numStars; k++) {
                System.out.print('*');
            }
            System.out.println();

            numspace++;
            numStars -= 2;
        }
    }
}
