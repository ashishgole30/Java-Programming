public class Four {
    public static void main(String[] args) {

        // On top we have the object class
        // every class in java extends the object class
        // even if you dont mention its there

        // OBJECT
        // /
        // THROWABLE
        // / \
        // ERROR EXCEPTION

        // most of the names which ends with able
        // are actually interfaces in java
        // like comparable, runnable, serializable, clonable, iterable etc
        // however throwable is a class and not an interface

        // Exceptions you can handle
        // Errors you cannot handle

        // ERROR
        // / \ \
        // thread death , IO error , Virtual Machine error , outof memory error ,
        // stack overflow error

        // EXCEPTION
        // / / /
        // Runtime exception ( UNCHECKED EXCEPTION )
        // a) artihmetic exception
        // b) null pointer exception
        // c) array index out of bound exception
        // SQL exception ( CHECKED EXCEPTION )
        // IO exception ( CHECKED EXCEPTION )

        // SQL exception (CHECKED EXCEPTION)
        // IO exception (CHECKED EXCEPTION)

        // Compiler does not forces you to handle runtime exceptions
        // however it forces you to handle checked exceptions

    }
}