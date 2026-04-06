public class ProgramFour {
    public static void main(String[] args) {

        // JAGGED ARRAY

        // what if the internal array in a Two dimensional array has different number of
        // elements?
        // int nums[][] = new int[3][different no. of elements for each internal array];

        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // Basically
        // box 1 {value1,value2,value3}
        // box 2 {value1,value2,value3,value4}
        // box 3 {value1,value2}

        // for loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        // enhanced for loop (you dont need to mention size anywhere)
        for (int n[] : nums) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}