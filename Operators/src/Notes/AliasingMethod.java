package Notes;
//exercise 3
public class AliasingMethod {
	static void change(F x) {
		x.f = 2.0f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F();
		f1.f = 1.0f;
		System.out.println("1: f of f1 is: " + f1.f);
		change(f1);
		System.out.println("2: f of f1 is: " + f1.f);
	}

}
