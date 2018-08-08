package com.company;

public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int[][] startState = {{0, 0 , 0, 0, 0},
                             {0, 0 , 0, 0, 0},
                             {0, 1, 1, 1, 0},
                             {0, 0 , 0, 0, 0},
                             {0, 0 , 0, 0, 0}};

        int width = 5;
        int height = 5;

        GameOfLife gol = new GameOfLife(startState, width, height);
        System.out.println("Before:");
        gol.printState();

        System.out.println("After:");
        gol.updateState();

        gol.printState();

    }
}
