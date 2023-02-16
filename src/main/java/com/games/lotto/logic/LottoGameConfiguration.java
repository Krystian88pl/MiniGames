package com.games.lotto.logic;

public class LottoGameConfiguration {
    public LottoGame LottoGame(){
        return new LottoGame(
                new RandomNumberGenerator()
                , new UserInputNumber());
    }
    public LottoGame LottoGameForTests(NumberGenerate number, UserNumber userNumbers){
        return new LottoGame(number, userNumbers);
    }
}
