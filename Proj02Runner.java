// File: Proj02Runner.java

import java.util.*;

public class Proj02Runner implements Comparable<Proj02Runner> {

    // Private instance variable to store the value
    private int value;

    // Default constructor
    public Proj02Runner() {
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma\n" );
    }

    // Overloaded constructor that takes an integer parameter
    public Proj02Runner(int value) {
        this.value = value;
    }

    // Getter method for the value
    public int getValue() {
        return value;
    }
    // Override the equals method to provide consistent behavior when there are duplicate elements
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Proj02Runner other = (Proj02Runner) obj;
        return value == other.value;
    }

    // Override the hashCode method as it is recommended to do so whenever equals is overridden to ensure
    // that duplicate elements have the same hash code which is important for searching hash-based collections
    //such as a hashSet
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    // Implement the compareTo method of the Comparable interface
    @Override
    public int compareTo(Proj02Runner other) {
        return Integer.compare(this.value, other.getValue());
    }

    // Override the toString method to provide a meaningful string representation
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
