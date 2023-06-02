package star21to30;

public class Pattern28_hollow_triangle_inverted_mirror_wrong {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                if (i == 1 || k == i || k == rows)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        for (int i = rows - 1; i >= 1; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                if(i == 1 || k == i || k == rows)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
