package org.acme;

import java.util.ArrayList;
import java.util.List;

public class Exemplu2 {

    public static void main(String[] args) {
        new C1<String>();
        new C2<Integer, String, Integer>();
        new C3<Number>();
        new C3<Integer>();
        new C3<>();

        C1<String> c1;  // String
        C1<Number> c2;  // Number

        C1<String> c4 = new C1<String>();
        C1<?> c3 = c4; // any
//        c3.x = "";
//        c4.x = "";

//       List<?> list = new ArrayList<>();
//       list.forEach(x -> System.out.println(x));

        C1<? extends Number> c5 = new C1<Integer>(); // Number, Integer, Double
//        c5.x = 10;

        C1<? super Integer> c6 = new C1<Integer>();
        c6.x = 10;

        Number n = 10;
        Object o = 10;
    }

    static class C1<T> {
        public T x;
    }

    static class C2<T,G,R> {

    }

    static class C3<T extends Number> {


    }
}
