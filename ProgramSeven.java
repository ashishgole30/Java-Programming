public class ProgramSeven {
    public static void main(String[] args) {
        // do while

        int i1 = 5;
        do {
            System.out.println("Hi " + i1);
            i1++;
        } while (i1 <= 4);

        System.out.println("---------------------");
        // for loop

        for (int i2 = 1; i2 <= 4; i2++) {
            System.out.println("hi " + i2);
        }
        System.out.println("---------------------------");
        for (int i3 = 5; i3 >= 1; i3--) {
            System.out.println("Hi " + i3);
        }
        System.out.println("-------------");
        for (int i4 = 0; i4 < 4; i4++) {
            System.out.println("hi " + i4);
        }

        System.out.println("--------------------------");
        for (int i5 = 1; i5 <= 7; i5++) {
            System.out.println("DAY " + i5);
        }
    }
}