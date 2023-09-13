package main;

import java.io.*;
public class Task02
{
    // TODO: to be deleted for new recruit
    // private static void printOut(double a, double b, double c, double x1) {
    //     System.out.printf("For a = " + "%4.2f. ", a);
    //     System.out.printf(" b = " + "%4.2f. ", b);
    //     System.out.printf(" c = " + "%4.2f. \n", c);
    //     System.out.print("x1 = ");
    //     System.out.printf("%4.2f \n" , x1);
    // }
     public static int numberOfElementsGiven(double delta) {
         int numberOfElements = 0;
         if (delta < 0) numberOfElements = 0;
         if (delta == 0) numberOfElements = 1;
         if (delta > 0) numberOfElements = 2;
         return numberOfElements;
     }
    public static double delta(double a, double b, double c){
         return b * b - 4 * a * c;
    }
    public static void main(String[] args) throws IOException
    {
        double a, b, c, delta, x1, x2;
        int numberOfElements = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will count x1 and x2 from ax^2+bx+c=0");
        System.out.println("set a");
        a = Double.parseDouble(br.readLine());
        if (a==0)
        {
            System.out.println("this is wrong value for 'a' ");
        }
        else
        {
            System.out.println("set b");
            b = Double.parseDouble(br.readLine());
            System.out.println("set c");
            c = Double.parseDouble(br.readLine());
            delta = b * b - 4 * a * c;
            if (delta < 0) numberOfElements = 0;
            if (delta == 0) numberOfElements = 1;
            if (delta > 0) numberOfElements = 2;
            switch (numberOfElements) {
                case 0:
                    System.out.println("No value for x1 and x2");
                    break;
                case 1:
                {
                    x1 = -b / (2 * a);
                    System.out.printf("For a = " + "%4.2f. ", a);
                    System.out.printf(" b = " + "%4.2f. ", b);
                    System.out.printf(" c = " + "%4.2f. \n", c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f " , x1);
                }
                break;
                case 2:
                    // based on previous case add solution for this case
                    // TODO: to be delated for new recruit
                    // {
                    //     x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    //     x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    //     System.out.printf("For a = " + "%4.2f. ", a);
                    //     System.out.printf(" b = " + "%4.2f. ", b);
                    //     System.out.printf(" c = " + "%4.2f. \n", c);
                    //     System.out.print("x1 = ");
                    //     System.out.printf("%4.2f \n" , x1);
                    //     System.out.print("x2 = ");
                    //     System.out.printf("%4.2f" , x2);
                    // }
                    break;
                default:
                    break;
            }
        }
    }
}


