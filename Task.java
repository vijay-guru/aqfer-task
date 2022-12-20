import java.util.Scanner;
public class Task {
    static int left=0;
    static int forward=0;
    static void toNorth(int x,int y,char dir){
        if(dir=='E'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            left++;
        }
        else if(dir=='S'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            left+=2;
        }
        else{
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            left+=3;
        }
    }
    static void toSouth(int x,int y,char dir){
        if(dir=='W'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            left++;
        }
        else if(dir=='N'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            left+=2;
        }
        else{
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            left+=3;
        }
    }
    static void toEast(int x,int y,char dir){
        if(dir=='S'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            left++;
        }
        else if(dir=='W'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            left+=2;
        }
        else{
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            System.out.println("Turn Left:  "+x+" "+y+" "+'S');
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            left+=3;
        }
    }
    static void toWest(int x,int y,char dir){
        if(dir=='N'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            left++;
        }
        else if(dir=='E'){
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            left+=2;
        }
        else{
            System.out.println("Turn Left:  "+x+" "+y+" "+'E');
            System.out.println("Turn Left:  "+x+" "+y+" "+'N');
            System.out.println("Turn Left:  "+x+" "+y+" "+'W');
            left+=3;
        }
    }
    static void moveForward(int x,int y,char dir){
        if(dir=='N'){
            y++;
        }
        else if(dir=='S'){
            y--;
        }
        else if(dir=='E'){
            x++;
        }
        else{
            x--;
        }
        System.out.println("Move Forward:  "+x+" "+y+" "+dir);
        forward++;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input="";
        input+=sc.nextLine();
        sc.close();
        String array[]=input.split(",");
        int x1=Integer.parseInt(array[0]);
        int y1=Integer.parseInt(array[1]);
        int x2=Integer.parseInt(array[2].substring(2));
        int y2=Integer.parseInt(array[3]);
        char sourceDirection=array[2].charAt(0);
        char targetDirection=array[4].charAt(0);
        if(x1<0 || x2<0 || y1<0 || y2<0){
            System.out.println("Invalid input");
            return;
        }
        System.out.print("Source: "+x1+" "+y1+" "+sourceDirection+", ");
        System.out.println("Destination: "+x2+" "+y2+" "+targetDirection);
        System.out.println("Steps:");
        if(y1<y2){
            if(sourceDirection!='N'){
                toNorth(x1,y1,sourceDirection);
                sourceDirection='N';
            }
            for(int i=y1;i<y2;i++){
                moveForward(x1,i,sourceDirection);
            }
            y1=y2;
        }
        else if(y1>y2){
            if(sourceDirection!='S'){
                toSouth(x1,y1,sourceDirection);
                sourceDirection='S';
            }
            for(int i=y1;i>y2;i--){
                moveForward(x1,i,sourceDirection);
            }
            y1=y2;
        }
        if(x1<x2){
            if(sourceDirection!='E'){
                toEast(x1,y1,sourceDirection);
                sourceDirection='E';
            }
            for(int i=x1;i<x2;i++){
                moveForward(i,y1,sourceDirection);
            }
            x1=x2;
        }
        else if(x1>x2){
            if(sourceDirection!='W'){
                toWest(x1,y1,sourceDirection);
                sourceDirection='W';
            }
            for(int i=x1;i>x2;i--){
                moveForward(i,y1,sourceDirection);
            }
            x1=x2;
        }
        if(x1==x2 && y1==y2 && sourceDirection!=targetDirection){
            if(targetDirection=='N'){
                toNorth(x1,y1,sourceDirection);
            }
            else if(targetDirection=='S'){
                toSouth(x1,y1,sourceDirection);
            }
            else if(targetDirection=='E'){
                toEast(x1,y1,sourceDirection);
            }
            else{
                toWest(x1,y1,sourceDirection);
            }
        }
        System.out.println("Total Steps:  "+(left+forward));
        System.out.println("Move Forward:  "+forward);
        System.out.println("Turn Left:  "+left);
    }
}