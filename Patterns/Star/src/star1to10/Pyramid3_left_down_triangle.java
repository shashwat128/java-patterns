package star1to10;

public class Pyramid3_left_down_triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPattern(rows);
    }

    private static void starPattern(int rows) {
        for(int i = 0; i <= rows; i++) {
            for(int j = rows - i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
