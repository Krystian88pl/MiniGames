package com.games.lotto.logic;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;

class RandomNumberGenerator implements NumberGenerate {

    public static final int STREAM_SIZE = 6;
    public static final int RANDOM_NUMBER_ORIGIN = 1;
    public static final int RANDOM_NUMBER_BOUND = 99;

    @Override
    public Set<Integer> generateRandomNumber() {
        return new SecureRandom().ints(STREAM_SIZE, RANDOM_NUMBER_ORIGIN, RANDOM_NUMBER_BOUND)
                .boxed()
                .collect(Collectors.toSet());

    }
}
