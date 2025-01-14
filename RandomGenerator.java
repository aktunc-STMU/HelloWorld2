import java.util.Random;

public class RandomGenerator{
	
	public RandomGenerator() 

	//public static void main(String args[])
	{
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 9
		int randomLeftButton = rand.nextInt(10);
		int randomMiddleButton = rand.nextInt(10);
		int randomRightButton = rand.nextInt(10);

		// Print random integers
		display(randomLeftButton);
		display(randomMiddleButton);
		display(randomRightButton);
	}

	private void display(int randomLeftButton) {
		// TODO Auto-generated method stub
		
	}
}