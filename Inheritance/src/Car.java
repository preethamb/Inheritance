
public class Car extends Machine {


	@Override
	public void start() {
		System.out.println("car started");
	}

	public void windWiping()
	{
		System.out.println("Windows are get cleaned");
	}
	public void showInfo() {
		System.out.println("car name ;"+ name);
	}
}
