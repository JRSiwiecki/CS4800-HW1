package org.jsiwiecki.q1;

public class Main
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[7];

        employees[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        employees[1] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        employees[2] = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        employees[3] = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50_000);
        employees[4] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        employees[5] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        employees[6] = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40_000);

        for (Employee employee: employees)
        {
            System.out.println(employee);
        }
    }
}
