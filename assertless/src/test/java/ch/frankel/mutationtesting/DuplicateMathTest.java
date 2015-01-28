package ch.frankel.mutationtesting;

import org.testng.annotations.Test;

public class DuplicateMathTest {

    @Test
    public void should_return_sum_of_parameters() {
        DuplicateMath math = new DuplicateMath();
        int sum = math.add(1, 1);
    }
}
