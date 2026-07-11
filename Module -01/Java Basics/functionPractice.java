public class Main {   
    public static int factorial(int n) {
        int ans = 1;
        for(int i=1;i<=n;i++) {
            ans*=i;
        }
        return ans;
    }
    
    public static String printName() {
        return "abc";
    }
    
    public static void printNameVoid() {
        System.out.println("xyz");
    }
    
	public static void main(String[] args) {
	   // System.out.println(printName());
	   //printNameVoid();
	   //int num = 12345;
	   //System.out.println(sumOfDigits(num));
	   
	   //int num = 15;
	   //printFactors(num);
	   
	   //System.out.println(isPrime(13));
	   System.out.println(checkCharacter('P'));
	}
	
	public static String checkCharacter(char ch) {
	    if ((ch >= 'a' && ch<='z') || (ch >= 'A' && ch <= 'Z')) {
	        return "Alphabet";
	    } else if (ch >= '0' && ch <= '9') {
	        return "Digit";
	    } else {
	        return "Symbol";
	    }
	    
	}
	
	public static String reverseString(String str) {
	    String ans = "";
	    for(int i=str.length()-1;i>=0;i--) {
	        ans += str.charAt(i);
	    }
	    
	    return ans;
	}
	
	public static boolean isPrime(int num) {
	    int cnt = 0;
	     for(int i=1;i<=num;i++) {
	        if (num%i == 0) {
	            cnt+=1;
	        }
	    }
	    
	    return (cnt == 2);
	}
	
	public static void printFactors(int num) {
	    for(int i=1;i<=num;i++) {
	        if (num%i == 0) {
	            System.out.println(i);
	        }
	    }
	}
	
	public static int sumOfDigits(int num) {
	    int sum = 0;
	    while(num > 0) {
	        int rem = num%10;
	        sum+=rem;
	        num/=10;
	    }
	    
	    return sum;
	}
	
	public static int calculateNCR(int n, int r) {
        int nFac = factorial(n);
		int rFac = factorial(r);
		int nrFac = factorial(n-r);
		
		return (nFac/(rFac*nrFac));
    }
}
