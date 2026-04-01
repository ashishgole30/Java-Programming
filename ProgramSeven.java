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
        for (int i5 = 1; i5 <= 5; i5++) {
            System.out.println("DAY " + i5);

            for (int j = 1; j <= 5; j++) {
                System.out.println("Hour Number " + j);

            }
            System.out.println("------------");
        }

        int i6 = 1;
        for (; i6 <= 10;) {
            System.out.println(i6);
            i6++;
        }

        // first initial value considered, then condition checked , then block of code
        // implemented , the update of initial value

        // which loop to use when?
        // if u know how many iterations -> for loop
        // while loop for condition based
        // do while when even if the codition is false you want to execute something
        // atleast once
    }
}