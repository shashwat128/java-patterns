package star1to10;

public class Pyramid4_right_down_triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = rows; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
