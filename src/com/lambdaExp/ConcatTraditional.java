package com.lambdaExp;

public class ConcatTraditional implements ConcatenateInterface {
    @Override
    public String sconcat(String s1, String s2) {
        return s1 + " " + s2 ;
    }

    public static void main(String[] args) {
        ConcatTraditional concatTraditional = new ConcatTraditional();
        System.out.println(concatTraditional.sconcat("Ganesh", "Kumar"));
    }
}
