class HelloWorld {
    public static void main(String[] args) {
        int[] a = {1,3,5,5,6};
        //
        ArrayList<Integer> ans = find(a,5,0,new ArrayList<>());
        System.out.println(ans); 
    }
    
    static ArrayList<Integer> find(int[]arr,int t,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==t){
            list.add(i);
        }
        return find(arr,t,i+1,list);
    }
}
