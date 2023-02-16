package com.games.lotto.logic;

import java.util.Set;

public class LottoGame {
    private final NumberGenerate numberGenerator;
    private final UserNumber numberReceiver;

    LottoGame(NumberGenerate numberGenerator, UserNumber numberReceiver) {
        this.numberGenerator = numberGenerator;
        this.numberReceiver = numberReceiver;
    }
    public String start(){
        Set<Integer> randomNumber = numberGenerator.generateRandomNumber();
        Set<Integer> inputNumber = numberReceiver.inputNumber();
        if(inputNumber.size() < 6){
            return "not 6 numbers";
        }
        System.out.println("The winning numberGenerator: " + randomNumber);
        System.out.println("You numberGenerator: " + inputNumber);

        inputNumber.retainAll(randomNumber);
        if(inputNumber.containsAll(randomNumber)){
            System.out.println("You won");
            return "You won";
        }
        else{
            System.out.println("You lost");
            return"you lost";
        }
    }
}
