/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.List;

/**
 *
 * @author mohdirfan
 */
public class DFS {
    //x and y are the indexs of the point to start
    public static boolean searchPath(int[][] maze, int x, int y, List<Integer> path){
        if(maze[y][x] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x] == 0){
            maze[y][x] = 2; //mark as visited because we are checking for 0, 1 and 9 only
            int dx = -1; //upward direction
            int dy = 0;
            if(searchPath(maze, x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
              dx = 1; //downward direction
              dy = 0;
            if(searchPath(maze, x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
              dx = 0; 
              dy = -1; // left direction
            if(searchPath(maze, x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;  
        }
              dx = 0; 
              dy = 1; // right direction
            if(searchPath(maze, x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
