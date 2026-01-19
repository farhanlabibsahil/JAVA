public class Demo {
    public static void main(String a[ ]) {
        int num[][] =new int [3][3] ;
        for(int i=0;i<3;i++){

        for (int j=0;j<3;j++)
        {
            num [i][j]= (int) (Math.random() *10); // math.random generates random doubles so we type casted it 
        }
        }
    for(

    int i = 0;i<3;i++)
    {
        for (int j = 0; j < 3; j++) {
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
}

}
