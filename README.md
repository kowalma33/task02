# task02_delta

but insirt Main

TASK:

-make a program that will find square from 
 ax^2+bx+c=0
-use function switch
-a,b,c are real numbers entered from keyboard
-for a,b,c,x1,x2 you need to round them down to 2 numbers after the coma


- java skills
	.
- coding skills
	.change of existing code
	.exporting methods to a different class
	.some math problems solving?
- testing skills
	.knowing what test are about?
	.based on example try to write it's own tests
- understanding of algorythms (basic)
	.sorting
	.quick sorting//recurency
- searching for solution skill (if he will try to ask questions? maybe use stackOverflow?)

delta < 0: a=4, b=5, c=6
delta = 0: a=1, b=2, c=1
delta > 0: a=1, b=5, c=2


Proposition for test cases:

public static void printOut(double a, double b, double c, double x1) {
                    System.out.printf("For a = " + "%4.2f. ", a);
                    System.out.printf(" b = " + "%4.2f. ", b);
                    System.out.printf(" c = " + "%4.2f. \n", c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f \n" , x1);
				}
				
private static int numberOfElementsGiven(double a, double b, double c, double delta)
    {
        int numberOfElements = 0;
        
        if (delta < 0) numberOfElements = 0;
        if (delta == 0) numberOfElements = 1;
        if (delta > 0) numberOfElements = 2;

        return numberOfElements;
    }
