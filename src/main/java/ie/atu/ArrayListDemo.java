package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {


    public static void main(String[] args) {
        //create arraylist
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);
        numbers.add(900);
        numbers.add(1000);

        //enhanced for loop
        loop(numbers);

        //get user input to append to arraylist
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a value for the array list");

        numbers.add(sc.nextInt());

        //reset index counter
        loop(numbers);

    }

    static void loop(ArrayList<Integer> numbers) {
        int x = 0;
        for (int number : numbers) {
            System.out.println("Index " + x + " :" + number);
            x++;
        }
    }

}
