// Pattern programs in java : Pattern 6

// 7 6 5 4 3 2 1
// 6 5 4 3 2 1
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1

class NumberPattern_6
{
    public static void main(String[] args){
        for(int i=7;i>0;i--)
        {
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println(" ");

        }
    }    
}
