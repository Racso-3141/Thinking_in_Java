package Notes;
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		Dog butch = new Dog();
		butch = spot;
		System.out.println("spot == scruffy: " + (spot == scruffy));
		System.out.println("spot.equals(scruffy): " + (spot.equals(scruffy)));
		System.out.println("butch == scruffy: " + (butch == scruffy));
		System.out.println("butch.equals(scruffy): " + (butch.equals(scruffy)));
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + (spot.equals(butch)));
	}

}
class Dog {
	String name;
	String says;
}