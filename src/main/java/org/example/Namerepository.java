package org.example;
import java.util.Arrays;

public class Namerepository {
    private static String[] names;

    public static int getSize(){
        if(names==null)
        {
            return 0;
        }
    return names.length;
    }
    public static void setNames(String[] newNames)
    {
        names = Arrays.copyOf(newNames, newNames.length);
    }
    public static void clear()
    {
        names=null;
    }
    public static String[] findAll()
    {
        if(names==null)
        {
            return new String[0];
        }
        return Arrays.copyOf(names, names.length);
    }

}
