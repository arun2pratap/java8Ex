package com.criteria;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteria {

    public static final String START_WITHJAVA = "startWithjava";
    private final Map<String, Predicate<String>> predicateMap = new HashMap<>();

    private SearchCriteria(){
        initiateCriteria();
    }

    private void initiateCriteria() {
        Predicate<String> startWithjava = p -> p.startsWith("java");
        predicateMap.put(START_WITHJAVA, startWithjava);
    }

    public Predicate<String> getCriteria(String criteria){
        return predicateMap.get(criteria);
    }

    public static SearchCriteria getInstance(){
        return new SearchCriteria();
    }
}
