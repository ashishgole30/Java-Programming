public class One {
    public static void main(String[] args) {
        // RACE CONDITIONS

        // Mutations = change
        // String are immutable

        // What if you are doing mutation with multiple threads?
        // lets say we have two threads , t1 , t2
        // and they both change the value of i
        // it will create instabaility in the program

        // Threads and mutations dont go together
        // thread safe-> only one thread can work with something at one point
        // ex : if t1 is working with show() method , t2 cannot work with show() method
        // at the same time
    }
}