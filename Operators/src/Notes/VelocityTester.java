package Notes;

import static net.mindview.util.Print.print;
class VelocityCalculator {
	static float velocity(float d, float t) {
		if(t == 0) {
			return 0f; 
		}
		else {
			return d/t;
		}
	}
}
public class VelocityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d = 55.5f;
		float t = 11.06f;
		float velocity = VelocityCalculator.velocity(d, t);
		print("Velocity is: " + velocity);
	}

}
