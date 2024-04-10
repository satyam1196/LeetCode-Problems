class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] result=new int[n];
        Arrays.fill(result,0);
        
        int i=0;
        int j=0;
        boolean skip=false;
        
        while(i<n){
            
            if(result[j]==0){
                if(!skip){
                result[j]=deck[i];
                i++;
                }
                 skip=!skip; 
            }
            j=(j+1)%n;  
        }   
        return result;
    }
}