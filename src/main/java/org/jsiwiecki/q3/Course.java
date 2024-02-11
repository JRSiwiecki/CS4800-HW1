package org.jsiwiecki.q3;

public class Course
{
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook)
    {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Instructor getInstructor()
    {
        return instructor;
    }

    public void setInstructor(Instructor instructor)
    {
        this.instructor = instructor;
    }

    public Textbook getTextbook()
    {
        return textbook;
    }

    public void setTextbook(Textbook textbook)
    {
        this.textbook = textbook;
    }

    public void print()
    {
        System.out.println(name + " " + instructor.getFirstName() + " " + instructor.getLastName() + " " + textbook.getTitle() + " "
        + textbook.getAuthor());
    }
}
