 class firstclass{
    public int add(int a , int b)
    {
        int r = a + b;
        return r;
    }
}

public class Java_Object {
    public static void main(String[] args) {
        int c = 6;
        int d = 5;

        firstclass fc = new firstclass();
        int reuslt = fc.add(c,d);
        System.out.println(reuslt);

    }
    
}
