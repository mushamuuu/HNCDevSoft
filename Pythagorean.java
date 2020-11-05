/*
 * Pythagorean
 * calculates the square root of the 3 sides
 * and prints out message whether a2 + b2 = c2 is true or not
 * @author Lowell Perez
 * @version 1.00
 * @since 1.0
 * date 05/11/20
 */
import java.util.Scanner;
public class Pythagorean
{
    static Scanner keyboard = new Scanner(System.in);

    public static int geta()//ask user to enter the first number
    {
        int userinputa;
        System.out.print("Please enter first side(a): ");
        userinputa = keyboard.nextInt();
        return (userinputa);
    }//end of geta

    public static int getb()//ask user to enter the second number
    {
        int userinputb;
        System.out.print("Please enter second side(b): ");
        userinputb = keyboard.nextInt();
        return (userinputb);
    }//end of getb

    public static int getc()//ask user to enter the third number
    {
        int userinputc;
        System.out.print("Please enter third side(c): ");
        userinputc = keyboard.nextInt();
        return (userinputc);
    }//end of getc

    public static int calcASq(int aSide)//prints out the sq root of the first number
    {
        int aSq;
        aSq = (int) Math.pow(aSide, 2);
        System.out.println("Square root of " + aSide +": " + aSq);
        return(aSq);
    }//end of calcASq

    public static int calcBSq(int bSide)//prints out the sq root of the second number
    {
        int bSq;
        bSq = (int) Math.pow(bSide, 2);
        System.out.println("Square root of " + bSide +": " + bSq);
        return(bSq);
    }//end of calcBSq

    public static int calcCSq(int cSide)//prints out the sq root of the third number
    {
        int cSq;
        cSq = (int) Math.pow(cSide, 2);
        System.out.println("Square root of " + cSide +": " + cSq);
        return(cSq);
    }//end of calcCSq

    public static void displayResult(int aSq, int bSq, int cSq)//display result
    {
        if (cSq != (aSq + bSq))//total of aSq and bSq is not equal to cSq
        {
            System.out.println("That is not a right triangle.");
        }
        else
        {
            System.out.println("That is a right triangle.");
        }
        keyboard.close();
    }//end of displayResult

    public static void main(String[] args)
    {
        int aSide;
        int bSide;
        int cSide;
        int aSq;
        int bSq;
        int cSq;

        aSide = geta();//calls geta() function
        bSide = getb();//calls getb() function
        cSide = getc();//calls getc() function

        aSq = calcASq(aSide);//calls calcASq(int aSide) function
        bSq = calcBSq(bSide);//calls calcBSq(int bSide) function
        cSq = calcCSq(cSide);//calls calcCSq(int cSide) function

        displayResult(aSq,bSq,cSq);//calls displayResult function


    }//end of main
}
