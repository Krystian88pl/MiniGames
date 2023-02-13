package com.games.lotto.Model;

import logic.RandomNumberGenerator;
import userInput.UserInputNumber;

public class App {
    public static void main(String[] args) {
        LottoGame lot = new LottoGame(new RandomNumberGenerator(), new UserInputNumber());
        lot.start();
    }
}
