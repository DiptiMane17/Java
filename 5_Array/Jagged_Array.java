public class Jagged_Array {
    public static void main(String[] args) {
        int nums[][] = new int [2][];

        nums[0]= new int[2];
        nums[1] = new int[3];

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length; j++)
            {
                nums[i][j] = (int)(Math.random()*100);
            }
        }

        for(int n[] : nums)
        {
            for(int m :n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
