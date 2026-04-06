public class ProgramTwo {
    public static void main(String[] args) {
        // MULTI DIMENSIONAL ARRAY

        int num1[][] = new int[3][4];
        // 3 rows 4 columns

        // outer loop rows
        for (int i = 0; i < 3; i++) {
            // inner loop coloumns
            for (int j = 0; j < 4; j++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        int num2[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                num2[i][j] = (int) (Math.random() * 10);
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

    }
}