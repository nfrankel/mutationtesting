package ch.frankel.mutationtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateMathTest {

    @Test
    public void should_return_sum_of_parameters() {
        DuplicateMath math = new DuplicateMath();
        int sum = math.add(1, 1);
        assertEquals(sum, 2);
    }
}
