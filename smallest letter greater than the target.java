class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target < letters[mid]){
                e= mid -1;
            }else {
                s = mid+1;
            }
        }
        return letters[s % letters.length]; //wrap around condition where if there is no smallest no then return the first index when the pointer gets at the end of the array element
    }
}
