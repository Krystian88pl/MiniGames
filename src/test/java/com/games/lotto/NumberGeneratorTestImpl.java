package com.games.lotto;

import com.games.lotto.logic.NumberGenerate;
import com.games.lotto.logic.UserNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberGeneratorTestImpl implements NumberGenerate, UserNumber {
    HashSet<Integer> integers;

    public NumberGeneratorTestImpl(HashSet<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public Set<Integer> generateRandomNumber() {
        return new HashSet<>(integers);
    }

    @Override
    public Set<Integer> inputNumber() {
        return new HashSet<>(integers);
    }
}
