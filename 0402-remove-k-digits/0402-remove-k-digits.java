class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        Stack<Character> stack=new Stack<>();

        for(char ch:num.toCharArray()){
            while (!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        String s=stack.stream().map(a->a.toString()).collect(Collectors.joining(""));
        return s.replaceFirst("^0+(?!$)", "");
    }
}