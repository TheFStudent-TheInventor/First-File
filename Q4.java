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
    public boolean clearPath(int row, int col){
        int test = puzzle[row][col];
        for(int i =row; i<puzzle.length;i++){
            for(int j= 0; j< puzzle[0].length;j++){
                int current = puzzle[i][j];
                if(i!=row && j != col){
                    if(test+current==10||test==curent){
                        puzzle[row][col]=0;
                        puzzle[i][j]=0;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
