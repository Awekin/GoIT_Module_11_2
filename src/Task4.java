import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class Task4 {
    private final long a = 25214903917L;
    private final long c = 11L;
    private final long m = 2 ^ 48;

    private AtomicLong x = new AtomicLong(0);

    public Task4 withSeed(long seed) {
        x.set(seed);
        return this;
    }

    public long next() {
        long current = x.get();
        long next = (a * current + c) % m;
        x.set(next);
        return next;
    }
}