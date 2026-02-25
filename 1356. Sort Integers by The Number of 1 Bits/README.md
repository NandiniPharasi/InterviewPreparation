Example 1:

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]
Example 2:

Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.

// I tried this:
class Solution {
    public int[] sortByBits(int[] arr) {
        int [] newarr=new int[arr.length];
        Map<Integer, Integer> map= new LinkedHashMap<>();
        Arrays.sort(arr);
        for(int n: arr){
            int a=Integer.bitCount(n);
            map.put(n, a);
        }
        // Sort entries by value
         List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet()); sortedEntries.sort(Map.Entry.comparingByValue());

        for(int i=0; i<sortedEntries.size(); i++){ 
            newarr[i] = sortedEntries.get(i).getKey();
             }
        return newarr;
    }
}

Issue in this is map can store diff keys, not same 
so failing at
[10000, 10000]
<img width="592" height="750" alt="image" src="https://github.com/user-attachments/assets/25326495-f735-4c4b-95d5-c8749befb3ec" />

