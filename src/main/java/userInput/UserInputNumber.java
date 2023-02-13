package userInput;

import com.games.lotto.Model.UserNumber;

import java.util.*;

public class UserInputNumber implements UserNumber {

    @Override
    public Set inputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 6 numbers between 1 and 99");
        Set<Integer> inputNum = new HashSet<>();

        for(int i = 0; i < 6; i++){
            System.out.println("The numbers you have chosen are: " + inputNum);
            System.out.println("Enter a number beetween 1 - 99: ");
            while(true){
                try {
                    String numberString = scan.nextLine();
                    int number = Integer.parseInt(numberString);
                    if (number >= 1 && number <= 99) {
                        inputNum.add(number);
                        break;
                    } else {
                        System.out.println(number + "is not beetween 1 and 49, Please try again");
                    }
                }catch (NumberFormatException nfe){
                    System.out.println("Hey, that's not even a number. Please try again ");
                }
            }
        }return  inputNum;
    }
}