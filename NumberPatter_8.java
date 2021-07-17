// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
// 1 2 3 4 5 6 7 6 5 4 3 2 1

class Number8Patter{
    public static void main(String[] args) {
        for(int i=8;i>=1;i--){
            for(int j=8;j>=1;j--)
            System.out.print(j);
        }
        System.out.println(" ");
    }
}