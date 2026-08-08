//Problem Link: https://www.geeksforgeeks.org/problems/factorial-number2446/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

//Solution: 

class Solution {
    
    public boolean isFactorial(int ele) {
        int fact = 1;
        int temp = 1;
        while(fact < ele) {
            temp +=1;
            fact*=temp;
        }
        
        return (fact == ele);
    }
    
    public List<Integer> factorialNumbers(List<Integer> arr) {
        // code here
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.size();i++) {
            int ele = arr.get(i);
            if (isFactorial(ele)) {
                ans.add(ele);
            }
        }
        
        return ans;
    }
}
