public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double y = (t1 + t2 + t3 + t4)/4;
        return y;
    }

    public int roundAverage(double average) {
        int x = (int)(average + 0.5);
        return x;
    }

    public boolean isPassing(int roundedAverage) {
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        double z = shares*price;
        return z;
    }


    public int roundValueChange(double totalStock) {
        double a = Math.round(totalStock);
        int h = (int)(a);
        return h;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        userDouble = userDouble*100;
        int b = (int)(userDouble/10000);
        userDouble = userDouble - b*10000;
        int c = (int)userDouble/1000;
        userDouble = userDouble - c*1000;
        int d = (int)userDouble/100;
        userDouble = userDouble - d*100;
        double e = (int)userDouble/10;
        userDouble = userDouble - e*10;
        double f = userDouble;
        b = (b+1)%10;
        c = (c+1)%10;
        d = (d+1)%10;
        e = (e+1)%10;
        f = (f+1)%10;
        return b*100 + c*10 + d + e/10 + f/100;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
