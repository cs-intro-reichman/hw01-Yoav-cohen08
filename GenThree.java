public class GenThree 
{
	public static void main(String args[]) 
	{
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int min = num2;
    int r;
	for (int i = 1;i <= 3 ;i++ ) 
	{
		r = (int)(Math.random() * (num2 - num1)) + num1;
		System.out.println(r);
		min = Math.min(r, min);
	}

	System.out.println("The minimal generated number was- " + min);
	}
}


/*javac Gen3.java   
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Gen3 10 17
12
15
12
The minimal generated number was- 12
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Gen3 10 19
14
14
15
The minimal generated number was- 14
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Gen3 10 190
102
45
41
The minimal generated number was- 41 */