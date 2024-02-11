package org.jsiwiecki.q4;

import java.util.ArrayList;

public class Folder
{
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name)
    {
        this.name = name;
        files = new ArrayList<File>();
        subFolders = new ArrayList<Folder>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<File> getFiles()
    {
        return files;
    }


    public ArrayList<Folder> getSubFolders()
    {
        return subFolders;
    }

    public void addFile(File file)
    {
        files.add(file);
    }

    public void addFolder(Folder folder)
    {
        subFolders.add(folder);
    }

    public void setFiles(ArrayList<File> files)
    {
        this.files = files;
    }

    public void setSubFolders(ArrayList<Folder> subFolders)
    {
        this.subFolders = subFolders;
    }

    public void print()
    {
        for (Folder folder : subFolders)
        {
            System.out.print(name);

            for (File file : folder.getFiles())
            {
                System.out.print(file.getName());
            }

            System.out.println();
        }
    }


}
