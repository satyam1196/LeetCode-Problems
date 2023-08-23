class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            str.append((char)(rem+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        
        return str.reverse().toString();
    }
}