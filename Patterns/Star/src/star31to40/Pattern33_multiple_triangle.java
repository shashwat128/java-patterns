package star31to40;

public class Pattern33_multiple_triangle {
    public static void main(String[] args) {
        int columns = 7;
        starPrint(columns);
    }

    //needs correction - third row should have 5 stars
    private static void starPrint(int columns) {
        int k1 = 4;
        int k2 = 4;
        int gap = 7;

        //outer loop to handle the row
        for (int i = 1; i <= 4; i++){
            //Inner loop to handle the column
            for (int k = 1; k <= (columns * columns); k++) {
                if (k > k2 && i < 4) {
                    k2 = k2 + gap;
                    k1 = k1 + gap;
                }

                //condition to print the star pattern
                if (k >= k1 && k <= k2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            //condition to adjust the value of k1 and k2
            if (i + 1 == 4){
                k1 = 1;
                k2 = (columns * columns);
            } else {
                k1 = 4;
                k2 = 4;
                k1--;
                k2++;
            }
            System.out.println();
        }
    }
}
