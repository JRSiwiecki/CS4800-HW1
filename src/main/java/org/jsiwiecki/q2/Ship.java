package org.jsiwiecki.q2;

public class Ship
{
    private String name;
    private int yearBuilt;

    public Ship(String name, int yearBuilt)
    {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearBuilt()
    {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt)
    {
        this.yearBuilt = yearBuilt;
    }

    public void print()
    {
        System.out.println(name + " " + yearBuilt);
    }
}
