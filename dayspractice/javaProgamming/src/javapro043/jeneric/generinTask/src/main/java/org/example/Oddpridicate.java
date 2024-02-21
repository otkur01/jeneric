package org.example;


    public class Oddpridicate implements UnaryPredicate<Integer> {

        @Override
        public boolean test(Integer obj) {
            return obj%2!=0;
        }
    }

