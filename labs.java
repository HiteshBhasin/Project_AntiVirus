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
        if (one.length()!=two.length()){
            System.out.println("this is not true");
        } else{

        }
    }
   
}