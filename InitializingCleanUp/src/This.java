import static net.mindview.util.Print.*;
class Doc {	
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
		this.laryngoscopy();	
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
}
public class This {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Doc().intubate();
	}

}
