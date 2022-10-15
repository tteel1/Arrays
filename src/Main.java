import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numArray = {4,5,8,1,6,8,7,44,6};
        int sum = 0;
        for(int i: numArray) {
            sum+=i;
        }
        System.out.println("The sum of all the numbers in numArray is" +" "+ sum);

        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println("The output of this code is to show the index of the largest number in the Array which is"+" "+index);

        System.out.println(Arrays.toString(toPower(11,5)));



    }
    public static int [] toPower (int size, int power){
        int [] arr = new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr [i] = (int) Math.pow(i,power);
        }
        return arr;
    }
}