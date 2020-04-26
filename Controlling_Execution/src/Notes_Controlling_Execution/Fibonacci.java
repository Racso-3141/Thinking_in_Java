package Notes_Controlling_Execution;
import static net.mindview.util.Print.*;
//exercise 9
public class Fibonacci {
	static int F(int i) {
		if(i < 2) return 1;
		return (F(i - 2) + F(i - 1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 0; j < 20; j++) {
			print(F(j));
		}
	}

}
