import java.util.LinkedList;
public class IntegerToString{

  public static void main(String[] args){
    int i1 = 0;
    int i2 = -6897;
    int i3 = 8797;
    int i4 = -1;
    int i5 = 1;
    System.out.println(intToString(i1));
    System.out.println(intToString(i2));
    System.out.println(intToString(i3));
    System.out.println(intToString(i4));
    System.out.println(intToString(i5));

  }
  private static String intToString(int i){
      if(i == 0) return "0";//0 val;
      StringBuilder str = new StringBuilder();
      boolean negative = i < 0;
      LinkedList<Character> list = new LinkedList<Character>();
      i = Math.abs(i);
      while(i >0){
        int digit = i %10;
        i = i /10;
        char ch = (char)('0' + digit);
        list.addFirst(ch);
      }
      if(negative)str.append('-');
      while(!list.isEmpty()){
        str.append(list.removeFirst());
      }
      return str.toString();

  }
}
