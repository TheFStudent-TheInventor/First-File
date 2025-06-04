public ArrayList<Match> buildMatches(){
        ArrayList<Match> matches = new ArrayList<Match>();
        if(competitorList.size()%2 ==0){
                for(int i = 0; i< competitorList.size();i++){
                        Match current = new Match(competitorList.get(i), competitorList.get(competitorList.size()-i-1));
                        matches.add(current);
                }
        }
        else{
                for(int i = 1;i< competitorList.size()/2 ;i++){
                        Match current = new Match(competitorList.get(i), competitorList.get(competitorList.size()-i);
                        matches.add(current);
                }
        }
        return matches
}
