// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int ans = sum(1902200);
        System.out.println(ans);
    }
    static int sum(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
