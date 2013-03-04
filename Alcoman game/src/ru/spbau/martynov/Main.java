package ru.spbau.martynov;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width = 15;
		int height = 15;
		int iterationMax = 200;

		GameEngine gameEngine = new GameEngine(width, height, iterationMax);
		gameEngine.start();
	}
}
