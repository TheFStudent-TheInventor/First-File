public static String addSignature(String text, String signature){
        //tests all cases
        if(text.indexOf(signature)==text.length()-signature.length()){
            return text;
        }
        if(text.indexOf(signature)>-1){
            return text.substring(0,text.indexOf(signature))+text.substring(text.indexOf(signature+1)+signature.length());
        }
        return text+signature;
    }
