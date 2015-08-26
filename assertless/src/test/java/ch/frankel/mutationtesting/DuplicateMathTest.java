package ch.frankel.mutationtesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DuplicateMathTest {

    @Test
    public void should_return_sum_of_parameters() {
        DuplicateMath math = new DuplicateMath();
        int sum = math.add(1, 1);
        assertEquals(sum, 2);
    }
}
