import java.util.Collection;

public final class Validate {
    private Validate() {}

    public static <T> T requireNonNull(T obj, String name) {
        if (obj == null) throw new StreamValidationException(name + " must not be null");
        return obj;
    }

    public static void requireNonEmpty(Collection<?> c, String name) {
        if (c == null) throw new StreamValidationException(name + " must not be null");
        if (c.isEmpty()) throw new StreamValidationException(name + " must not be empty");
    }

    public static void requireNonNegative(int n, String name) {
        if (n < 0) throw new StreamValidationException(name + " must be >= 0 (was " + n + ")");
    }
}