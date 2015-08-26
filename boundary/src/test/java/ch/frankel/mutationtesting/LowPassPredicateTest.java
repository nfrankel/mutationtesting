package ch.frankel.mutationtesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LowPassPredicateTest {

    private static final int LIMIT = 5;
    private LowPassPredicate predicate;

    @BeforeEach
    public void setUp() {
        predicate = new LowPassPredicate(LIMIT);
    }

    @Test
    public void should_return_true_when_under_limit() {
        boolean result = predicate.filter(LIMIT - 1);
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_under_limit() {
        boolean result = predicate.filter(LIMIT + 1);
        assertFalse(result);
    }

    @Test
    public void should_return_false_when_equals_limit() {
        boolean result = predicate.filter(LIMIT);
        assertFalse(result);
    }
}
