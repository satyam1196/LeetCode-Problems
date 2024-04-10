class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        //CodeStoryWithMick //Approach 1
//         Arrays.sort(deck);
//         int n=deck.length;
//         int[] result=new int[n];
//         Arrays.fill(result,0);
        
//         int i=0;
//         int j=0;
//         boolean skip=false;
        
//         while(i<n){
            
//             if(result[j]==0){
//                 if(!skip){
//                 result[j]=deck[i];
//                 i++;
//                 }
//                  skip=!skip; 
//             }
//             j=(j+1)%n;  
//         }   
//         return result;
        
        
        //Approach 2
        
        Arrays.sort(deck);
        Queue<Integer> queue=new LinkedList<>();
        int n=deck.length;
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            int index=queue.poll();
            result[index]=deck[i];
            
            if(!queue.isEmpty()){
                queue.add(queue.peek());
                queue.poll();
            }
        }
        return result;
    }
}