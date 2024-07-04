class Computer{
    public void PlayMusic()
    {
        System.out.println("Music is playing ");

    }
    public String getMeAPen(int cost)
    {
        return "Pen";
    }
}
public class Java_Methods {
    public static void main(String[] args) 
    {
            Computer obj = new Computer();
            obj.PlayMusic();
            String str = obj.getMeAPen(10);
            System.out.println(str);
    }
    
}
