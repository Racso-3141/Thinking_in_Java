package Notes_Controlling_Execution;
import static net.mindview.util.Print.*;
public class IfElse {
	static int test(int testval, int begin, int end) {
		if(end < begin) {
			  printnb("End < begin !! ");
			  return 0;
		  }
		  if((testval >= begin) && (testval <= end))
			  return +1;
		  if((testval < begin) || (testval > end))
			  return -1;
		  return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(test(10, 5, 12));
		print(test(5, 10, 5));
		print(test(2, 5, 10));
	}

}
