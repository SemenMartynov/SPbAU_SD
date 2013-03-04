package ru.spbau.martynov;

public class Pole {

	public Pole(int x, int y) {
		coordinates = new Point(x, y);
	}

	boolean checkСollision(Point nextPoint) {
		return nextPoint.equals(coordinates);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return coordinates.x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return coordinates.y;
	}

	public String toString() {
		return name;
	}

	private final Point coordinates;
	private String name = "P";
}
