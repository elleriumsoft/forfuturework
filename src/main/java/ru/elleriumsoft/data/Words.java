package ru.elleriumsoft.data;

import java.util.ArrayList;
import java.util.List;

public class Words
{
    private List<String> data;

    public Words()
    {
        data = new ArrayList<String>();
    }

    public List<String> getData()
    {
        return data;
    }

    public void setData(List<String> data)
    {
        this.data = data;
    }

    public void addWord(String word)
    {
        data.add(word);
    }

    public String getWord(int index)
    {
        return data.get(index);
    }

    public List<String> getCopyData()
    {
        List<String> copy = new ArrayList<String>();
        for (String element : data)
        {
            copy.add(element);
        }
        return copy;
    }
}
