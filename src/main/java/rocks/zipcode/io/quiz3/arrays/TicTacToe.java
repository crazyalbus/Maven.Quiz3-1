package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        for (int i = 0; i <3 ; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public String[] getTopLeftDiagonal() {
        String[] diagonal = new String[3];
        for (int i = 0; i <3 ; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public String[] getBottomLeftDiagonal() {
        String[] diagonal = new String[3];
        for (int i = 0; i <3 ; i++) {
            diagonal[i] = board[i][2 - i];
        }
        return diagonal;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);

        return isStringHomogeneous(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);

        return isStringHomogeneous(column);
    }

    public Boolean isStringHomogeneous(String[] results) {
        boolean result = false;
        if(results[0].equals(results[1])) {
            if(results[0].equals(results[2])) {
                result =  true;
            }
        }
        return result;
    }

    public String getWinner() {
        String winner = "";

        for (String[] row : board) {
            if(isStringHomogeneous(row)){
                winner = row[0];
            }
        }

        for (int i = 0; i < 3 ; i++) {
            if(isStringHomogeneous(getColumn(i))){
                winner = getColumn(i)[0];
            }
        }

        if(isStringHomogeneous(getTopLeftDiagonal())){
            winner = getTopLeftDiagonal()[0];
        }

        if(isStringHomogeneous(getBottomLeftDiagonal())){
            winner = getBottomLeftDiagonal()[0];
        }

        return winner;
    }

    public String[][] getBoard() {
        return null;
    }
}
