package by.academy.homework7;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextLong(0, 100))
                .limit(100).map(x -> (x * Math.PI) - 20)
                .filter(x -> x < 100).sorted().skip(3)
                .collect(Collectors.toMap(x -> x, x -> "Number: " + x, (oldValue, newValue) -> newValue, TreeMap::new));

    }
}

