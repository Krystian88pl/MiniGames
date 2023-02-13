package com.games.lotto.Model;

import java.util.Set;

public class LottoGame {
    private final NumberGenerate number;
    private final UserNumber userNumbers;

    public LottoGame(NumberGenerate number, UserNumber userNumbers) {
        this.number = number;
        this.userNumbers = userNumbers;
    }
    public void start(){
        Set<Integer> randomNumber = number.generateRandomNumber();
        Set<Integer> inputNumber = userNumbers.inputNumber();
        System.out.println("The winning number: " + randomNumber);
        System.out.println("You number: " + inputNumber);

        inputNumber.retainAll(randomNumber);
        if(inputNumber.containsAll(randomNumber)){
            System.out.println("You won");
        }
        else{
            System.out.println("you lost");
        }
    }
}
