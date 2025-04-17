import java.util.TreeSet;
class Person implements Comparable<Person> {
    String name;
    
    public Person(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString() {
        return name;
    }
}
    
