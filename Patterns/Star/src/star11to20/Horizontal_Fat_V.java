package star11to20;

public class Horizontal_Fat_V {
    public static void main(String[] args) {
        int rows =5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= 2 * rows - 1; i++){
            if (i <= rows) {
                for (int k = 0; k <= rows - i; k++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k <= i - rows; k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
