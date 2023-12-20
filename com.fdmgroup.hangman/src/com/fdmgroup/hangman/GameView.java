package com.fdmgroup.hangman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GameView {

    private ArrayList<String> hiddenWords = new ArrayList<String>();

    public GameView() {
        hiddenWords.add("BELLS");
        hiddenWords.add("WHISTLES");
        hiddenWords.add("POPPERS");
        hiddenWords.add("FUZZERS");
        hiddenWords.add("BANGERS");
        hiddenWords.add("CRACKERS");
        hiddenWords.add("SPARKLERS");
        hiddenWords.add("ROCKETS");
        hiddenWords.add("BOMBS");
        hiddenWords.add("SPINNERS");
        hiddenWords.add("FIRECRACKERS");

    }

    public void welcomeHangman(){
        System.out.println("Welcome to Hangman!");
    }

    public String randomWordSelector(){
        Random random = new Random();
        int randomWord = random.nextInt(this.hiddenWords.size());
        // System.out.println(hiddenWords.get(randomWord));
        return hiddenWords.get(randomWord);
    }

    public String displayWordInDashes(String wordToGuess){
        String output = "";
        for (int i = 0; i < wordToGuess.length(); i++) {
            output += "_";
        }
        return output;
    }

    public void GameLoop(String wordToGuess){
        int lives = 8;
        String wordState = displayWordInDashes(wordToGuess);
        System.out.println("Welcome to Hangman!");
        while (lives >= 0) {
            System.out.println("The word now looks like this: "+wordState);
            System.out.printf("You have %s guesses left.\n", lives);
            // get input from user
            Scanner scanner = new Scanner(System.in);S
                break;
            }


        }
    }




}
