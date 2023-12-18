package com.fdmgroup.hangman;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameView gameView = new GameView();

		String word = gameView.randomWordSelector();
		// gameView.displayWordInDashes(word);
		gameView.GameLoop(word);


	}

}

