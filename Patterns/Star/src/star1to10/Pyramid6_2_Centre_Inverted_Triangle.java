package star1to10;

public class Pyramid6_2_Centre_Inverted_Triangle {
    public static void main(String[] args) {
        int rows = 5;
        printStars(rows);
    }

    private static void printStars(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print star in decreasing order
            for (int k = 1; k <= (i*2) -1; k++) {
                System.out.print("*");
            }
            System.out.println();
            // Print space in increasing order
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
        }
    }
}
