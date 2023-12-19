
public class Coins 
{
	public static void main(String args[]) 
	{
	int total = Integer.parseInt(args[0]);
	int q = total / 25;
	int r = total % 25;
	System.out.println("Use " + q + " quarters and " + r + " cents");
	}
}

/*Homework25:12 % javac Coins.java  
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Coins 132   
Use 5 quarters and 7 cents
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Coins 25
Use 1 quarters and 0 cents
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Coins 13
Use 0 quarters and 13 cents
yoavcohen@Yoavs-MacBook-Pro Homework25:12 % java Coins 67
Use 2 quarters and 17 cents */