package com.games.lotto;

import com.games.lotto.logic.LottoGame;
import com.games.lotto.logic.LottoGameConfiguration;

public class App {
    public static void main(String[] args) {
        LottoGame lottoGame = new LottoGameConfiguration().LottoGame();
        lottoGame.start();
    }
}
