package ru.elleriumsoft;

import ru.elleriumsoft.data.InputWords;
import ru.elleriumsoft.data.Words;
import ru.elleriumsoft.output.PrintOnConsole;
import ru.elleriumsoft.sorting.SortingWords;

public class App
{
    public static void main( String[] args )
    {
        Words inputWords = new InputWords().createDataFromInputArguments(args);

        Words outputWords = new SortingWords().sort(inputWords);

        new PrintOnConsole().printResult(inputWords, outputWords);
    }
}
