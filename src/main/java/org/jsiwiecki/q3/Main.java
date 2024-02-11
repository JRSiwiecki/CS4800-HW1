package org.jsiwiecki.q3;

public class Main
{
    public static void main(String[] args)
    {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert Martin", "A Publisher");

        Course cs4800 = new Course("CS 4800 - Software Engineering");
        cs4800.addInstructor(nima);
        cs4800.addTextbook(cleanCode);
        cs4800.print();

        Instructor yu = new Instructor("Yu", "Sun", "1-1111");
        Textbook designPatterns = new Textbook("Design Patterns", "Some Guys", "B Publisher");

        Course cs4990 = new Course("CS 4990 - Prompt Engineering");
        cs4990.addInstructor(yu);
        cs4990.addTextbook(designPatterns);
        cs4990.print();

        cs4800.addTextbook(designPatterns);
        cs4800.addInstructor(yu);
        cs4800.print();
    }
}
