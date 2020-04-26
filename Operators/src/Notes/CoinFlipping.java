package Notes;
import java.util.*;
import static net.mindview.util.Print.*;
public class CoinFlipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int c = rand.nextInt(100);
		print(c);
		if (c % 2 == 0) {
			System.out.print("head");
		} else {
			System.out.print("tail");
		}
	}

}
