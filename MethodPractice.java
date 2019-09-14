/**
 * CS152 Lab 4 -- Welcome to Methods.
 *
 * Implement all the methods described below.
 *
 * Student name: Steven Archuleta
 */

import java.util.List;
import java.util.ArrayList;

public class MethodPractice {

    /**
     * Returns largest of its arguments.
     * @param x First argument
     * @param y Second argument
     * @param z Third argument
     * @return Maximum of x, y and z
     */
    public static int findLargest( int x, int y, int z) {
        int largest = 0;
        if (x > y && x > z) {
            largest = x;
        } else if (y > x && y > z) {
            largest = y;
        } else {
            largest = z;
        }
        return largest;
    }

    /**
     * Is the argument even?
     * (Recall that even numbers are divisible by 2)
     * @param x Value to check.
     * @return True if x is an even number, false otherwise.
     */
    public static boolean isEven( int x ) {
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Does the given string contain the letter G (either upper or
     * lower case)?
     * @param x String to check
     * @return True if x contains G, false otherwise.
     */
    public static boolean hasG( String x ) {
        x = x.toLowerCase();
        for(int i = 0 ; i < x.length(); i++){
            char letter = x.charAt(i);
            if (letter == 'g'){
                return true;
            }
        }return false;
    }

    /**
     * Where is the location of the letter G (upper or lower case) in
     * the given string?
     * @param x String to check
     * @return 0 based location of first occurrence of G in x,
     *         -1 if G is not present.
     */
    public static int indexOfG( String x ) {
        x = x.toLowerCase();
        for(int i = 0 ; i < x.length(); i++) {
            char letter = x.charAt(i);
            if (letter == 'g') {
                return i;
            }
        }return -1;
    }

    /**
     * This method returns a response based on the string input:
     *     Apple => Orange
     *     Hello => Goodbye!
     *     Turing => Machine
     *     Yay! => \o/
     * Any other input should be responded to with:
     *     What should I say?
     * @param input The input string
     * @return Corresponding output string.
     */
    public static String respond( String input ) {
        String lowercase = input.toLowerCase();
        if (lowercase.equals("apple")) {
            return "Orange";
        } else if (lowercase.equals("hello")) {
            return "Goodbye!";
        } else if (lowercase.equals("turing")) {
            return "Machine";
        } else if (lowercase.equals("yay!")) {
            return "\\o/";
        } else {
            return "What should I say?";
        }
    }

    /**
     * Average up to five even numbers. Any odd values are
     * not included in the average.
     * @param a First value
     * @param b Second value
     * @param c Third value
     * @param d Fourth value
     * @param e Fifth value
     * @return Average of the even input values. If none are even, returns -1000.
     */
    public static double averageOfEvensOnly( int a, int b, int c, int d, int e ) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(d);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        double evens = 0;
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number<200){
                if(isEven(number)){
                    count++;
                    evens += number;
                    //System.out.println("Evens sum: "+ evens +"\nCount: "+count+ "index" +i);
                }
            }else{
                i++;
            }

        }
        if (count > 0) {
            double average = (double) evens / count;
            //System.out.println("Average: " +average);
            return average;
        } else {
            return -1000;
        }
    }

    /**
     * Multiplies odd numbers by two and gets the square of the even numbers
     * @param a Input value
     * @return integer of doubled odd or squared evens.
     */
    public static int doubleOddSquareEven(int a){
        int answer = 0;
        if(isEven(a)){
            answer = a * a;
        }else{
            answer = a * 2;
        }return answer;
    }


    // WRITE A METHOD FROM SCRATCH
    //
    // Write a method called computeMealTotal that takes two
    // arguments, an int meal which is the cost of a meal, and a
    // double tip which represents the tip percentage one would add to
    // the bill.
    // The method must return a double which equals how much should be
    // paid.
    //
    // int meal must be greater than 0
    // double tip must be 0 or greater and .7 or less (no tips over 70%)
    // If either number is invalid, return -1;
    //
    // Don't forget to use the public static modifiers





    // This code tests your program's completeness.
    public static void main(String[] args) {
        int numCorrect = 0;

        if( findLargest(1, 2, 3) == 3 ) { numCorrect++; System.out.println("1");}
        if( findLargest(4,-5, 2) == 4 ) { numCorrect++; System.out.println("2");}
        if( findLargest(0, 7, 5) == 7 ) { numCorrect++; System.out.println("3");}

        if( !isEven(3) ) { numCorrect++; System.out.println("4");}
        if( isEven(-2) ) { numCorrect++; System.out.println("5");}
        if( isEven(0) ) { numCorrect++; System.out.println("6");}

        if( !hasG( "man" ) ) { numCorrect++; System.out.println("7");}
        if( hasG( "dog" ) ) { numCorrect++; System.out.println("8");}
        if( hasG( "EGGSHELL" ) ) { numCorrect++; System.out.println("9");}

        if( indexOfG( "man" ) == -1 ) { numCorrect++; System.out.println("10");}
        if( indexOfG( "EGGSHELL" ) == 1 ) { numCorrect++; System.out.println("11");}
        if( indexOfG( "dog" ) == 2 ) { numCorrect++; System.out.println("12");}
        if( indexOfG( "xyzggGGggG" ) == 3 ) { numCorrect++; System.out.println("13");}
        if( indexOfG( "xyzGGggGGg" ) == 3 ) { numCorrect++; System.out.println("14");}

        if( respond( "Apple" ).equals( "Orange" ) ) { numCorrect++; System.out.println("15");}
        if( respond( "Hello" ).equals( "Goodbye!" ) ) { numCorrect++; System.out.println("16");}
        if( respond( "Turing" ).equals( "Machine" ) ) { numCorrect++; System.out.println("17");}
        if( respond( "Yay!" ).equals( "\\o/" ) ) { numCorrect++; System.out.println("18");}
        if( respond( "xyz" ).equals( "What should I say?" ) ) { numCorrect++; System.out.println("19");}

        if( averageOfEvensOnly(12, 13, 12, 13, 12) == 12.0) { numCorrect++; System.out.println("20");}
        if( averageOfEvensOnly(-1, 3, -5, 7, 9) == -1000.0) { numCorrect++; System.out.println("21");}
        if( averageOfEvensOnly(0, 0, 15, 0, -2) == -0.5) { numCorrect++; System.out.println("22");}
        if( averageOfEvensOnly(100, -3, 4021, -2, 13) == 49.0) { numCorrect++; System.out.println("23");}

        // Uncomment these tests AFTER IMPLEMENTING doubleOddSquareEven
        if( doubleOddSquareEven( 4 ) == 16 ) { numCorrect++; System.out.println("24");}
        if( doubleOddSquareEven( 3 ) == 6 ) { numCorrect++; System.out.println("25");}

        // Uncomment these tests AFTER IMPLEMENTING computeMealTotal
        // if( computeMealTotal( 0, .3 ) == -1 ) { numCorrect++; }
        // if( computeMealTotal( 10, .2 ) == 12.0 ) { numCorrect++; }
        // if( computeMealTotal( 100, .5 ) == 150 ) { numCorrect++; }
        // if( computeMealTotal( 100, .71 ) == -1 ) { numCorrect++; }
        // if( computeMealTotal( 120, .32 ) == 158.4 ) { numCorrect++; }

        System.out.println( "Your program's completeness is currently: "
                + numCorrect + "/30" );
    }

}