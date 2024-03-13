package se.Java_Array_workshop;
import java.util.Arrays;
import java.util.Scanner;

public class NameRepository {
    private static final String[] names =new String[10];

    // Part 1:
    public static int getSize(){
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
        System.out.println(Arrays.toString(names));
    }

    public static void clear(){
        //todo: Should completely empty the array.
        Arrays.fill(names,null);
    }

    public static String[] findAll(){
        //todo: Returns all names in a new array.
        return Arrays.copyOf(names,getSize());
    }

    // Part 2:
    public static String find(final String fullName){
        //todo: Returns name if found and null if not found.
        for (int i = 0; i < getSize(); i++){
            if (names[i].equals(fullName)){
                return fullName;
            }
        }
        return null;
        }
    public static boolean add(final String fullName){
        //todo:
        // Should add a new name to the array.
        // Returns true when name was added
        // and
        // false when the array contains the name.
        Scanner scanner = new Scanner(System.in);
        fullName = scanner.nextLine();
        if (find(fullName) == null){

        }


    }


}
