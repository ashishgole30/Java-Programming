import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 0;

        // the scope is getting over in try block
        // so declare it outside and use it inside
        BufferedReader br = null;
        try {
            // InputStreamReader in = new InputStreamReader(System.in);
            // br = new BufferedReader(in);

            // OR

            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

            // whenever you open the resource
            // that is buffered reader
            // you should close it
            // br.close;
        } finally {
            // finally is useful whenever you want to close the resource
            // the finally block is used to close the resource
            br.close();
        }
    }
}