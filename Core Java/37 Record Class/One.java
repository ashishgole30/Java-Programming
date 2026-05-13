class Alien {
    private final int id;
    private final String name;

    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class One {
    public static void main(String[] args) {

        // Record Classes

        Alien a1 = new Alien(1, "Navin");

        // System.out.println(a1); // gives hashcode if toString() method is not
        // overriden in Aliean class, we dont
        // want it
        System.out.println(a1);

        Alien a2 = new Alien(1, "Navin");

        System.out.println(a1.equals(a2));
        // False ->they are two different object in two different memory location

        // if we want True and change the comparision logic of equals
        // we override two methods in our alien class
        // override equals() and hashCode() methods

        // toString -> prints the values
        // equals->compares values instead of comparing the memory location and stuff

    }
}