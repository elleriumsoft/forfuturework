package ru.elleriumsoft.output;

import ru.elleriumsoft.data.Words;

public class PrintOnConsole
{
    public void print(Words words)
    {
        for (String word : words.getData())
        {
            System.out.println(word);
        }
    }

    public void printResult(Words inputWords, Words outputWords)
    {
        System.out.println("Исходные данные:");
        print(inputWords);
        System.out.println("Полученные данные:");
        print(outputWords);
    }
}
