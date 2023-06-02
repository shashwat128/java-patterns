package star21to30;

public class Pattern29_hollow_rectangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows; k++) {
                if(i == 1 || i == rows || k == 1 || k == rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
