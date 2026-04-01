public class ProgramSix {
    public static void main(String[] args) {
        // Loops-while , do while , for

        // while
        int i = 1;

        while (i <= 4) {
            System.out.println("hi " + i);
            i++;
        }
        // value of i maintained
        System.out.println("while loop ended " + i);

        System.out.println("-----------------------");

        // nested while
        int ii = 1;

        while (ii <= 4) {
            System.out.println("hi " + ii);
            int jj = 1;
            while (jj <= 3) {
                System.out.println("hello " + jj);
                jj++;
            }
            ii++;
        }
    }
}