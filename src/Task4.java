import java.util.stream.Stream;
import java.util.concurrent.atomic.AtomicLong;

public class RandomAlg {
    public RandomAlg withSeed(int seed) {
        this.seed = seed;
        x = new AtomicLong(seed);
        return this;
    }
}

public class Task4 {
    long a, c, m;
    private AtomicLong x;

    public Task4() {
        this.a = 12341234;
        this.m = 2 ^ 48;
    }



    public int next() {
        return (int) ((a * x.getAndIncrement()+c) % m);
    }

    public Stream<Long> randomNum() {
        Stream<Integer> iterate = Stream.iterate(55, (seed -> withSeed(seed)));
    }

}
