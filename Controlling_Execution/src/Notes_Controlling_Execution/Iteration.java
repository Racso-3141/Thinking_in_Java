package Notes_Controlling_Execution;
import static net.mindview.util.Print.*;
import java.util.*;
public class Iteration {
	// exercise 4
	static void prime(int bound) {
		for (int j = 2; j <= bound; j++) {
			int factor = 0;
			for (int k = 1; k <= j; k++) {
				if (j % k == 0) {
					factor++;
				}
			}
			if (factor == 2) {
				print(j);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 101; i++) {
			print(i);
		} //exercise 1,7
		Random rand = new Random();
		for (int i = 0; i < 25; i++) {
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			print("a: " + b + " b: " + b);
			if (a < b) {
				print("a < b");
			} else if(a == b) {
				print("a = b");
			} else {
				print("a < b");
			}
		} // exercise 2
		prime(100);
	}

}
