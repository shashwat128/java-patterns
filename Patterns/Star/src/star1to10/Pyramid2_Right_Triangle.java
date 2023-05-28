package star1to10;

public class Pyramid2_Right_Triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPattern(rows);
    }

    private static void starPattern(int rows) {
        for(int i = 0; i < rows; i++) {
            for(int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
