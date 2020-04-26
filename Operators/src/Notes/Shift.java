package Notes;
// exercise 11,12,13
import static net.mindview.util.Print.*;
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0x2314421;
		print("binary string of a is: " + Integer.toBinaryString(a));
		for(int i = 0; i < Integer.toBinaryString(a).length(); i++) {
			a >>>= 1;
			print("after shifted by " + (i + 1) + ": " + Integer.toBinaryString(a)); 
		}
		int b = -1;
		print("binary string of b is: " + Integer.toBinaryString(b));
		print("binary string of b after shifted left by 5 is: " + Integer.toBinaryString(b <<= 5));
		for(int j = 0; j < Integer.toBinaryString(b).length(); j++) {
			b >>= 1;
			print("after shifted by " + (j + 1) + ": " + Integer.toBinaryString(b)); 
		}
		char c = 'a';
		print(Integer.toBinaryString(c));
		c = 'b';
		print(Integer.toBinaryString(c));
		c = 'c';
		print(Integer.toBinaryString(c));
		c = 'd';
		print(Integer.toBinaryString(c));
		c +=1;
		print(Integer.toBinaryString(c));
		c = 'A';
		print(Integer.toBinaryString(c));
		for(int i = 0; i < 26; i++) {
			c +=1;
			print(Integer.toBinaryString(c));
		}
	}

}
