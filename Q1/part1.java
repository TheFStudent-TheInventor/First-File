public int walkDogs(int hour){
        int numDogs = numAvailableDogs(hour);
        if(max > numDogs){
            company.updateDogs(hour,numDogs);
            return numDogs;
        }
        company.updateDogs(hour, maxDogs);
        return maxDogs;
    }
