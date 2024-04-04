class Solution {
    public int maxDepth(String s) {
//         Stack<Character> stack=new Stack<>();
//         int max=0;
        
//         for(char ch: s.toCharArray()){
//             if(ch=='('){
//                 stack.push(ch);
//                 max=Math.max(max,stack.size());
//             }
//             else if(ch==')'){
//                 stack.pop();
//             }
//         }
        
//         return max;
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            max=Math.max(count,max);
            if(s.charAt(i)==')') count--;
        }
        return max;
    }
}