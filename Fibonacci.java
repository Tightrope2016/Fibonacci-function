public class Fibonacci {

	//Fibonacci Recursive Method
	public static int fibonacciRe(int n) {
        if(n<=1)
        {
            return 1;
        }
        else {
            return fibonacciRe(n-1)+fibonacciRe(n-2);
        }
    }

	 //Fibonacci Iterative Method
    public static int fibonacciIt(int n) {
        if(n<=1)
        {
            return 1;
        }
        int r=0,p=1,pp=1,i;
        for(i=2;i<=n;i++)
        {
            r = p + pp;
            pp =p;
            p =r;
        }
        return r;
    }
	
	public static void main(String[] args) {
		int i, n=40, f1, f2;
        
		System.out.print("num\tIterative Time\tRecursive Time\n");
        
        long starttime,endtime;
        int difference,difference2;
        for(i=0;i<=n;i++) 
        { 
            starttime  = System.nanoTime();   
            f1 = fibonacciIt(i);                 
            endtime  = System.nanoTime();    
            difference  = (int)((endtime - starttime) / 1e6);     
            starttime = System.nanoTime();            
            f2 = fibonacciRe(i);         
            endtime = System.nanoTime();            
            difference2 = (int)((endtime - starttime) / 1e6);      
            System.out.print(i+"\t\t"+difference+"\t\t"+difference2 +"\t\n");          
        }
	}
}


