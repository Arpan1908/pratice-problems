class Solution {
    public int numberOfStep(int num) {
        return helper(num,0);
    }

     private static int helper(int n,int c){
       if(n==0){
           return c;
       }//base condition
       
       if(n%2==0){
           return helper(n/2,c+1);
       }
       return helper(n-1,c+1);
   }
}
