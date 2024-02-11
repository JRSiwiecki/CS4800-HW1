package org.jsiwiecki.q2;

public class CruiseShip extends Ship
{
    private int maximumPassengers;


    public CruiseShip(String name, String yearBuilt, int maximumPassengers)
    {
        super(name, yearBuilt);
        this.maximumPassengers = maximumPassengers;
    }

    public int getMaximumPassengers()
    {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers)
    {
        this.maximumPassengers = maximumPassengers;
    }

    @Override
    public void print()
    {
        System.out.println(getName() + " " + maximumPassengers);
    }
}
