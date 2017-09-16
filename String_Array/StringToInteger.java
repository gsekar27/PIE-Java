public class StringToInteger{

  public static void main(String[] args){

    String str = "+-1";

    System.out.println("\"" + StringToInt(str) + "\"");
  }

  private static int StringToInt(String s){

    if(s.length() == 0) return 0;
   s = s.trim();
   long total = 0;
   int sign = s.charAt(0) == '-'? -1:1;

   int sIndex = s.charAt(0)=='-' || s.charAt(0)=='+'?1:0;
  // System.out.println("flag: " + negative + " start: " + sIndex);

   for(int i = sIndex; i < s.length(); i++){
     char ch = s.charAt(i);
     if(ch >= '0' && ch <= '9'){
       total = (total * 10) + (ch - '0');
     }
     else{
       if(sign == 1 && total > Integer.MAX_VALUE) return Integer.MAX_VALUE;
     if(sign == -1 && total * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
    break;
     }
     if(sign == 1 && total > Integer.MAX_VALUE) return Integer.MAX_VALUE;
     if(sign == -1 && total * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
   }
   return (int) total * sign;
  }

}
