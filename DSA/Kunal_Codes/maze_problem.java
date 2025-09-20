package Kunal_Codes;

import java.util.ArrayList;

public class maze_problem {
    public static void main(String[] args) {
        //System.out.println(count(3,3));  // only movement is down and right
        //path("",3,3);
        //System.out.println(pathRet("",3,3));
        // System.out.println(pathRetDiagonal("", 3,3));
        boolean[][] maze = { {true, true, true},{true, false, true},{true, true, true}};
        System.out.println(pathRetObstacle("", maze,0,0));

    }

    //only for tota number of paths
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }

    // to print all the possible paths
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    //down and right only
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(pathRet(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(pathRet(p+'R',r,c-1));
        }
        return list;
    }

    //down , right and diagonal move
    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r>1 && c > 1){
            list.addAll(pathRetDiagonal(p+"D",r-1,c-1));
        }

        if (r>1){
            list.addAll(pathRetDiagonal(p+'V',r-1,c));
        }
        if (c>1){
            list.addAll(pathRet(p+'R',r,c-1));
        }
        return list;
    }

    //path return when there is a obstacle in between the maze and also asking the user for the starting position
    static ArrayList<String> pathRetObstacle(String p,boolean[][] maze ,int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]){
            return list;
        }
        if (r< maze.length-1){
            list.addAll(pathRetObstacle(p+'D',maze,r+1,c));
        }
        if (c< maze[0].length-1){
            list.addAll(pathRetObstacle(p+'R',maze,r,c+1));
        }
        return list;
    }

}
