class Star_38_Pattern 
{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
            
        }

        for (int x =3; x>=0; x-- )
            {
                for(int y =1 ;y<=x;y++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}
