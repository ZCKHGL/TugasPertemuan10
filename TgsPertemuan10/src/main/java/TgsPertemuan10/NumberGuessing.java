/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TgsPertemuan10;

import TgsPertemuan10.Game;

import java.util.Random;
/**
 *
 * @author A-12
 */
public class NumberGuessing {

    NumberGuessing(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class NumberGuessingGame extends Game {

        public NumberGuessingGame(int guessLimit) {
            super(guessLimit);
        }

        @Override
        public void play() {
            super.play(); // Memanggil metode dari kelas base
            System.out.println("Terima kasih sudah bermain!");
        }
    }
}
