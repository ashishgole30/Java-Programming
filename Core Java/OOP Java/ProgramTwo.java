class Computer {
    // behaviour
    public void playMusic() {
        System.out.println("music playing..");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }
}

public class ProgramTwo {
    public static void main(String[] args) {

        // main is a method
        // start of the execution

        Computer obj = new Computer();
        // obj = reference variable

        obj.playMusic();
        String str = obj.getMeAPen(2);

        System.out.println(str);

    }
}