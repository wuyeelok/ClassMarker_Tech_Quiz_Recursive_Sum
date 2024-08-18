package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int getRecursiveSumOfDigit(String n , int k){

        long sum = getRecursiveSumOfDigitL(n, k);

        while (String.valueOf(sum).length() > 1) {
            sum = getRecursiveSumOfDigitL(String.valueOf(sum), 1);
        }

        return (int) sum;
    }

    private static long getRecursiveSumOfDigitL(String n, int k) {
        long sum = 0;


        for (int i = 0; i < n.length(); i++) {
            int cursorValue = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum = sum + cursorValue;
        }
        sum = sum * k;
        return sum;
    }

}
