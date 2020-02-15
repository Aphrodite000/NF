public class Solution {
    public int Fibonacci(int n) {
        //0,1,1,2,3
        if(n==0){
            return 0;
        }
        int a=0;
        int b=1;
        int count=0;
        while(count!=n-1){
            int c=b;
            b=a+b;
            a=c;
            count++;
        }
        return b;
    }
}
