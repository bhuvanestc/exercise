package org.example;
import java.util.Arrays;
public class Namerepository {
    public static void main(String[] args)
    {
        String[] names = {"Erik Andersson","Anna Gustavsberg","Olga Johnsson","Hanna Paul"};
        Namerepository.setNames(names);

        int size = Namerepository.getSize();
        System.out.println("Number of names:"+size);

        String fullName = "Anna Gustavsberg";
        String foundName = Namerepository.find(fullName);
        System.out.println("Namefound :" + foundName);

        String FullName_added = "Olga Johnsson";
        boolean nametoAdd =Namerepository.add(FullName_added);
        if (nametoAdd)
        {
            System.out.println(FullName_added +" added");
        }
        else
        {
            System.out.println(FullName_added +" already exists");
        }

        String firstName = "Erik";
        String [] namesByFirstName = Namerepository.findByfirstName(firstName);
        for (String name: namesByFirstName)
        {
            System.out.println("FirstName:"+name);
        }

        String lastName = "Paul";
        String [] namesByLastName = Namerepository.findBylastName(lastName);
        for (String name: namesByLastName)
        {
            System.out.println("LastName: "+name);
        }

        String givenName = "Erik Andersson";
        String updatedName = "Erik Svensson";
        boolean tobeUpdated = Namerepository.update(givenName, updatedName);
        if (tobeUpdated)
        {
            System.out.println("Updated Name:" + updatedName);
        }else
        {
            System.out.println("Unable to update = " + givenName);
        }

        String NametobeRemoved = "Olga Johnsson";
        boolean isRemoved = Namerepository.remove(NametobeRemoved);
        if (isRemoved)
        {
            System.out.println(NametobeRemoved+" is removed");
        }
        else
        {
            System.out.println(NametobeRemoved+"Could not be removed");
        }

        String[] Nameslist = Namerepository.findAll();
        System.out.println("Names list");
        for (String name : Nameslist)
        {
            System.out.println(name);
        }
    }
    private static String[] names;

    public static int getSize() {
        if (names == null) {
            return 0;
        }
        return names.length;
    }

    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
    }

    public static void clear() {
        names = null;
    }

    public static String[] findAll() {
        if (names == null) {
            return new String[0];
        }
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {

        if (names == null) {
            return null;
        }
        for (String name : names) {
            if (fullName.equals(name)) {
                return name;
            }

        }
        return null;
    }

    public static boolean add(final String fullName) {
        if (names == null) {
            names = new String[1];
            names[0] = fullName;
            return true;
        }
        for (String name : names) {
            if (fullName.equals(name)) {
                return false;
            }
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[newNames.length - 1] = fullName;
        names = newNames;
        return true;
    }


    public static String[] findByfirstName(final String firstName)
    {
        {
            if (names == null) {
                return new String[0];
            }
            String[] result = new String[names.length];
            int count = 0;

            for (String name : names) {
                if (name.startsWith(firstName + " ")) {
                    result[count++] = name;
                }
            }
            return Arrays.copyOf(result, count);
        }

    }
    public static String[] findBylastName(final String lastName)
    {
        {
            if (names == null) {
                return new String[0];
            }
            String[] result = new String[names.length];
            int count = 0;

            for (String name : names) {
                if (name.endsWith( " "+lastName)) {
                    result[count++] = name;
                }
            }
            return Arrays.copyOf(result, count);
        }
    }
    public static boolean update(final String original, final String upDatedName)
    {
        if (names == null)
        {
            return false;
        }
        int index = -1;
        boolean nameExists = false;
        for (int i=0; i< names.length; i++)
        {
            if(original.equals(names[i]))
            {
                index=i;
            }
            if(upDatedName.equals(names[i]))
            {
                nameExists = true;
            }
        }
        if(index == -1)
        {
            return false;
        }
        if(nameExists)
        {
            return false;
        }
        names[index]= upDatedName;
        return true;
    }
    public static boolean remove(final String fullName)
    {
        if(names==null)
        {
            return false;
        }
        int index=-1;
        for (int i=0; i< names.length;i++)
        {
            if(fullName.equals(names[i]))
            {
                index=i;
                break;
            }
        }
        if(index == -1)
        {
            return false;
        }
        String[] newNames = new String[names.length-1];
        System.arraycopy(names,0,newNames,0,index);
        System.arraycopy(names, index+1,newNames,index,names.length-index-1);
        names = newNames;
        return true;
    }

}
