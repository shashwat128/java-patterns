package star1to10;

public class Parallelogram10_right {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for(int i = 0; i <= rows; i++ ){
            for (int k = 1; k <= rows - i; k++ ) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
