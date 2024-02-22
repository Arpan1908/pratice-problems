// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(check(a,5,0));
    }
    
    static boolean check(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || check(arr,target,i+1);
    }
}
