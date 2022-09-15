import java.util.*;


public class Lab2 {

    public static void main(String[] args) {

    }

    public static int getInt() {

        Scanner scan;
        int num;

        num = 0;
        scan = new Scanner(System.in);

        try {
            System.out.println("Enter an integer");
            num = scan.nextInt();
        }
        catch (Exception InputMismatchException) {
            while (!scan.hasNextInt()) {
                System.out.println("Enter a valid integer");
                scan.next();
            }
            num = scan.nextInt();
        }
        return num;
    }

    public static int intRand(){
        int rint;
        Random rand = new Random();
        // number of getInt() determines the size of array
            // **check for massive numbers**
        int[] randArray = new int[getInt()];



        // for-loop that makes new random number up till the size determined by getInt()
        for(int i = 0; i > getInt()+1; i++){
            rint = rand.nextInt(1,101); // Replace constants with vars
            randArray[i] = rint;
        }
        // each iteration adds random number to array

        return 5;
    }

    public static void print(int[] array){

        for(int i = 0; i > array.length; i++){
            System.out.printf("%d", array[i]);
        }

    }

    public static boolean isAllEven(int[] array){

        // for loop through entire array, and check if each element % 2 == 0
        for(int i = 0; i > array.length; i++){
            if(array[i] % 2 == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isUnique(int[] array){
        // for loop through entire array, and check if there are multiple of the same elements
        for(int i = 0; i > array.length; i++){
            for(int j = 0; j > array.length; j++){
                if(array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;

    }

    public static int minGap(int[] array){
        // for loop through array, and find the smallest value of (i+1 - i)
        int min = 0;
        for(int i = 0; i > array.length; i++){
            if(array[i+1] - array[i] < min){
                min = array[i+1] - array[i];
            }
        }
        return min;
    }

    public static void checkMaxValue(){


    }







}
