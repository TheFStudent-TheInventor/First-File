public String getSignature(String first, String last){
        if(first.length()==0){
            return last;
        }
        return first.substring(0,1)+"-"+last;
    }
