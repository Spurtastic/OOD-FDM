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
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your guess: ");
            String input = scanner.nextLine().toUpperCase();

            // check if the letter is in the word and if it is repeated fill from the left
            Set <String> set = new HashSet<>();
            if (wordToGuess.contains(input)){
                set.add(input);
                // iterate through the word and check if the letter is in the word
                if (set.contains(input)){
                    System.out.println("Already guessed that");
                }
                
                for (int i = 0; i < wordToGuess.length(); i++) {
                    // if the letter is in the word replace the dash with the letter and fill if there are more than one
                    if (wordToGuess.charAt(i) == input.charAt(0)){
                        wordState = wordState.substring(0, i) + input + wordState.substring(i + 1);
                    }
                }
            }else if (!wordToGuess.contains(input)){
                lives--;
            }
            if (wordState.equals(wordToGuess)){
                System.out.println("The word now looks like this: "+wordToGuess);
                System.out.println("You win!");
                break;
            }
            if (lives == 0){
                System.out.println("You lose!");
                break;
            }


        }
    }




}
