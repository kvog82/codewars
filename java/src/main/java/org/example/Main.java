package org.example;

import org.example.stringIncrementer.StringIncrementer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Codewars practice project!");

        StringIncrementer stringIncrementer = new StringIncrementer();
        System.out.println("stringIncrementer.incrementString(\"foobar000\") = " + stringIncrementer.incrementString("foobar000"));
    }
}