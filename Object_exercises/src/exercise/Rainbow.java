package exercise;

public class Rainbow {
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		atc.changeTheHueOfTheColor(1);
		System.out.print(atc.hue);
	}
}

class AllTheColorsOfTheRainbow {
	int hue = 0;
	void changeTheHueOfTheColor(int newHue) {
		hue = newHue;
	}
}
