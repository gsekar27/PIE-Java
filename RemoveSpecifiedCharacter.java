import java.util.HashSet;
public class RemoveSpecifiedCharacter{

  public static void main(String[] args){

    String str = "abcde";
    String remove = " ab";

    System.out.println(removeSpecified(str, remove));
    //Make the lookup table

  }
  public static String removeSpecified(String str, String remove){

    if(str.length() == 0 || remove.length()==0) return str;
    //Use array if its just going to ascii or alpha numeric;
    //for ascii the index will be the character and for numer, you will have to calculate the index;
    //example char -'a' and length will be 'z' -'a'

    //for easy i am using hashmap.
    HashSet<Character> set = new HashSet<Character>();
    for(int i =0; i < remove.length(); i++){
      set.add(remove.charAt(i));
    }

    //Use the two pointer approach for the deletion
    char[] arr = str.toCharArray();
    int srcIndex =0;
    int destIndex = 0;
    while(srcIndex < arr.length){
      if(!set.contains(arr[srcIndex])){

    	   arr[destIndex++] = arr[srcIndex++];
      }else{
        srcIndex++;
      }
    }
    return new String(arr, 0, destIndex);
  }
}
