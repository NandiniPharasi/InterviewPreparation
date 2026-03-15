Write an API that generates fancy sequences using the append, addAll, and multAll operations.

Implement the Fancy class:

Fancy() Initializes the object with an empty sequence.
void append(val) Appends an integer val to the end of the sequence.
void addAll(inc) Increments all existing values in the sequence by an integer inc.
void multAll(m) Multiplies all existing values in the sequence by an integer m.
int getIndex(idx) Gets the current value at index idx (0-indexed) of the sequence modulo 109 + 7. If the index is greater or equal than the length of the sequence, return -1.

//solution with TLE:
class Fancy {
     private ArrayList<Long> list;
  
    Long mod=1_000_000_007L;
    public Fancy() {
     list=new ArrayList<>();
  
        
    }
    
    public void append(int val) {
        list.add((long)val);
        
    }
    
    public void addAll(int inc) {
        for(int i=0; i<list.size(); i++){
            list.set(i, (list.get(i)+inc)%mod);
        }
    }
    
    public void multAll(int m) {
         for(int i=0; i<list.size(); i++){
             list.set(i, (list.get(i)*m)%mod);
        }
    }
    
    public int getIndex(int idx) {
        if(idx>=list.size()){
            return -1;
        }
        return (int)(list.get(idx)%mod);
        
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
