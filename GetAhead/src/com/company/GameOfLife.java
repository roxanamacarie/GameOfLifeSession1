package com.company;

import java.util.ArrayList;

/**
 * Created by macarie on 08/08/2018.
 */
public class GameOfLife {

    int[][] state;
    int height;
    int width;

    public GameOfLife(int[][] state, int height, int width) {
        this.state = state;
        this.height = height;
        this.width = width;
    }


    public int countNeighbours(int r, int c) {

        int neigh = 0;

        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {

                int currentCol = j;
                int currentRow = i;

                if (i == r && j == c)
                    continue;

                if (i < 0) {
                    currentRow = this.height - 1;
                }

                if (j < 0) {
                    currentCol = this.width - 1;
                }

                if (i >= width)
                    currentRow = 0;

                if (j >= height)
                    currentCol = 0;

                if (state[currentRow][currentCol] == 1)
                    neigh++;
            }
        }

        return neigh;
    }


    public int updateStateForCell(int r, int c, int neighbours) {

        if (state[r][c] == 1) {
            if (neighbours <= 1 || neighbours >= 4)
                return 0;
        } else {
            if (neighbours == 3)
                return 1;
        }

        return state[r][c];
    }

    public void updateState() {

        int[][] newState = new int[this.width][this.height];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++){
                int neigh = countNeighbours(i, j);
                int newCellState = updateStateForCell(i, j, neigh);
                newState[i][j] = newCellState;
            }


        this.state = newState;
    }

    public void printState() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(state[i][j] + " ");
            }

            System.out.println();
        }
    }

    public int[][] getState() {
        return state;
    }

    public void setState(int[][] state) {
        this.state = state;
    }
}
