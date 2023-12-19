
public class LinearEq 
{
	public static void main(String args[]) 
	{
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);
    double num3 = Double.parseDouble(args[2]);
	double s = ((num3 - num2)/num1);
	System.out.println(num1 + " * x + " + num2 + " = " + num3);
	System.out.println("x = " + s);

	}
}



/*Homework25:12 % javac LinearEq.java 
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java LinearEq 2 5 19
2.0 * X + 5.0 = 19.0
X = 7.0
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java LinearEq 3 4 5 
3.0 * X + 4.0 = 5.0
X = 0.3333333333333333 */