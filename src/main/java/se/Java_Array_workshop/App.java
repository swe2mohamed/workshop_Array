package se.Java_Array_workshop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] originalNamesArray = new String[10];
        System.out.println(Arrays.toString(originalNamesArray));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < originalNamesArray.length ; i++) {
            if (originalNamesArray[originalNamesArray.length - 1] == null) {
                do {
                    System.out.println("Add Name: ");
                    String addName = scanner.nextLine();
                    originalNamesArray[i] = addName;
                    System.out.println(Arrays.toString(originalNamesArray));
                }
                while (originalNamesArray[i] == null);
            }
        }
    }
}
