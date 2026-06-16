class Solution {
    public boolean isValidSudoku(char[][] board) {

        //row validation
        for(int row =0; row<9; row++){
            HashSet<Character> set = new HashSet<>();
            for(int col =0; col<9; col++){

                if(board[row][col] == '.') continue;

                if(set.contains(board[row][col])){
                    return false;
                }
               set.add(board[row][col]);
            }
        }

        //col validation
          for(int col =0; col<9; col++){
            HashSet<Character> set = new HashSet<>();
            for(int row=0; row<9; row++){

                if(board[row][col] == '.') continue;

                if(set.contains(board[row][col])){
                    return false;
                }
               set.add(board[row][col]);
            }
        }

        //validating boxes
        for(int sr=0; sr<9; sr+=3 ){
            for(int sc=0; sc<9; sc+=3){
              HashSet<Character> set = new HashSet<>();



              for(int r =sr; r<sr+3; r++){
                for(int c= sc; c<sc+3; c++){
                    if((board[r][c]) == '.') continue;

                   if(set.contains(board[r][c])){
                    return false;
                   }
                   set.add(board[r][c]);
                }
              }
            }
        }
        return true;
    }
}
