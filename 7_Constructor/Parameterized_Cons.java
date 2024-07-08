class Human{
    private int age;
    private String name;

    public Human(int a , String n)
    {
        System.out.println("Constructor");
        age = a;
        name = n;
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

public class Parameterized_Cons {
    public static void main(String[] args) {
        Human obj = new Human(21, "Dipti");
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}
