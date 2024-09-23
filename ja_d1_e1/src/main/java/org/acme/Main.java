import java.util.function.Predicate;

void main() {
    // lambda
    // basic lambda definition

    Predicate<String> p1 = x -> true;

    Predicate<String> p2 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return true;
        }
    };

    /**
     *
     * Predicate<T>         x -> boolean
     * BiPredicate<T,G>     (x,y) -> boolean
     * Consumer<T>          x -> void
     * BiConsumer<T,G>      (x,y) -> void
     * Function<T,G>        x -> y
     * BiFunction<T,G,V>    (x,y) -> z
     * UnaryOperator<T>     x -> y
     * BinaryOperator<T,G>  (x,y) -> z
     * Supplier<T>          () -> x
     */


}
