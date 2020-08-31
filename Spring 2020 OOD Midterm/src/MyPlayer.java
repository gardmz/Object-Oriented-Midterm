import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MyPlayer{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{		
		
		PlayerFactory myPlayer = PlayerFactory.getFactory();
		
		String playerType = "RunningBack";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a player type: RunningBack, QuarterBack, TightEnd");
		playerType = s.next();
		
		myPlayer.setPlayer(playerType);
		
		System.out.println("Your player is a " + playerType + " and their top speed is " + myPlayer.getSpeed() + " miles per hour");
	}
	 
}