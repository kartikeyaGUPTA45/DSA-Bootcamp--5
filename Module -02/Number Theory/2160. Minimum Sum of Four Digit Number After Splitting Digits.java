class Solution {
    public int minimumSum(int num) {
        int arr[]= new int[4];
        int i=0;
        while(num > 0) {
            int rem = num%10;
            arr[i] = rem;
            i++;
            num/=10;
        }

        Arrays.sort(arr);

        int n1 = arr[0]*10 + arr[2];
        int n2 = arr[1]*10 + arr[3];

        return n1 + n2;
    }
}
