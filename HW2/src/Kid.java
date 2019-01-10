import java.util.Random;
/**
 * Declares the derived class Kid @see Person
 */
public class Kid extends Person {
	
	private enum favCandy {Snickers, Twix, KitKat, AlmondJoy};
	private favCandy candy;

	/**
	 * no arg constructor uses random number generation to assign enum variable favCandy
	 */
	public Kid() {

		Random rnd = new Random();
		int num = rnd.nextInt(4);
		if (num == 0)
			candy = favCandy.AlmondJoy;
		if (num == 1)
			candy = favCandy.Twix;
		if (num == 2)
			candy = favCandy.KitKat;
		if (num == 3)
			candy = favCandy.Snickers;
	}
	public favCandy getCandy(){return candy;}
}
