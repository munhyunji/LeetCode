class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0;
        int costTotal = 0;
        
        for(int g : gas) gasTotal += g; 
        for(int c : cost) costTotal += c;
        
        if(gasTotal < costTotal) return -1;
        
        int total = 0;
        int index = 0;
        
        for(int i = 0; i <gas.length; i++) {
            total += gas[i] - cost[i];
            
            if(total < 0) {
              total = 0;  
                index = i + 1;           
            } 
        }
        return index; 
    }
}