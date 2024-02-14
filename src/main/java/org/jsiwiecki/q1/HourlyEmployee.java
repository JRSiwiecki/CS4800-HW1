package org.jsiwiecki.q1;

public class HourlyEmployee extends Employee
{
    private int hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hourlyWage, int hoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWage()
    {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage)
    {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString()
    {
        return super.toString() + "$" + hourlyWage + " " + hoursWorked + " ";
    }
}
