package star11to20;

public class Parallelogram11_left {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for(int i = 0; i < rows; i++) {
            for (int k = 0; k < i; k++ ) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
