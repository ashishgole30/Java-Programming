// JUST TO CREATE A CLASS
// WHICH WILL HOLD DATA
// WE HAVE CREATED SO MANY LOC

// class Alien {
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
// }

// INSTEAD WE CAN USE record
// record class cannot extend anyother class
// can implement interfaces
// can make multiple methods
// you can create normal methods
// you can create static methods
// you can create static variables
// you CANNOT CREATE INSTANCE VARIABLE inside
record Alien(int id, String name) {

    public void show() {
    }

    static int num;
    // int age; // ERROR , instance variable

    // default constructor
    public Alien() {
        this(0, "");
    }
    // you can do some checking in constructor
}
// parameterized , canonical constructor
// DONE in 2 lines

public class Two {
    public static void main(String[] args) {
        // Record Classes
        Alien a1 = new Alien(1, "Navin");
        Alien a2 = new Alien(1, "Navin");
        Alien a3 = new Alien();
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a3);
        // a1.set
        // not possible since its by default final
        // you cannot change it
        // since we create object just for data sendind
        // immutable
        // by default your variables are private and final

        System.out.println(a1.name()); // to give us the value
    }
}