package org.example.capitulo3;

@FunctionalInterface
public interface Validator<T> {


    boolean valida(T t);



}
