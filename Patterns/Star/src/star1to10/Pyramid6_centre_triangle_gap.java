package star1to10;

public class Pyramid6_centre_triangle_gap {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for (int i = 0; i <= rows; i++) {
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }

            for (int k = rows - i; k > 0; k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
