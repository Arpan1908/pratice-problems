class HelloWorld {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(check(a,0));
    }
    
    static boolean check(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && check(arr,i+1);
    }
}
