class Human{
    private int age;
    private String name;

    public Human()
    {
        System.out.println("Constructor");
        name = "Dipti";
        age = 21;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Default_Cons {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
    
}
