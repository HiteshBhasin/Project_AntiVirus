import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class labs {

    public static void main(String[] args) {
        // bitSwap();
        intToBinaryString(632);
    }

    public static int bitSwap(){
        Scanner obj =  new Scanner(System.in);
        String userInput =  obj.next();
        int bitToDecimal = bitToDecimal(userInput);
        System.out.println(bitToDecimal);
       //userInput = 1010101010
       Stack <Character>que = new Stack<>();
       int i = 0;
       int length = userInput.length();
        while (length!=0) {
        que.add(userInput.charAt(i));
            i++;
            length--;
        }
        String s = " ";
        while (!que.empty()) {
            s+=que.pop();
            
        }
        int ans = bitToDecimal(s);
        System.out.println(s);
        System.out.println(ans);
        return ans;
        
    }

    private static int bitToDecimal(String s){
        int power = 0;
        int ans = 0;

        for (int i  = s.length()-1 ; i>=0; i--){
            if (s.charAt(i)=='1'){
                ans+=Math.pow(2, power);
            }
            power++;
        }
        return ans;
    }

    public static int comparison(int m){
        return (m >= 0) ? m : -m;
    }

    private static String intToBinaryString(int x){
        String s =" ";
        while (x>0) {
            s+=x%2;
            x=x/2;
        }
        return s;
    }

    private static void carryBits(int x, int y){
        String one = intToBinaryString(x);
        String two = intToBinaryString(y);
        Queue<Character> newQue = new LinkedList<>();
        String result = " ";
        one = trimLeadingZeros(one);
        two = trimLeadingZeros(two);
        int n = one.length();
        int m = two.length();
        StringBuilder prefix = new StringBuilder();
        if (n<m){
            int diff = m-n;
            for(int i =diff-1 ; i>=0;i--){
                prefix.append("0");
            }
        }
        one = prefix+one;
        // there is another way of doing this. 
        /*for (int j = m - 1; j >= 0; j--) {
        int bit1 = one.charAt(j) - '0';
        int bit2 = two.charAt(j) - '0';

        int sum = bit1 + bit2 + carry;
        result = (sum % 2) + result;
         carry = sum / 2;
}

            if (carry > 0) {
          result = "1" + result;
            }
         * but i will continue with the below. 
         * 
         */
        for (int j = m-1; j>=0;j--){
            while(!newQue.isEmpty())
            if (one.charAt(j)=='1' && two.charAt(j) =='0' ){
                result+='0';
            } else if(one.charAt(j)=='1' && two.charAt(j) =='1' ){
                result+=0;
                newQue.add('1');
            }
        }
    }
    private static String trimLeadingZeros(String s){
        int firstPos = s.indexOf('1');
        if (firstPos==-1){
            return "0";
        } else {
            return s.substring(firstPos);
        }
    }
   
}