public class Two {
    public static void main(String[] args) {

        // What if you want mutable strings
        // String Buffer
        // String Builder

        // 1. String Buffer

        System.out.println("------------------");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        // default size = 16 bytes
        System.out.println("------------------");
        StringBuffer sb2 = new StringBuffer("Navin");
        System.out.println(sb2.capacity());
        // size = 16 spaces + 5 (navin)
        System.out.println("------------------");
        StringBuffer sb3 = new StringBuffer("Navin");
        System.out.println(sb3.length());
        // length = 5 , length and capacity are two different things
        System.out.println("------------------");
        StringBuffer sb4 = new StringBuffer("Navin");
        System.out.println(sb4.append(" Reddy"));
        System.out.println("------------------");
        // you can use toString method to convert string buffer data into strings
        StringBuffer sb5 = new StringBuffer("Ashish");
        String str = sb5.toString();
        System.out.println(str);
        System.out.println("------------------");
        StringBuffer sb6 = new StringBuffer("Ashish");
        sb6.deleteCharAt(2);
        System.out.println(sb6);
        System.out.println("------------------");
        StringBuffer sb7 = new StringBuffer("Ashish");
        sb7.insert(0, "Yo ");
        System.out.println(sb7);
        System.out.println("------------------");
        // The reason you aren't getting the expected result is that the substring()
        // method
        // in the StringBuffer class does not modify the original object.
        // Instead, it creates and returns a new String containing the extracted part
        StringBuffer sb8 = new StringBuffer("Ashish");
        String result8 = sb8.substring(1);
        System.out.println(result8);
        System.out.println("------------------");
        StringBuffer sb9 = new StringBuffer("Ashish");
        String result9 = sb9.substring(0, 3);
        System.out.println(result9);
        System.out.println("------------------");
        StringBuffer sb10 = new StringBuffer("Ashish");
        sb10.setLength(30);
        System.out.println(sb10);
        System.out.println("------------------");
        StringBuffer sb11 = new StringBuffer("Ashish");
        sb11.ensureCapacity(100);
        System.out.println(sb11);

    }
}