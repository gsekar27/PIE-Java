public class ReverseWords{

  public static void main(String args[]){
    String words = " aaa ab";

    System.out.println(reverseW(words));
  }

  private static String reverseW(String words){
    //Empty input
    if(words.length() == 0) return words;

    //Else
    int sIndex = words.length() -1;

    StringBuilder result = new StringBuilder();
    while(sIndex > 0 && words.charAt(sIndex) == ' '){
            sIndex--;
    }
    int eIndex = sIndex;
    while(sIndex > 0){
      if(words.charAt(sIndex -1) != ' '){
        sIndex--;
      }else{
        for(int i = sIndex; i <= eIndex; i++){
          result.append(words.charAt(i));

          }
        result.append(' ');
        sIndex--;
        //Find the end point of the next StringBuilder
        while(sIndex > 0 && words.charAt(sIndex) == ' '){
            sIndex--;
        }
        if(sIndex > 0){
          eIndex = sIndex;
        }
      }
    }
    //SIndex--;
    if(sIndex == 0 && words.charAt(sIndex) != ' '){
      //System.out.println("outside");
      for(int i = sIndex; i <= eIndex; i++){
        result.append(words.charAt(i));
        }
    }

    return result.toString();
  }
}
