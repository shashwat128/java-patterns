package star1to10;

public class Pyramid9_2_horizontal_triangle_inside {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for(int i = 1; i <= 2 * rows - 1; i++){
            if(i <= rows) {
                for (int k = 1; k <= rows - i; k++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= i - rows; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * rows - i; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
