public class maxNoPieces {

    public static int  maxCuts(int n, int a,int b,int c)
        {
            //Base cases
            if(n ==0)
                {
                    return 0;
                }
            if(n<0)
                {
                    return -1;
                }

            int res = Math.max(maxCuts(n-a,a,b,c),
                          Math.max(maxCuts(n-b,a,b,c),
                          maxCuts(n-c,a,b,c) ) );


//            int res = Math.max(maxCuts(n-a, a, b, c), Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));
            if(res == -1 )
                {
                    return -1;
                }
            else
                return res +1;
        }

    public static void main(String[] args) {

        System.out.println("The maximum possible no. of cuts of this rope would be  " +  maxCuts(10,1,1,1));
    }

}
