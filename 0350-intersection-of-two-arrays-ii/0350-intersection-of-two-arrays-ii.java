// Intuition
// The problem requires finding the intersection of two arrays such that each element in the result must appear as many times as it shows in both arrays. The given solution utilizes the frequency count of elements to achieve this. By counting the occurrences of elements in the first array and then using this count to check against elements in the second array, the solution efficiently finds the intersection.

// Approach
// Count Frequencies: Use an integer array arr to count the occurrences of each number in nums1.
// Traverse nums1 and for each element, increment its count in arr.
// Find Intersection: Use another integer array result to store the intersection elements.
// Traverse nums2 and for each element, check if it exists in arr with a count greater than zero.
// If it does, add the element to result, decrement the count in arr, and move to the next position in result.
// Return Result: Use Arrays.copyOfRange to return only the filled portion of result array.
// Complexity
// Time Complexity
// ( O(n + m) )

// Counting frequencies of elements in nums1 takes ( O(n) ) time, where n is the length of nums1.
// Finding intersection by traversing nums2 takes ( O(m) ) time, where m is the length of nums2.
// Space Complexity
// ( O(1) ) (excluding the input and output arrays)

// The arr array has a fixed size of 1001, which does not depend on the input size.
// The result array is of size 1001 as well, which is also constant space.
// Code
// import java.util.Arrays;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int[] arr = new int[1001];  // To count frequencies of elements in nums1
//         int[] result = new int[1001];  // To store the result

//         // Count the frequencies of each number in nums1
//         for (int num : nums1) {
//             arr[num]++;
//         }

//         int ctr = 0;  // Counter for the result array
//         // Traverse nums2 to find common elements
//         for (int num : nums2) {
//             if (arr[num] > 0) {
//                 result[ctr++] = num;
//                 arr[num]--;
//             }
//         }

//         // Return only the filled portion of the result array
//         return Arrays.copyOfRange(result, 0, ctr);
//     }
// }
// This approach is efficient for the given constraints and utilizes a simple frequency count mechanism to find the intersection of two arrays. The fixed-size arrays ensure that the space complexity remains constant.

// Follow-Up Questions
// What if the given array is already sorted? How would you optimize your algorithm?

// Optimized Approach:

// Use a two-pointer technique to find the intersection of the two sorted arrays.
// Traverse both arrays with two pointers, compare the elements at each pointer, and collect the intersection elements.
// Optimized Code:

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         List<Integer> resultList = new ArrayList<>();
//         int i = 0, j = 0;

//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] == nums2[j]) {
//                 resultList.add(nums1[i]);
//                 i++;
//                 j++;
//             } else if (nums1[i] < nums2[j]) {
//                 i++;
//             } else {
//                 j++;
//             }
//         }

//         int[] result = new int[resultList.size()];
//         for (int k = 0; k < resultList.size(); k++) {
//             result[k] = resultList.get(k);
//         }
//         return result;
//     }
// }
// Time Complexity: (O(n log n + m log m))

// Sorting both arrays takes (O(n log n + m log m)).
// The two-pointer traversal takes (O(n + m)).
// Space Complexity: (O(min(n, m)))

// The result list can at most store the minimum length of the two arrays.
// What if nums1's size is small compared to nums2's size? Which algorithm is better?

// If nums1 is much smaller than nums2, the counting approach is efficient because:

// The smaller size of nums1 means fewer increments for the frequency array.
// Traversing nums2 to find intersections remains linear.
// Alternatively, if nums1 is very small, using a HashMap for nums1 frequencies can be beneficial to handle larger ranges or negative numbers:

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Map<Integer, Integer> map = new HashMap<>();
//         List<Integer> resultList = new ArrayList<>();

//         for (int num : nums1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for (int num : nums2) {
//             if (map.containsKey(num) && map.get(num) > 0) {
//                 resultList.add(num);
//                 map.put(num, map.get(num) - 1);
//             }
//         }

//         int[] result = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             result[i] = resultList.get(i);
//         }
//         return result;
//     }
// }
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

// Optimized Approach:

// Load nums2 in chunks and process each chunk against the in-memory nums1 frequencies.
// Use an external sorting algorithm or hash-based approach to manage the large data on disk.
// Code Skeleton for Chunk Processing:

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Solution {
//     public int[] intersect(int[] nums1, String nums2FilePath) {
//         Map<Integer, Integer> map = new HashMap<>();
//         List<Integer> resultList = new ArrayList<>();

//         for (int num : nums1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Read nums2 from disk in chunks
//         List<Integer> nums2Chunk;
//         while ((nums2Chunk = readChunkFromDisk(nums2FilePath)) != null) {
//             for (int num : nums2Chunk) {
//                 if (map.containsKey(num) && map.get(num) > 0) {
//                     resultList.add(num);
//                     map.put(num, map.get(num) - 1);
//                 }
//             }
//         }

//         int[] result = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             result[i] = resultList.get(i);
//         }
//         return result;
//     }

//     private List<Integer> readChunkFromDisk(String filePath) {
//         // Implementation to read chunks of nums2 from disk
//         // This is a placeholder for actual implementation
//         return new ArrayList<>();
//     }
// }
// Time Complexity: Dependent on disk read and chunk processing time.

// Space Complexity: (O(min(n, chunk size)))

// Limited to the size of nums1 and a chunk of nums2.




class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        int[] ans=new int[1001];

        for(int num:nums1){
            arr[num]++;
        }

        int counter=0;

        for(int num:nums2){
            if(arr[num]>0){
                ans[counter++]=num;
                arr[num]--;
            }
        }
        
        return Arrays.copyOfRange(ans,0,counter);
    }
}