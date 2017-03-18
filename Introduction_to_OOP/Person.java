public class Person
{

    private String name;
    private int age;

    /**
     * NOTE:
     * The constructors are completely optional and you should use what is
     * required for your class. A class might not need a default constructor
     * or a copy constructor.
     */

    /**
     * Default Constructor
     * Creates a new object (this) with default values
     */
    public Person()
    {
        this.name = "name";
        this.age = 0;
    }

    /**
     * Alternate Constructor
     * Creates a new object (this) with the variables passed in
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /**
     * Copy Constructor
     * Copies one object to another object (this)
     */
    public Person(Person p)
    {
        this.name = p.getName();
        this.age = p.getAge();
    }

    /**
     * Example of a normal getter
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Example of another getter
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * Example of a normal setter
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Setter being used to validate parameter
     */
    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
    }

    
    /**
     *  Example of another function that is not a getter or setter 
     */
    public void birthday()
    {
        this.age += 1;
    }

    /**
     * Common function found in a lot of classes to give descriptions of the
     * current classes state
     */
    public String toString()
    {
        return "Person:{name: " + this.name + ", age: " + this.age + "}";
    }

}