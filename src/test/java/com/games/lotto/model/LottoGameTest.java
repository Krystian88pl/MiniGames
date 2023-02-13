package com.games.lotto.model;

import com.games.lotto.Model.LottoGame;
import com.games.lotto.Model.NumberGenerate;
import com.games.lotto.Model.UserNumber;
import logic.RandomNumberGenerator;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import userInput.UserInputNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class LottoGameTest {

    @Test()
    void start() {
        //given
        NumberGenerate numberGenerate = mock(NumberGenerate.class);
        UserNumber userNumber = mock(UserNumber.class);

        Set<Integer> randNumber = new HashSet<>(Arrays.asList(5,67,45,2,34,7));
        Set<Integer> inputNumber = new HashSet<>(Arrays.asList(6,67,47,3,35,9));

        Mockito.when(numberGenerate.generateRandomNumber()).thenReturn(randNumber);
        Mockito.when(userNumber.inputNumber()).thenReturn(inputNumber);

        LottoGame lottoGame = new LottoGame(numberGenerate, userNumber);

        //when
        lottoGame.start();

        //then
        verify(numberGenerate).generateRandomNumber();
    }
}