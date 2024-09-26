package org.acme;

public class Exemplu2 {

    public static void main(String[] args) {

        String tb1 = """
                SELECT * FROM product p
                WHERE p.price < 10 AND p. price > 0
                GROUP BY p.kind
                """;

        String tb2 = """
                SELECT p FROM Product p
                WHERE p.price < 10 AND p. price > 0
                """;

        // @DisplayName
        String tb3 = """
                Given that ....
                Then we expect ....
                And ....
                And ....
                """;
    }
}
