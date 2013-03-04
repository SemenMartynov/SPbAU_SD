package ru.spbau.martynov;

import java.util.Random;

public class Alcoman {

	public Alcoman(int x, int y) {
		coordinates = new Point(x, y);
	}

	public void move(int pX, int pY, int maxX, int maxY) {
		if (sleepCounter > 0) {
			sleepCounter--;
			return;
		}
		realMove(pX, pY, maxX, maxY);
	}

	private void realMove(int pX, int pY, int maxX, int maxY) {
		// Let's try to move
		int newX = coordinates.x;
		int newY = coordinates.y;

		switch ((int) rand.nextInt(4)) {
		case 0:
			newX++;
			break;
		case 1:
			newX--;
			break;
		case 2:
			newY++;
			break;
		case 3:
			newY--;
			break;
		}

		if (newX < 0 || newY < 0 || newX >= maxX || newY >= maxY) {
			// Try one more time!
			realMove(pX, pY, maxX, maxY);
		} else {

			// Move
			coordinates = new Point(newX, newY);

			// Check collision
			if (newX == pX && newY == pY) {
				sleepCounter = 5;
			}
		}
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

	private Random rand = new Random();
	private int sleepCounter;
	private Point coordinates;
	private String name = "A";
}
