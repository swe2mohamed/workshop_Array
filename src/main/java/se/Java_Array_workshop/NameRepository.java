package se.Java_Array_workshop;
import java.util.Scanner;

public class NameRepository {

    private static final String[] names =new String[10];

    // Methods
    // Part 1:
    public static int getSize(){
        return names.length - 1;
    }

    public static void setNames(String[] names){
        //todo:
        // Sends in an array that set the private static array.
        // This should replace all existing names.
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < getSize(); i++){
            if (names[i] == null){
                String addName = scanner.nextLine();
                names[i] = addName;
            }
        }
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
