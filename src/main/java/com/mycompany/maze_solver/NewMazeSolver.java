/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author mohdirfan
 */
public class NewMazeSolver  extends JFrame{
    
    //0 respresent from which w e can pass
    //1 is a obstacle we can not move from there
    //9 is the destination

    private int[][] maze = {
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,0,0,0,1,1,0,0,0,1,0,1},
        {1,0,0,1,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    
    public List<Integer> path = new ArrayList<>();
    
    public NewMazeSolver(){
        setTitle("Maze Solver");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFS.searchPath(maze,1,1,path);
        //System.out.println(path);
         
    }
    @Override
    public void paint(Graphics g){
        g.translate(80,80);
        
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j <maze[0].length; j++){
                Color color; // created a color object
                switch(maze[i][j]){
                    case 1 : color = Color.BLACK; break;
                    case 9 : color = Color.RED; break;
                    default : color = Color.WHITE; break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30, 30);
                g.setColor(Color.RED);
                g.drawRect(30*j, 30*i, 30, 30);  
         
            }
        }
        for( int i = 0; i < path.size(); i+=2){
            int pathX = path.get(i);
            int pathY = path.get(i+1);
            System.out.println("X cordinates" +pathX);
            System.out.println("Y cordinates" +pathY);
            
            g.setColor(Color.GREEN);
            g.fillRect(30*pathX, 30*pathY, 20, 20);
            
        }
    }
    public static void main(String[] args){
    NewMazeSolver  view = new NewMazeSolver();
    view.setVisible(true);
    
    
    }
    
}
