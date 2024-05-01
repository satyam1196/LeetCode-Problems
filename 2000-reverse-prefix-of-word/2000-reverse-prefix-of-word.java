class Solution {
     public String reversePrefix(String word, char ch) {
//           if(!word.contains(ch+"")){
//             return word;
//         }
//         Stack<Character> stack=new Stack<>();
//         StringBuilder str=new StringBuilder();
//         int index=0;
//         int n=word.length();
//         for(int i=0;i<n;i++){
//             if(word.charAt(i)==ch){
//                 stack.push(word.charAt(i));
//                 index=i;
//                 break;
//             }
//             else{
//                 stack.push(word.charAt(i));
//             }
//         }
//             while (!stack.isEmpty()){
//                 str.append(stack.pop());
//             }
//             if(index<n) {
//                 for (int i = index + 1; i < n; i++) {
//                     str.append(word.charAt(i));
//                 }
//             }
            
//             return str.toString();
         
         int j=word.indexOf(ch);
        if(j!=-1){
            return new StringBuilder(word.substring(0,j+1)).reverse().toString()+word.substring(j+1);
        }
        return word;
        
        
    }
}