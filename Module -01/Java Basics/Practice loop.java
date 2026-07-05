import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
// 		int n = scn.nextInt();
        int start = scn.nextInt();
        int end = scn.nextInt();
		
// // 		for(int i=1;i<=n;i++) {
// // 		    System.out.println(i);
// // 		}

//         int i=1;
//         while(i<=n) {
//             System.out.println(i);
//             i++;
//         }

//         for(int i=1;i<=n;i++) {
// 		    if (i%2 == 0) {
// 		        System.out.println(i);
// 		    }
// 		}

//         for(int i=2;i<=n;i+=2) {
// 		    System.out.println(i);
// 		}

        // int i=2;
        // while(i<=n) {
        //     System.out.println(i);
        //     i+=2;
        // }
        
        // int ans = 1;
        // // for(int i=1;i<=n;i++) {
        // //     ans*=i;
        // // }
        
        // int i=1;
        // while(i<=n) {
        //     ans*=i;
        //     i+=1;
        // }
        
        // System.out.println(ans);
        
        int sum = 0;
        // for(int i=start;i<=end;i++) {
        //     sum+=i;
        // }
        int i=start;
        while(i<=end) {
            sum+=i;
            i+=1;
        }
        
        System.out.println(sum);
        
		
	}
}
