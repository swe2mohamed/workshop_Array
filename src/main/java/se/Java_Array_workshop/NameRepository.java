package se.Java_Array_workshop;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    // Part 1:
    public static int getSize() {
        //todo: Returns number of elements in the array
        int count = 0;
        for (String name : names) {
            if (name != null) {
                count += 1;
            }
        }
        return count;
    }

    public static void setNames(String[] names) {
        //todo: Sends in an array that set the private static array.This should replace all existing names.
        NameRepository.names = Arrays.copyOf(names, names.length);
    }

    public static void clear() {
        //todo: Should completely empty the array.
        Arrays.fill(names, null);
    }

    public static String[] findAll() {
        // todo: Returns all names in a new array
        int count = 0;
        for (String name : names) {
            if (name != null) {
                count += 1;
            }
        }
        String[] notNullArray = new String[count];
        int index = 0;
        for (String name : names) {
            if (name != null) {
                notNullArray[index++] = name;
            }
        }
        return notNullArray;
    }

    // Part 2:
    public static String find ( final String fullName){
        //todo: Returns name if found and null if not found.
        if (fullName != null) {
            for (String name : names) {
                if (fullName.equals(name)) {
                    return fullName;
                }
            }
        }
        return null;
    }

    public static boolean add(final String fullName){
        // todo: Should add a new name to the array. Returns true when name was added and false when the array contains the name.
        for (int i = 0; i < names.length; i++){
            if (names[i] != null && names[i].equals(fullName)){
                return false;
                } else if (names[i] == null) {
                names[i] = fullName; // Add new name here
                return true;
            }
        }
        return false;
    }
}


