package Notes_Controlling_Execution;

import static net.mindview.util.Print.*;

public class Break {
	static void counta() {
		for(int i = 1; i < 101; i++) {
			printnb(i);
		}
	}static void countb() {
		for(int i = 1; i < 101; i++) {
			printnb(i);
			if (i == 99) {
				break;
			}
		}
	}static void countc() {
		for(int i = 1; i < 101; i++) {
			printnb(i);
			if (i == 99) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		counta();
		print();
		countb();
		print();
		countc();
	}
}
