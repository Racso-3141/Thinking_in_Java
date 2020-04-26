package exercise;
public class ATNTest {
	public static void main(String[] args) {
		class ATypeName {
			int i;
			double d;
			boolean b;
			void show() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(d);
			}
        }

        /*
        Object of ATypeName
         */
		ATypeName a = new ATypeName();
		a.i = 3;
		a.d = 2.71828;
		a.b = false;
		a.show();
        
        /*
        Object of DataOnly
         */
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        data.show();
	}
}
