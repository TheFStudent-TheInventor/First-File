class SumOrSameGame{
    private int[][]puzzle;
    public SumOrSameGame(int rows, int col){
        puzzle = new int[rows][col];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;i++){
                puzzle[i][j]=(int)(Math.random()* 9+1);
            }
        }
    }
}
