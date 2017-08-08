package ru.elleriumsoft.sorting;

import ru.elleriumsoft.data.Words;

import java.util.Collections;
import java.util.List;

public class SortingWords
{
    public Words sort(Words words)
    {
        List<String> list = words.getCopyData();

        Collections.sort(list, new ComparatorByLengthWords());
        Collections.sort(list, new ComparatorByAmountVowelLetters());

        Words output = new Words();
        output.setData(list);
        return output;
    }
}
