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
public class Main {

    public static void main(String[] args) {
// Contoh Game Tebak Angka
        NumberGuessing numberGame;
        numberGame = new NumberGuessing(7);
        numberGame.play();
// Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessing wordGame = new WordGuessing(5, words);
        wordGame.play();
    }
}
