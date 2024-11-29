public class Punto {
	// encapsulate
	private int x;
	private int y;
	private int z;

	String dimension;

	// construcutor
	// two dimensions
	public Punto (int coorx, int coory) {
		this.x = coorx;
		this.y = coory;
	}

	// three dimensions
	public Punto (int coorx, int coory, int coorz) {
		this.x = coorx;
		this.y = coory;
		this.z = coorz;
	}

	// 0,0
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	// getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	public String getDimension() {
		return dimension;
	}

	// setters
	void setX(int valorX) {
		this.x = valorX;
	}

	void setY(int valorY) {
		this.y = valorY;
	}

	void setZ(int valorZ) {
		this.z = valorZ;
	}

	void setDimension(String dim) {
		this.dimension = dim;
	}

}
