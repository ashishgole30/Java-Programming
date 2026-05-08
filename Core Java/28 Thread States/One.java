public class One {
    public static void main(String[] args) {

        // Thread States

        // 1.new state
        // new thread goes to new state
        // if you create new thread it goes here

        // 2.runnable state
        // If you start the thread it goes to
        // runnable state
        // waiting for scheduler
        // start()

        // 3.running state
        // When your thread is actually running
        // on the CPU
        // run()

        // 4.waiting state/block state
        // when thread is sleeping
        // sleep()
        // wait()
        // to comeback use notify() and thread goes back to runnable state

        // 5.dead state
        // stop()
        // once thread finishes
    }
}