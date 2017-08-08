package ru.elleriumsoft.sorting;

import java.util.Comparator;

public class ComparatorByLengthWords implements Comparator<String>
{
    public int compare(String o1, String o2)
    {
        return o2.length() - o1.length();
    }
}
