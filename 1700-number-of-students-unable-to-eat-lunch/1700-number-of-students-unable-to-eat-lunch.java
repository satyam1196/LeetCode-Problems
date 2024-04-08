class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       int[] count=new int[2];

        for(int num:students){
            count[num]++;
        }

        int rem=sandwiches.length;

        for(int sand:sandwiches){
            if(count[sand]==0){
                break;
            }
            if(rem--==0){
                break;
            }
            count[sand]--;
        }

        return rem;  
    }
}