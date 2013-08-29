
public class Recursao {
	
	public int fatorial(int n){
		
		if (n == 0){
			return 1;
		}
		else{
			return n * fatorial(n - 1);
		}
		
	}
	
	public int fibo(int n){
		if ((n == 1) || (n == 2))
			return (n - 1);
		else
			return fibo(n - 1) + fibo(n - 2);
			
	}

}
