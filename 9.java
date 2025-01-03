class Solution {
    public boolean isPalindrome(int x) {
       
        int rem=0;
        int org=x;
        
        for(; x>0;){
           int temp = x % 10;
            rem= rem*10 + temp;
            x= x / 10;
        }
       return org == rem;
    }
}
