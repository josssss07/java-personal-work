public class StringWorks {
    public static void main(String[] args){
        StringWorks w = new StringWorks();
        String s = "This is a very long string with the word flabbergasted ";
        System.out.println(s);
        w.alternateToUpper(s);
        w.displayCenterWord(s);
        w.longestWord(s);
        w.stringReverse(s);
        w.alternateWordReverse(s);
        w.alternateWordDelete(s, "very");
    }

    //q1: alternating words to uppercase
    void alternateToUpper(String s){
        String newString  = "";
        String[] sarr = s.split("\\s+");
        for(int i = 0; i<sarr.length; i++){
            if(i%2==0){
                newString = newString+ sarr[i].toUpperCase()+" ";
            }
            else {
                newString = newString + sarr[i]+ " " ;
            }
        }
        System.out.println("new string is:");
        System.out.println(newString);
    }

    //display the center word:
    void displayCenterWord(String s){
        String[] sarr = s.split("\\s+");
        String newString ="";
        int length = sarr.length;
        if (length%2 == 0){
            newString = sarr[(length/2)-1]+ " "+ sarr[(length/2)];
        }
        else {
            newString = sarr[(length/2)];

        }
        System.out.println(newString);
    }

    void longestWord(String s){
        String[] sarr = s.split("\\s+");
        int max= 0;
        String maxstr= "";
        for(String str: sarr) {
            int n = str.length();
            if(n> max) {
                max = n;
                maxstr = str;
            }

        }
        System.out.println(maxstr);
    }

    void stringReverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    void alternateWordReverse(String s){
        String newString = "";
        String[] sarr = s.split("\\s+");
        for (int i=0; i< sarr.length; i++){
            StringBuffer sb = new StringBuffer(sarr[i]);
            if (i%2 ==0){
                newString = newString+ sb.reverse()+" ";
            }
            else {
                newString = newString + sarr[i]+ " ";
            }
        }
        System.out.println(newString);

    }

    void alternateWordDelete(String s, String wordToDelete){
        String[] sarr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sarr.length; i++) {
            if (!sarr[i].equals(wordToDelete)) {
                sb.append(sarr[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }

}
