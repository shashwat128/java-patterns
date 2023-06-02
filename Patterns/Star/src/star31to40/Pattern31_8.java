package star31to40;

public class Pattern31_8 {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows){
        for (int i = 1; i <= rows * 2 - 1; i++){
            if (i == 1 || i == rows || i == rows * 2 - 1){

                for (int k = 1; k <= rows; k++){
                    if (k == 1 || k == rows)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            } else {

                for(int k = 1; k <= rows; k++) {
                    if (k == 1 || k == rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
