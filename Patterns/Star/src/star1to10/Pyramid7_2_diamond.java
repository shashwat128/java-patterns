package star1to10;

public class Pyramid7_2_diamond {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        //Upper half
        for (int i = 1; i <= rows; i++){
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if(k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Lower half
        for(int i = rows - 1; i >= 1; i--) {
            for(int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if(k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
