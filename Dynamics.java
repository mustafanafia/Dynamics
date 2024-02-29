



public class Dynamics { 
    
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(DeFib(5));
        System.out.println(recBinomial(7,3));
        System.out.println(DPbinomial(7,3));
    }
    
    
    
    public static long fib(long index) {
        System.out.println("Fib ("+index+")");
    if (index == 0) // Base case
      return 0;
    else if (index == 1) // Base case
      return 1;
    else  // Reduction and recursive calls
      return fib(index - 1) + fib(index - 2);
  }

    
    
    public static int DeFib(long N) {
        System.out.println("DeFib ("+N+")");
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        if(N==0) { 
            return f0;
        }
        if(N==1) { 
            return f1;
        }
        if(N==1) { 
            return f2;
        }
        
        for (int i = 3; i <= N; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }
    
    public static int recBinomial(int N,int K) {
        System.out.println("Recursive binomial: N= " + N +"K= " + K);
        if ((K==0)||(K==N)) { 
            return 1;
        }
        else { 
            return recBinomial(N-1,K-1) + recBinomial(N-1, K);
        }
    }
    
    public static int DPbinomial(int n, int k) {
        System.out.println("Dynamic: N= "+n+" K= "+k);
        int c[][] = new int [n+1][k+1];
        int i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=Math.min(i,k);j++){
                if((j==0)||(j==i))
                c[i][j] = 1;
                
                else
                c[i][j] = c[i-1][j-1]+c[i-1][j];
            }
        }
        return c[n][k];
    }
}

            
    
    

