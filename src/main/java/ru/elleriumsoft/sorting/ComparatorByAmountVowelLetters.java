package ru.elleriumsoft.sorting;

import java.util.Comparator;

public class ComparatorByAmountVowelLetters implements Comparator<String>
{
    private final static char[] VOWEL_RUSSIAN_LETTERS = {'А', 'Е', 'Ё', 'Э', 'Я', 'Ю', 'У', 'И', 'О', 'Ы'};

    public int compare(String o1, String o2)
    {
        int diff = sumVowel(o2) - sumVowel(o1);
        if (diff == 0 && o2.length() == o1.length())
        {
            diff = -1;
        }
        return diff;
    }

    private int sumVowel(String word)
    {
        int sum = 0;
        for (char letter : word.toUpperCase().toCharArray())
        {
            for (char vowelLetter : VOWEL_RUSSIAN_LETTERS)
            {
                if (vowelLetter == letter)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}