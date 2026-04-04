public class ProgramSix {
    public static void main(String[] args) {
        // Loops-while , do while , for

        // while
        int i1 = 1;

        while (i1 <= 4) {
            System.out.println("hi " + i1);
            i1++;
        }
        // value of i maintained
        System.out.println("while loop ended " + i1);

        System.out.println("-----------------------");

        // nested while
        int i2 = 1;

        while (i2 <= 4) {
            System.out.println("hi " + i2);
            int j = 1;
            while (j <= 3) {
                System.out.println("hello " + j);
                j++;
            }
            i2++;
        }
    }
}