package com.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public void tryPredicate(String s1, Predicate<String> predicate){
        if(predicate.test(s1)){
            System.out.println("String: " + s1);
        }else {
            System.out.println("False condition");
        }
    }
}
