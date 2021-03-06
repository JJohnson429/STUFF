// Git collaborative COP-2805C (Java II) project.
// $Id$

package mypkg;

/** Class used for COP-2805C git and GitHub project.
*/
public class SayHello
{
    /** Displays greetings for all students.
      * When done, displays a count of students who edited this file.
      * @param args - Unused
      */
    public static void main ( String [] args )
    {
        int counter = 0;

        System.out.println( "Howdy!  My name is Wayne Pollock." );
        counter++;

        // (1) Add your own output below these comments that includes your name.
        // (2) Place "counter++;" command after your contribution, to keep count.
        // (3) Keep the existing println statement at the very end.
        
        System.out.println( "Greetings all! My name is Tyler Swessel." );
        counter++;

        System.out.println();
        System.out.println( "Hello from Amy DeStefanis.  ");
        System.out.println( "What's the difference between a watermelon and a sweet pea? ");
        System.out.println( "....  about 15 minutes!!! ");
        System.out.println();
        counter++;

        System.out.print("Hello, I am Jeremy Johnson. ");
        System.out.println("The best thing about a boolean is even if you are wrong, you are only off by a bit.");
        System.out.println();
        counter++;

        System.out.println( "Number of students who edited this file: "
            + counter );
    }
}
