public class One {
    public static void main(String[] args) {

        // PACKAGES

        // keyword "package"
        A obj = new A();

        // One and A,B classes are in two different folders
        // so "import packagename.classname;" at top

        // Whichever inbuilt class you use in java belongs to a package

        System.out.println();
        // System is also class but we never imported it
        // reason: by default every java file will have import java.lang.*; even if you
        // dont mention

        // import packagename.*;
        // to import all the files

        // * means all the files
        // not all the folders

        // com.google.....
        // reverse domain name for unique
    }
}