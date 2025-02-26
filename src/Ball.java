import javax.swing.*;
import java.awt.*;
public class Ball {

    private int x,y,xSpeed, ySpeed, size;
    private Color color;
    private ImageIcon img = new ImageIcon("b.jpeg");


    public Ball(){
        this.x=(int)(Math.random()*400);
        this.y=(int)(Math.random()*400);
        this.xSpeed=(int)(Math.random()*2)+1;
        this.ySpeed=(int)(Math.random()*2)+1;
        this.size=(int)(Math.random()*30)+20;
        this.color=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }
    public Ball(int x,int y,int xSpeed, int ySpeed, int size, Color color){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.size=size;
        this.color=color;
    }


public Color getColor(){
        return color;
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSpeed() {
        return xSpeed;
    }
    public int getYSpeed() {
        return ySpeed;
    }

    public int getSize() {
        return size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setXSpeed(int speed) {
        this.xSpeed = speed;
    }
    public void setYSpeed(int speed) {
        this.ySpeed = speed;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void make(Graphics g, int w, int h){
        this.draw(g);
        this.move();
        this.bounce(w,h);
    }

    public void draw(Graphics g){
        g.setColor(color);
        //.fillOval(x,y,size,size);
        g.drawImage(img.getImage(),x,y,size,size,null);
    }
    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }
    public void bounce(int width, int height){
        //Left
        if(x>(width-size)) {
//            xSpeed=(int)(Math.random()*2)+1;
            xSpeed=xSpeed*-1;
            if(ySpeed<0){
            ySpeed=(int)(Math.random()*2)+1;
            ySpeed=ySpeed*-1;}
        }
        //Right
        if(x<0) {
//            xSpeed=(int)(Math.random()*2)+1;
            xSpeed=xSpeed*-1;
            if(ySpeed<0){
                ySpeed=(int)(Math.random()*2)+1;
                ySpeed=ySpeed*-1;
            }
//            ySpeed=(int)(Math.random()*2)+1;
        }
        //Bottom
        if(y>(height-size)) {
//            ySpeed=(int)(Math.random()*2)+1;
            ySpeed=ySpeed*-1;
            if(xSpeed<0){
                xSpeed=(int)(Math.random()*2)+1;
                xSpeed=xSpeed*-1;}
//            xSpeed=(int)(Math.random()*2)+1;
//            xSpeed=xSpeed*-1;
//
        }
        //Top
        if(y<0) {
           // ySpeed=(int)(Math.random()*2)+1;
            ySpeed=ySpeed*-1;
            if(xSpeed<0){
            xSpeed=(int)(Math.random()*2)+1;
            xSpeed=xSpeed*-1;
            }
        }//


    }
    public boolean touching (Ball b){
        int distX = this.x - b.x;
        int distY = this.y - b.y;
        double dist = Math.sqrt(distX*distX+distY*distY);
        return dist < (this.size / 2 + b.size/2);
    }
}
