package star11to20;

public class Pattern20_hollow_triangle_inverted {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for(int i = rows; i >= 1; i--) {
            for (int k = 1; k <= (i * 2) - 1; k++ ){
                if(k == 1 || k == (i * 2) - 1 || i == rows){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            //fill space in lower left portion
            for(int k = rows; k >= i; k--){
                System.out.print(" ");
            }
        }
    }
}
