package Strings;

public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("10133890"));

    }
    public static String largestOddNumber(String num) {
        if(num.charAt(0)%2!=0 && num.charAt(num.length()-1)%2!=0 ){
            return num;
        }
        if(num.charAt(0)%2==0 && num.charAt(num.length()-1)%2!=0 ){
            return num;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num.length();i++){
            char c= num.charAt(i);
            int n=c-'0';

            if(checkOdd(n)){
                ans.append(n);
                int temp=Integer.parseInt(String.valueOf(ans));
                if(checkOdd(temp)){
                    int t=ans.indexOf(String.valueOf(n));
                    ans.deleteCharAt(t);
                    ans.append(temp);
                }

            }

        }
        return new String(ans);
    }

    private static boolean checkOdd(int n){
        return n%2!=0;
    }
}
