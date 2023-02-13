package logic;

import com.games.lotto.Model.NumberGenerate;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomNumberGenerator implements NumberGenerate {

    @Override
    public Set generateRandomNumber() {
        Set<Integer> randNumber = new SecureRandom().ints(6,1,99)
                .boxed()
                .collect(Collectors.toSet());
        return randNumber;

    }
}
