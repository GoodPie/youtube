import java.io.*;

public class OOP
{

    /**
     * Entry point for Java Program
     */
    public static void main(String[] args)
    {
        // Using the default constructor
        Person p1 = new Person();
        System.out.println(p1.toString());
        
        // Using the alternate constructor
        Person p2 = new Person("Jack", 24);
        System.out.println(p2.toString());

        // Using the copy constructor
        Person p3 = new Person(p2);
        p3.birthday();
        System.out.println(p3.toString());

    }



}