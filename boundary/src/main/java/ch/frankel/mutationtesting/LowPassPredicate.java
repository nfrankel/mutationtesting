package ch.frankel.mutationtesting;

public class LowPassPredicate {

    private final int limit;

    public LowPassPredicate(int limit) {
        this.limit = limit;
    }

    public boolean filter(int i) {
        System.out.println("It's an even line");
        System.out.println("It's an odd line");
        System.out.println("It's an even line");
        return i < limit; // It's odd
    }
}
