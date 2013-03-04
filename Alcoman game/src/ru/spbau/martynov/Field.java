package ru.spbau.martynov;

public class Field {

	public Field(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * @param alcoman
	 *            the alcoman to set
	 */
	public void setAlcoman(Alcoman alcoman) {
		this.alcoman = alcoman;
	}

	/**
	 * @param poles
	 *            the poles to set
	 */
	public void setPole(Pole pole) {
		this.pole = pole;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i != width; i++) {
			for (int j = 0; j != height; j++) {
				result.append("  ");
				if (alcoman.getX() == i && alcoman.getY() == j) {
					result.append(alcoman);
				} else if (pole.getX() == i && pole.getY() == j) {
					result.append(pole);
				} else {
					result.append(".");
				}

			}
			result.append("\n");
		}
		return result.toString();
	}

	private int width;
	private int height;

	private Alcoman alcoman;
	private Pole pole;
}
