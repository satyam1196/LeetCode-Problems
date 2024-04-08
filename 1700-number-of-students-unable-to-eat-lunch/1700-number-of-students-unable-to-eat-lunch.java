class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
//         Intuition:
// We have a queue of students with their sandwich preferences and a stack of sandwiches to be served. The goal is to serve sandwiches to students based on their preferences. If a student's preferred sandwich is available, serve it; otherwise, move to the next student. The process stops when all sandwiches are served or when there are no more students to serve.

// Approach:
// Count the number of students preferring each type of sandwich.
// Serve sandwiches to students based on their preferences.
// Keep track of remaining sandwiches to be served.
// Return the count of remaining sandwiches, representing the number of students unable to eat lunch.

// Complexity Analysis:
// Time Complexity: O(n), where n is the number of students. We iterate through the students and sandwiches arrays once.
// Space Complexity: O(1) in terms of auxiliary space as we use a constant amount of space to store counts.
    
    
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