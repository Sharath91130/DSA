package LoveBabar450.Strings;

class LengthofLastWord{
    public static int lengthOfLastWord(String s) {
       int len=0;
       int templength=s.length()-1;
       if(s.charAt(s.length()-1)!=' ') {
           len = s.length() - 1;
       }
      else{
          while(s.charAt(templength)==' '){
              templength--;
          }
          len=templength;
       }
       int ans=0;
       while (s.charAt(len)!=' '){
           len--;
           ans++;
       }
       return ans;

    }

    public static void main(String[] args) {
        int ans=lengthOfLastWord("");
        System.out.println(ans);
    }
}