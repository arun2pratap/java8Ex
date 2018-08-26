package com.example.intf.method.sam;

@FunctionalInterface
public interface FunctionInterface<T,R> {
    R apply(T t);
}
