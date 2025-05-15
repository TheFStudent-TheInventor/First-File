public Round(String[]names){
  for(int i =0;i<names.length;i++){
    Competitor current = new Competitor(names[i],i+1);
    competitorList.add(current);
  }
}
