public class Main
{
	public static void main(String[] args) {
		int n = 7;
		int nsp = n/2;
		int nst = 1;
		for(int i=1;i<=n;i++) {
		    for(int j=1;j<=nsp;j++) {
		        System.out.print(" ");
		    }
		    
		    for(int j=1;j<=nst;j++) {
		        System.out.print("*");
		    }
		    
		    if (i <= n/2) {
		        nsp-=1;
		        nst+=2;
		    } else {
		        nsp+=1;
		        nst-=2;
		    }
		    System.out.println();
		}
	}
}
