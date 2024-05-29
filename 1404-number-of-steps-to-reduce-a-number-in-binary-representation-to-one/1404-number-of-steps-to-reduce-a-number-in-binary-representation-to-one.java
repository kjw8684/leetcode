import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        int count = 0;
        BigInteger current = new BigInteger(s, 2), two = new BigInteger("2");
        
        while(!current.equals(BigInteger.ONE)) {
            if(current.remainder(two) == BigInteger.ZERO) {
                current = current.divide(two);
            }
            else {
                current = current.add(BigInteger.ONE);
            }
            
            count++;
        }
        
        return count;
    }
}