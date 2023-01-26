package ie.atu;

public class ArrayDemo {

    public static void main(String[] args) {

        int myArray[];

        myArray = new int[10];

        for (int i=0; i< 10; i++) {

            myArray[i] = 100 * (i+1);
            System.out.println(myArray[i]);
        }

    }

}
