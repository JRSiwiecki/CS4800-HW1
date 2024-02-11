package org.jsiwiecki.q3;

public class Main
{
    public static void main(String[] args)
    {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert Martin", "A Publisher");

        Course cs4800 = new Course("CS 4800 - Software Engineering", nima, cleanCode);
        cs4800.print();
        cs4800 = null;

        System.out.println(cs4800);
        System.out.println(nima);
        System.out.println(cleanCode);

        Instructor yu = new Instructor("Yu", "Sun", "1-1111");
        Textbook designPatterns = new Textbook("Design Patterns", "Some Guys", "B Publisher");

        Course cs4990 = new Course("CS 4990 - Prompt Engineering", yu, designPatterns);
        cs4990.print();
        cs4990 = null;

        System.out.println(cs4990);
        System.out.println(yu);
        System.out.println(designPatterns);
    }
}
