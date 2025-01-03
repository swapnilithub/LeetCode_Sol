class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str1 = Integer.toString(x); 
        String rev = new StringBuilder(str1).reverse().toString();
        if(rev.equals(str1)) {
            return true;
        }
        else return false;
    }
}
