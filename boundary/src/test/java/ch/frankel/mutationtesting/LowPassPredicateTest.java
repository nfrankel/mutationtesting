package ch.frankel.mutationtesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LowPassPredicateTest {

    private static final int LIMIT = 5;
    private LowPassPredicate predicate;

    @BeforeMethod
    protected void setUp() {
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
