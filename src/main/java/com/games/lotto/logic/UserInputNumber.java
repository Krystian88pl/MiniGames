package com.games.lotto.logic;

import com.games.lotto.logic.UserNumber;

import java.util.*;

class UserInputNumber implements UserNumber {

    public static final int MINIMAL_NUMBER_FROM_USER = 0;

    @Override
    public Set<Integer> inputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 6 numbers between 1 and 49");
        Set<Integer> inputNum = new HashSet<>();

        while (inputNum.size() <6) {
            try {
                String numberString = scan.nextLine();
                int number = Integer.parseInt(numberString);
                if (number >= 1 && number <= 49) {
                    inputNum.add(number);
                } else {
                    System.out.println(number + "is not beetween 1 and 49, Please try again");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Hey, that's not even a number. Please try again ");
            }
        }
        return inputNum;
    }
}