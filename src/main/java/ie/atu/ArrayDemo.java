package ie.atu;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        int myArray[];

        myArray = new int[10];

        for (int i=0; i< 10; i++) {

            myArray[i] = 100 * (i+1);
            System.out.println(myArray[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for array");

        try {

            int userInput = sc.nextInt();

            myArray[10] = userInput;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have exceeded your memory limit.");
        }

        enhancedLoop(myArray);


    }

    static void enhancedLoop(int array[]) {
        for (int x : array) {
            System.out.println(x);
        }
    }

}
