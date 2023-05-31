package star11to20;

public class Pattern16_hollow_triangle_right {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++ ) {
            for (int k = rows; k > i; k--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                if(k == 1 || k == i || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
