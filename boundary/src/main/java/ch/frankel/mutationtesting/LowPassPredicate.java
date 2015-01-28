package ch.frankel.mutationtesting;

public class LowPassPredicate {

    private final int limit;

    public LowPassPredicate(int limit) {
        this.limit = limit;
    }

    public boolean filter(int i) {
        return i < limit;
    }
}
