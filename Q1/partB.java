public int dogWalkShift(int start, int end){
        int dollars = 0;
        for(int i=start;i<=end;i++){
            dollars+=walkDogs(i)*5;
            if((i>=9 && i<=17)||walkDogs(i)==maxDogs){
                dollars+=3;
            }
        }
        return dollars;
    }
