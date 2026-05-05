import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // In Later verison of java they have introduced
        // Try with Resources
        // where you dont have to mention the finally block

        // try(creating object here){
        // once the try is over
        // the object is closed automatically
        // }
        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}