public class ProgramThree {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}