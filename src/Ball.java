import java.awt.*;
public class Ball {

    private int x,y,xSpeed, ySpeed, size;
    private Color color;



    public Ball(){
        this.x=(int)(Math.random()*200)+10;
        this.y=(int)(Math.random()*200)+10;
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
        g.fillOval(x,y,size,size);
    }
    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }
    public void bounce(int width, int height){
        if(x>(width-size)) {
            xSpeed=xSpeed*-1;
        }
        if(x<0) {
            xSpeed=xSpeed*-1;
        }
        if(y>(height-size)) {
            ySpeed=ySpeed*-1;
        }
        if(y<0) {
            ySpeed=ySpeed*-1;
        }
    }
}
