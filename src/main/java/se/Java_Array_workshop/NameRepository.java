package se.Java_Array_workshop;

public class NameRepository {

    private static String[] names(){
        return new String[10];
    }

    // Methods
    // Part 1:
    public static int getSize(){
        //todo:
        // Returns number of elements in the array
    }

    public static void setNames(String[] names){
        //todo:
        // Sends in an array that set the private static array.
        // This should replace all existing names.
    }

    public static void clear(){
        //todo:
        // Should completely empty the array.
    }

    public static String[] findAll(){
        //todo:
        // Returns all names in a new array.
    }

    // Part 2:
    public static String find (final String fullName){
        //todo:
        // Returns name if found
        // and
        // null if not found.
    }

    public static boolean add(final String fullName){
        //todo:
        // Should add a new name to the array.
        // Returns true when name was added
        // and
        // false when the array contains the name.

    }
}
