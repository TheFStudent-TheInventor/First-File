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
