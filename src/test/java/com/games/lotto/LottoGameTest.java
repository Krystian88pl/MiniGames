package com.games.lotto;

import com.games.lotto.logic.LottoGame;
import com.games.lotto.logic.LottoGameConfiguration;
import com.games.lotto.logic.NumberGenerate;
import com.games.lotto.logic.UserNumber;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.HashSet;

class LottoGameTest {

    @Test()
    void should_return_lotto_game_result() {
        //given
        HashSet<Integer> randNumber = new HashSet<>(Arrays.asList(6, 67, 47, 3, 35, 5));
        NumberGenerate numberGenerate = new NumberGeneratorTestImpl(randNumber);

        HashSet<Integer> userInput = new HashSet<>(Arrays.asList(6, 67, 47, 3, 35, 5));
        UserNumber userGenerate = new NumberGeneratorTestImpl(userInput);

        LottoGame lottoGame =  new LottoGameConfiguration().LottoGameForTests(numberGenerate,userGenerate);

        //when
        String result = lottoGame.start();

        //then
        assertThat(result).isEqualTo("You won");
    }

    @Test()
    void should_return_lotto_game_usr_not_give_six_numbers_result() {
        //given
        HashSet<Integer> randNumber = new HashSet<>(Arrays.asList(6, 67, 47, 3, 35, 5));
        NumberGenerate numberGenerate = new NumberGeneratorTestImpl(randNumber);

        HashSet<Integer> userInput = new HashSet<>(Arrays.asList(6, 67, 47, 3, 35));
        UserNumber userGenerate = new NumberGeneratorTestImpl(userInput);

        LottoGame lottoGame =  new LottoGameConfiguration().LottoGameForTests(numberGenerate,userGenerate);

        //when
        String result = lottoGame.start();

        //then
        assertThat(result).isEqualTo("Not 6 numbers");
    }
}