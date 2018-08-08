package com.company;

/**
 * Created by macarie on 08/08/2018.
 */
public class GameOfLife {

    boolean[][] board;
    int size;

    public GameOfLife(boolean[][] board, int size) {
        this.board = board;
        this.size = size;
    }

    public int getNeighbours(int r, int c) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int neigh = 0;

        for (int i = 0; i < 8 ; i++) {
            int row = r + dy[i];
            int col = c + dx[i];

            if (inRange(row, col)) {
                if (isAlive(row, col)) neigh++;
            }

        }
        return  neigh;
    }

    public boolean inRange(int row, int col) {
        if (row >= 0 && row < size && col >= 0 && col < size)
            return true;

        return false;
    }

    public boolean isAlive(int row, int col) {
        return board[row][col];
    }



}
