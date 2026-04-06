public class ProgramOne {
    public static void main(String[] args) {
        // Array

        // NEED OF ARRAY

        // lets say you have 100 students names
        // now instead of creating 100 variables to store the names of students we can
        // create an array to store the names of students
        int num1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num2[] = new int[5]; // size 5

        // IMPLEMENTATION

        // datatype name square bracket = {value1,value2};
        // OR
        // datatype name square bracket = new datatype[size];

        int num3[] = { 3, 7, 2, 4 };
        // values: 3,7,2,4
        // index numbers: 0,1,2,3
        System.out.println(num3[0]);
        System.out.println("---------");
        num3[1] = 8;
        System.out.println(num3[1]);
        System.out.println("---------");

        int num4[] = new int[4];
        // by default all values:0,0,0,0
        num4[0] = 4;
        num4[1] = 5;
        num4[2] = 6;
        num4[3] = 7;
        for (int i = 0; i < 4; i++) {
            System.out.println(num4[i]);
        }
        System.out.println("---------");

    }
}