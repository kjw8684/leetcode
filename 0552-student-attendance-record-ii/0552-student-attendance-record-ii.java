import java.math.BigInteger;

class Solution {
    public int checkRecord(int n) {
        BigInteger zz = BigInteger.ONE, zo = BigInteger.ZERO, zt = BigInteger.ZERO, oz = BigInteger.ZERO, oo = BigInteger.ZERO, ot = BigInteger.ZERO, 
benchmark = new BigInteger("1000000007"), tzz, toz;
        
        for(int i = 0; i < n; i++) {
            tzz = zz;
            toz = oz;
            oz = zz.add(zo).add(zt).add(oz).add(oo).add(ot).remainder(benchmark);
            zz = zz.add(zo).add(zt).remainder(benchmark);
            ot = oo.remainder(benchmark);
            oo = toz.remainder(benchmark);
            zt = zo.remainder(benchmark);
            zo = tzz.remainder(benchmark);
            
        }
        
        return zz.add(zo).add(zt).add(oz).add(oo).add(ot).remainder(benchmark).intValue();
    }
    
}