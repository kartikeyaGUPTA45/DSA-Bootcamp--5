public class Main {   
    public static int factorial(int n) {
        int ans = 1;
        for(int i=1;i<=n;i++) {
            ans*=i;
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    int n = 5;
	    int r = 2;
		System.out.println(calculateNCR(n,r));
	}
	
	public static int calculateNCR(int n, int r) {
        int nFac = factorial(n);
		int rFac = factorial(r);
		int nrFac = factorial(n-r);
		
		return (nFac/(rFac*nrFac));
    }
}
