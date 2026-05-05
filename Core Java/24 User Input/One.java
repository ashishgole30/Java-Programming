import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello World");

        // println is a method
        // NOTE: println method is not a part of system class
        // println method is a part of PrintStream class
        // now to use PrintStream class we need to create an object of PrintStream class
        // however it is already created for us that is "out"
        // "out" is object of printStream class and it is a static member of system
        // class
        // since it is static we can use it with system

        System.out.print("Enter a number:");
        // int num1 = System.in.read();
        // System.out.println(num1 - 48);

        // system.in.read actually gives ASCII Value
        // every character on your keyboard has a ascii value
        // the ascii value of 0 is 48
        // system.in.read(); also reads only one character at a time
        // so instead of using system.in.read();
        // java says i will give you a specialized class

        // Concept of buffered Reader

        // its a class which works wih IO
        // belongs to pacakage java.io
        // so to use buffered reader
        // you need to import buffered reader
        // IO exception , buffered reader both belongs to IO package
        // most of the classes we used most of them belong to java.lang
        // which is auto imported

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        // String str = bf.readLine();
        // System.out.println(str);

        int num2 = Integer.parseInt(bf.readLine());
        // Special class Integer.parseInt
        // basically you will get a number in a string format
        // you just have to convert it into integer
        System.out.println(num2);

        // Created object of input stream reader
        // which requires an object of input stream
        // passed as (system.in)

        // Created object of buffered reader , which needs an object of input stream
        // reader , passed.

        // Buffered reader -> can take the input from anywhere
        // from system keybaord, from file , from network
        // buffered reader -> is actually a resource
        // its always a good idea to close the resources

        bf.close();

    }
}