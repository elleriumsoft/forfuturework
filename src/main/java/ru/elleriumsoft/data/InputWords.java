package ru.elleriumsoft.data;

public class InputWords
{
    private boolean checkCorrectnessEnteredArguments(String[] args)
    {
        if (args.length == 0)
        {
            return false;
        }

        int numberArguments = 0;
        try
        {
            numberArguments = Integer.valueOf(args[0]);
        }
        catch (NumberFormatException e)
        {
            return false;
        }

        if (numberArguments != args.length - 1)
        {
            return false;
        }

        return true;
    }

    public Words createDataFromInputArguments(String[] args)
    {
        if (!checkCorrectnessEnteredArguments(args))
        {
            System.out.println("Ошибка в аргументах!");
            System.exit(0);
        }

        Words words = new Words();
        for (int i = 1; i < args.length; i++)
        {
            words.addWord(args[i]);
        }

        return words;
    }
}
