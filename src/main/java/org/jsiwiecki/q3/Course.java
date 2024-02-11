package org.jsiwiecki.q3;

import java.util.ArrayList;

public class Course
{
    private String name;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    public Course(String name)
    {
        this.name = name;
        this.instructors = new ArrayList<Instructor>();
        this.textbooks = new ArrayList<Textbook>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Instructor> getInstructors()
    {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors)
    {
        this.instructors = instructors;
    }

    public ArrayList<Textbook> getTextbooks()
    {
        return textbooks;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks)
    {
        this.textbooks = textbooks;
    }

    public void addInstructor(Instructor instructor)
    {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook)
    {
        textbooks.add(textbook);
    }

    public void print()
    {
        String instructorsString = "";

        for (Instructor instructor: instructors)
        {
            instructorsString += instructor.getLastName() + ", " + instructor.getFirstName() + " ";
        }

        String textbooksString = "";

        for (Textbook textbook : textbooks)
        {
            textbooksString += textbook.getTitle() + " by " + textbook.getAuthor() + " ";
        }

        System.out.println(name + " | " + instructorsString + "| " + textbooksString);
    }
}
