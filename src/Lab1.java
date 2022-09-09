import java.util.*;

public class Lab1 {


    public static void main(String[] args) {

        int choice;
        Scanner scan;
        boolean mainLoop;

        scan = new Scanner(System.in);
        mainLoop = true;

        do{
            System.out.println("Calculator Main Menu\n");
            System.out.print("1.) Task 1 \n");
            System.out.print("2.) Task 2\n");
            System.out.print("3.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = scan.nextInt();
        }
        while(choice >4);

        switch (choice) {
            case (1):
                task1();
                break;
            case (2):
                task2();
                break;
            default:
                System.out.println("Enter a valid option");
                break;
        }

    }


    public static int getInt() {

        Scanner scan;
        boolean isint;
        int num;

        num = 0;
        isint = true;
        scan = new Scanner(System.in);

        try {
            System.out.println("Enter an integer");
            num = scan.nextInt();
        } catch (Exception InputMismatchException) {
            while (!scan.hasNextInt()) {
                System.out.println("Enter a valid integer");
                scan.nextLine();
            }
            num = scan.nextInt();
        }

        return num;

    }

    public static char getChar() {

        Scanner scan;
        boolean ischar;
        String str;
        char ch;

        ch = ' ';
        ischar = true;
        scan = new Scanner(System.in);

        try {
            while (ischar) {
                System.out.println("Enter a character");
                str = scan.nextLine();
                if (str.length() == 1) {
                    ch = str.charAt(0);
                    ischar = false;
                } else {
                    System.out.println("Enter a valid character");
                }
            }
        }
        catch (Exception InputMismatchException) {
            while (ischar) {
                System.out.println("Enter a character");
                str = scan.next();
                if (str.length() == 1) {
                    ch = str.charAt(0);
                    ischar = false;
                }
            }
            ch = scan.next().charAt(0);
        }
        return ch;
    }

    public static void task1() {

        Scanner scan;
        int count;
        int num;
        Random rand;
        int rnum;

        scan = new Scanner(System.in);
        rand = new Random();
        rnum = rand.nextInt(10, 99);
        count = 0;
        System.out.println("Random Num = " + rnum);



        while (count < 10) {

            count++;
            num = getInt();

            if (num == rnum) {
                System.out.println("You guessed my number in " + count + " tries");
                System.out.println(" ");
                count = 11;
            } else if (num / 10 == rnum % 10  && num %10 == rnum / 10) {
                System.out.println("Incorrect (hint: " + "2 digits match)");
                System.out.println(" ");
            } else if (num % 10 == rnum / 10 || num % 10 == rnum % 10) {
                System.out.println("Incorrect (hint: " + "1 digit matches)");
                System.out.println(" ");
            }else if (num / 10 == rnum / 10 || num / 10 == rnum % 10) {
                System.out.println("Incorrect (hint: " + "1 digit matches)");
                System.out.println(" ");
            } else {
                System.out.println("Incorrect");
                System.out.println(" ");
            }
        }

    }

    public static void task2() {

        Scanner scan;
        int num;
        char ch;

        System.out.println("How many chars / last row?");
        scan = new Scanner(System.in);
        num = getInt();

        while(!(num > 4 && num < 22)){
            System.out.println("Enter a number between 5 and 21");
            num = getInt();
        }

        System.out.println("What character?");
        ch = getChar();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print(ch);
                } else {
                    if (j == 0 || j == num - 1) {
                        System.out.print(ch);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }


    }
}
