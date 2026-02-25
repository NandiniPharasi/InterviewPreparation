class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        
        return arr;
    }
}

/***
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

        for(int i=0; i<newarr.length; i++){
            newarr[i]=sortedEntries.get(i).getKey();
        }
        return newarr;
    }
}

*/
