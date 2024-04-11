class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        for (char ch:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(ch-stack.peek())==32){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }

        return stack.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}