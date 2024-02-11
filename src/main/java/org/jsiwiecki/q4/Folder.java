package org.jsiwiecki.q4;

import java.util.ArrayList;

public class Folder
{
    private String name;
    private final ArrayList<File> files;
    private final ArrayList<Folder> subFolders;

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

    public void print()
    {
        System.out.println(name);

        for (Folder folder: subFolders)
        {
            folder.print();

            for (File file : folder.getFiles())
            {
                file.print();
            }
        }
    }

    public void deleteFolder(Folder folder)
    {
        if (subFolders.contains(folder)) {
            subFolders.remove(folder);
        } else {
            for (Folder subFolder : subFolders) {
                subFolder.deleteFolder(folder);
            }
        }
    }
}
