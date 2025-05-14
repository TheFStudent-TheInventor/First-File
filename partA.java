//I just did all of this in main, but its the same format. I'm just lazy
public class Main {
    public static void main(String [] args) {
        //A bunch of test cases
        System.out.println(getSignature("Hello", "Skibidi"));
        System.out.println(addSignature("I-hehehehe", "I"));
        System.out.println(addSignature("FDEGHDJHWJGVJQK", "William")); //sigma boy ;p
    }
    public static String getSignature(String first, String last){
        if(first.length()==0){
            return last;
        }
        return first.substring(0,1)+"-"+last;
    }
    public static String addSignature(String text, String signature){
        //tests all cases
        if(text.indexOf(signature)==-1){
            return text+signature;
        }
        if(text.indexOf(signature)==0){
            return text.substring(signature.length())+signature;
        }
        return text;
    }
}
