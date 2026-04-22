class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> list= new ArrayList<>();

        for(String q: queries){
            for(String d: dictionary){
                if(isValid(q,d)){
                    // System.out.println(isValid(q,d));
                    list.add(q);
                    break; //to avoid adinf more word from dictionary coz we got a match for q
                }
            }
        }
        return list;
        
    }

    private boolean isValid(String q, String d){
        int k=0;
        for(int i=0; i<q.length(); i++){
        
            if(q.charAt(i)!=d.charAt(i)){
                k++;
                if(k>2){
                    return false;
                 
                }
            }   

        
        }
        return true;
    }
}
