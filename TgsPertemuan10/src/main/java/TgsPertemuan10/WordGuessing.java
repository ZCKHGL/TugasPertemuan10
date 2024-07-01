/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TgsPertemuan10;

import java.util.Random;
/**
 *
 * @author A-12
 */
public class WordGuessing {

    WordGuessing(int i, String[] words) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class WordGuessingGame extends Game {

        private String[] words;

        public WordGuessingGame(int guessLimit, String[] words) {
            super(guessLimit);
            this.words = words;
        }

        @Override
        public void generateNumber() {
            Random random = new Random();
            int index = random.nextInt(words.length);
            secretNumber = index; // Memperlakukan indeks sebagai nomor acak
        }

        @Override
        public String checkGuess(int guess) {
            if (guess == secretNumber) {
                return "Benar! Anda menebak kata \"" + words[secretNumber] + "\"";
            } else if (guess > secretNumber) {
                return "Kata yang dicari ada di urutan alfabet yang lebih awal.";
            } else {
                return "Kata yang dicari ada di urutan alfabet yang lebih akhir.";
            }
        }
    }
}
