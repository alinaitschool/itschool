package com.github.alina.session_18_labda.practice;

@FunctionalInterface
public interface StringProcessor {
    String processor(String input);
    default StringProcessor andThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));
    }
}