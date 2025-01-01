public class AmazonString {
    public static void main(String[] args) {
        String str = "OMKAAAR";
        removeduplicates(str,0, new StringBuilder("") ,new boolean [26]);
    }
    public static void removeduplicates(String str, int index, StringBuilder newstring , boolean map[] ){
           if (index == str.length()) {
              System.out.println( newstring);
              return;
           }
           
           char currentchar = str.charAt(index);

           if(map[currentchar - 'A'] == true){
               //Duplicate
               removeduplicates(str, index+1, newstring, map);
           }else{
               map[currentchar - 'A'] = true;
               removeduplicates(str, index+1, newstring.append(currentchar), map);
           }
    }
}
