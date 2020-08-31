
import java.lang.reflect.InvocationTargetException;

public class PlayerFactory {

	static PlayerFactory pf;
	Player player;

	private PlayerFactory() {
		System.setProperty("player", "RunningBack");
	}
	public void setPlayer(String player) {
		System.setProperty("player", player);
	}
	public double getSpeed() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		String s = System.getProperty("player");
		player = (Player) Class.forName(s).getDeclaredConstructor().newInstance();
		return player.getSpeed();
	}
	public static PlayerFactory getFactory() {
		if (pf == null)
			pf = new PlayerFactory();
		return pf;
	}
}
