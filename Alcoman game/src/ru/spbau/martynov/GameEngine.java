package ru.spbau.martynov;

public class GameEngine {

	public GameEngine(int width, int height, int iterationMax) {
		this.iterationMax = iterationMax;
		// Field
		field = new Field(width, height);
		// Pole
		pole = new Pole(7, 7);
		field.setPole(pole);
		// Alcoman
		alcoman = new Alcoman(0, 0);
		field.setAlcoman(alcoman);
	}

	void start() {
		// Main loop
		for (int i = 0; i != iterationMax; i++) {
			alcoman.move(pole.getX(), pole.getY(), field.getWidth(),
					field.getHeight());

			System.out.println("\n\n----------------------------- iteration ("
					+ (i + 1) + ") ---\n");
			System.out.println(field);
		}
	}

	int iterationMax;
	private Field field;
	private Pole pole;
	private Alcoman alcoman;
}
