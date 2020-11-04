package com.LABS.lab3;

import java.util.*;

public class HugeText {
    String text = "Sometimes fate is like a small sandstorm that keeps changing directions." +
            " You change direction but the sandstorm chases you. You turn again, but the storm adjusts." +
            " Over and over you play this out, like some ominous dance with death just before dawn. Why?" +
            " Because this storm isn’t something that blew in from far away, something that has nothing" +
            " to do with you. This storm is you. Something inside of you. So all you can do is give in" +
            " to it, step right inside the storm, closing your eyes and plugging up your ears so the sand" +
            " doesn’t get in, and walk through it, step by step. There’s no sun there, no moon, no direction," +
            " no sense of time. Just fine white sand swirling up into the sky like pulverized bones. That’s the" +
            " kind of sandstorm you need to imagine.\n" +
            "And you really will have to make it through " +
            "that violent, metaphysical, symbolic storm. " +
            "No matter how metaphysical or symbolic it might be, make no mistake about it: it will cut " +
            "through flesh like a thousand razor blades. People will bleed there, and you will bleed too. " +
            "Hot, red blood. You’ll catch that blood in your hands, your own blood and the blood of others.\n" +
            "And once the storm is over you won’t remember " +
            "how you made it through, how you managed to " +
            "survive. You won’t even be sure, in fact, " +
            "whether the storm is really over. But one " +
            "thing is certain. When you come out of the " +
            "storm you won’t be the same person who walked " +
            "in. That’s what this storms all about.";
    public void getNumberOfWords (String text) {
        String delimiter = " ";
        String[] arrayOfWords = text.split(delimiter);
        System.out.println("Number of words is: " + arrayOfWords.length);
    }

    public void getNumberOfSentences (String text) {
        String delimiters = "[.?!]";
        String[] arrayOfSentences = text.split(delimiters);
        System.out.println("Number of sentences is: " + arrayOfSentences.length);
    }

    public void getLetters(String text) {
        int letters = 0;
        int vowels = 0;
        int consonants = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
            char ch = text.charAt(i);
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                letters++;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }

        }
        System.out.println("Number of letters is: " + letters);
        System.out.println("Number of vowels is: " + vowels);
        System.out.println("Number of consonants is: " + consonants);
    }

    public void getLongestWord (String text) {
        String formattedText = text.replaceAll("[,.?!:]", " ");
        String[] words = formattedText.split(" ");
        String longWord = " ";
        for (int i = 0; i < words.length-1; i++) {
            if (words[i].length() >= longWord.length()) {
                longWord = words[i];
            }
        }
        System.out.println("Longest word is: " + longWord);
    }


    public static void getFrequent(String text) {
        String formattedText = text.replaceAll("[,.?!:]", " ");
        formattedText = formattedText.trim().replaceAll("\\s{2,}", " ");
        String[] words = formattedText.split(" ");
        int k;
            Map<String, Integer> count = new HashMap();
            for (String word: words) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
            List<String> candidates = new ArrayList(count.keySet());
            Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                    w1.compareTo(w2) : count.get(w2) - count.get(w1));
            
            System.out.println("5 most frequent words: " + candidates.subList(0, 5));
    }

}
