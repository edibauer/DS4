public class Main {
	public static void main(String[] args) {
		// data or functions

		Punto objetoPunto = new Punto();

		// att
		objetoPunto.setX(3);
		objetoPunto.setY(6);
		objetoPunto.setZ(9);
		objetoPunto.setDimension("3D");

		// user
		System.out.printf("Dimension: %s", objetoPunto.getDimension());
		System.out.printf("X Coord: %d", objetoPunto.getX());
		System.out.printf("Y Coord: %d", objetoPunto.getY());	
		System.out.printf("Z Coord: %d", objetoPunto.getZ());


	}

}
