import static net.mindview.util.Print.*;
//exercise 3, 4
class Bird {
	Bird() {
		print("new brid.");
	}
	Bird(String s) {
		print(s + " is a new bird.");
	}
}

class Dog {
	void bark(int i) {
		print("int: i");
	}
	void bark(char c) {
		print("char: c");
	}
	void bark(short s) {
		print("short: s");
	}
	void bark(long l) {
		print("int: i");
	}
	void bark(byte b) {
		print("byte: b");
	}
	void bark(int j, String str) {
		print(j + str);
	}
	void bark(String str, int j) {
		print(str + j);
	}
}

//exercise 7
class Pig {
	Pig() {
		print("this is a pig");
	}
	Pig(String s) {
		this();
		print("this pig is " + s);
	}
}

public class Constructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercise 3,4
		Bird b = new Bird(); //exercise 3
		Bird c = new Bird("c"); //exerice 4
		Dog d = new Dog();
		//exercie 5
		d.bark(1);
		d.bark('c');
		short s = 321;
		d.bark(s);
		long l = 456;
		d.bark(l);
		byte byt = 10;
		d.bark(byt);
		//exercise 6
		d.bark(1, " dog"); 
		d.bark("dog ", 1);
		//exercise 7
		Pig p = new Pig("cute");
	}

}
