package by.academy.homework5;
import java.util.*;

public class Task1 {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
