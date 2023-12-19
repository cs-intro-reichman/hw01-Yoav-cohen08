public class Triangle 
{
	public static void main(String args[]) 
	{
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    boolean bool = false;
    if(((num1 + num2) > num3) && ((num1 + num3) > num2) && ((num2 + num3) > num1))
    {
    	bool = true; 
    }

    System.out.println(num1 + ", " + num2 + ", " + num3 + ": " + bool);

	}
}


/* javac Triangle.java 
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Triangle 3 4 5
3, 4, 5: true
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Triangle 3 4 9
3, 4, 9: false
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Triangle 2 3 6
2, 3, 6: false
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Triangle 5 7 10
5, 7, 10: true */