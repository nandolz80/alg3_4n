
public class Cor {

	private int red;
	private int green;
	private int blue;
	private int grey;

	public Cor(int r, int g, int b) {
		this.red = r;
		this.green = g;
		this.blue = b;
	}

	public Cor( int cinza ) {
		this.grey = cinza;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public int getGrey() {
		return grey;
	}
}