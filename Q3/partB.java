public ArrayList<Match>buildMatches(){
  ArrayList<Match> matches = new ArrayList<Match>();
  int len = competitorList.size();
  if(len/2==0){
    for(int i=0;i<len/2;i++){
      Match current = new Match(competitorList.get(i),competitorList.get(len-i-1));
      matches.add(current);
    }
  }
  else{
    for(int i =1;i<1+len/2;i++){
      Match current = new Match(competitorList.get(i), competitorList.get(len-1));
      matches.add(current);
    }
  }
  return matches;
}
