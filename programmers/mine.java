package programmers;

import java.util.Arrays;

public class mine {
    public static void main(String[] args) {
        String[] board ={"EEEEE","EEMEE", "EEEEE", "EEEEE"};
        int x =0;
        int y = 2;
        System.out.println(Arrays.toString(mine(board,y,x)));
    }
    public static String[] mine(String[] board, int y, int x) {
        // Convert the input board to a 2D char array.
        char[][] charBoard = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                charBoard[i][j] = board[i].charAt(j);
            }
        }

        // If the selected coordinate is a mine, mark it with "B" and return the updated board.
        if (charBoard[y][x] == 'M') {
            charBoard[y][x] = 'B';
            return convertToStringArray(charBoard);
        }

        // Initialize the adjacent mine count to 0.
        int adjMineCount = 0;

        // Check all adjacent cells and increment the adjacent mine count if there is a mine.
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (i >= 0 && i < charBoard.length &&
                        j >= 0 && j < charBoard[0].length && charBoard[i][j] == 'M') {
                    adjMineCount++;
                }
            }
        }

        // If there are adjacent mines, update the cell with the count and return the updated board.
        if (adjMineCount > 0) {
            charBoard[y][x] = Character.forDigit(adjMineCount, 10);
            return convertToStringArray(charBoard);
        }

        // Otherwise, reveal all adjacent cells and update the board recursively.
        revealAdjacentCells(charBoard, y, x);
        return convertToStringArray(charBoard);
    }

    // Recursively reveal all adjacent cells.
    private static void revealAdjacentCells(char[][] board, int y, int x) {
        // If the current cell is out of bounds or already revealed, return.
        if (y < 0 || y >= board.length || x < 0 || x >= board[0].length || board[y][x] != 'E') {
            return;
        }

        // Initialize the adjacent mine count to 0.
        int adjMineCount = 0;

        // Check all adjacent cells and increment the adjacent mine count if there is a mine.
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 'M') {
                    adjMineCount++;
                }
            }
        }

    if (adjMineCount > 0) {
        board[y][x] = Character.forDigit(adjMineCount, 10);
        return;
    }

    // Otherwise, reveal the current cell and recursively reveal all adjacent cells.
    board[y][x] = 'B';
    for (int i = y - 1; i <= y + 1; i++) {
        for (int j = x - 1; j <= x + 1; j++) {
            revealAdjacentCells(board, i, j);
        }
    }
}


    // Convert a 2D char array to a String array.
    private static String[] convertToStringArray(char[][] charBoard) {
        String[] stringBoard = new String[charBoard.length];
        for (int i = 0; i < charBoard.length; i++) {
            stringBoard[i] = new String(charBoard[i]);
        }
        return stringBoard;
    }
}
