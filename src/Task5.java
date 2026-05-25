import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static <E> Stream<E> zip(Stream<E> first, Stream<E> second) {
        Iterator<E> it1 = first.iterator();
        Iterator<E> it2 = second.iterator();
        Stream.Builder<E> builder = Stream.builder();

        while(it1.hasNext() && it2.hasNext()) {
            builder.add(it1.next());
            builder.add(it2.next());
        }

        return builder.build();

    }
}
