public class ProgramFive {
    public static void main(String[] args) {

        // Conditional Statements

        int x = 18;
        int y = 19;
        if (x > y) {
            System.out.println("hello");
        } else if (x == y) {
            System.out.println("Konichiwa");
        } else {
            System.out.println("BYEEE");
        }

        System.out.println("-------------------------");
        int num = 47;
        int result = 0;
        if (num % 2 == 0) {
            result = 10;
        } else {
            result = 20;
        }
        System.out.println(result);
        System.out.println("---------------------");

        // ?: ternary operator
        int number = 123;
        int answer = 0;
        answer = number % 2 == 0 ? 2 : 1;
        System.out.println(answer);

        System.out.println("-----------------");
        // switch
        int n = 8;
        switch (n) {
            case 1:
                System.out.println("Monday");
                // come out of the switch block
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // default case
            default:
                System.out.println("Not a day");
        }

    }
}