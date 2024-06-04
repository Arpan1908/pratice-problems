class Solution {
    public void setZeroes(int[][] arr) {
      //taking two arrays to keep a track and marking them one if any col or row encountered a zero
        int[] row = new int[arr.length]; 
        int[] col = new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i] = 1; 
                    col[j] = 1;
                }
            }
        }
      // converting the elements to zero which are having one to zeroes based on the two extra arrays that are being used 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j] = 0;
                }
            }
        }
    }
}
