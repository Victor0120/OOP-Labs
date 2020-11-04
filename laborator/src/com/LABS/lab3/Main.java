package com.LABS.lab3;

public class Main {

    public static void main(String[] args) {
        HugeText passage = new HugeText();

        //ex1
        passage.getNumberOfWords(passage.text);
        passage.getNumberOfSentences(passage.text);

        //ex2
        passage.getLetters(passage.text);

        //ex3
        passage.getLongestWord(passage.text);
        passage.getFrequent(passage.text);


    }
}