import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Arena extends JPanel {

    Ball pony = new Ball(0, 100, 5, 3,30, Color.RED);
    //private int ballX = 0;
    //private int ballY = 0;
    Ball pony2 = new Ball(10, 10, 1, 5, 23, Color.PINK);
    /*Ball a = new Ball(0, 100, 7, 1,3, Color.RED);
    Ball b = new Ball(0, 100, 3, 3,9, Color.RED);
    Ball c = new Ball(0, 100, 45, 23,3, Color.RED);
    Ball d = new Ball(0, 100, 54, 32,1, Color.RED);
    Ball e = new Ball(0, 100, 65, 32,30, Color.RED);
    Ball f = new Ball(0, 100, 55, 8,30, Color.RED);
    Ball h = new Ball(0, 100, 5, 3,30, Color.RED);
    Ball i = new Ball(0, 100, 25, 37,30, Color.RED);
    Ball j = new Ball(0, 100, 52, 35,30, Color.RED);
    Ball k = new Ball(0, 100, 56, 3,30, Color.RED);
    Ball l = new Ball(0, 100, 5, 32,30, Color.RED);
    Ball m = new Ball(0, 100, 25, 3,30, Color.RED);
    Ball n = new Ball(0, 100, 5, 31,30, Color.RED);
    Ball o = new Ball(0, 100, 5, 34,30, Color.RED);
    Ball p = new Ball(0, 100, 325, 3,30, Color.RED);
    Ball q = new Ball(0, 100, 53, 3,30, Color.RED);
    Ball r = new Ball(0, 100, 51, 3,30, Color.RED);
    Ball s = new Ball(0, 100, 15, 3,30, Color.RED);
    Ball t = new Ball(0, 100, 5, 32,30, Color.RED);
    Ball u = new Ball(0, 100, 53, 32,30, Color.RED);
     */

    ArrayList<Ball> balls = new ArrayList<>();


    public Arena(){
            setBackground(Color.blue);
        for(int i =0; i<20; i++){
            balls.add(new Ball(0, 100, 53, ((int)(Math.random()*20)), ((int)Math.random()*20), Color.RED));
        }
    }


    @Override
    public void paintComponent(Graphics g){
        pony.make(g,this.getWidth(),this.getHeight());
        pony2.make(g,this.getWidth(),this.getHeight());
        for (Ball ball : balls) {
            ball.make(g, this.getWidth(), this.getHeight());
        }
        /*a.make(g,this.getWidth(),this.getHeight());
        b.make(g,this.getWidth(),this.getHeight());
        c.make(g,this.getWidth(),this.getHeight());
        d.make(g,this.getWidth(),this.getHeight());
        e.make(g,this.getWidth(),this.getHeight());
        f.make(g,this.getWidth(),this.getHeight());
        h.make(g,this.getWidth(),this.getHeight());
        i.make(g,this.getWidth(),this.getHeight());
        j.make(g,this.getWidth(),this.getHeight());
        k.make(g,this.getWidth(),this.getHeight());
        l.make(g,this.getWidth(),this.getHeight());
        m.make(g,this.getWidth(),this.getHeight());
        n.make(g,this.getWidth(),this.getHeight());
        o.make(g,this.getWidth(),this.getHeight());
        p.make(g,this.getWidth(),this.getHeight());
        q.make(g,this.getWidth(),this.getHeight());
        r.make(g,this.getWidth(),this.getHeight());
        s.make(g,this.getWidth(),this.getHeight());
        t.make(g,this.getWidth(),this.getHeight());
        u.make(g,this.getWidth(),this.getHeight());
        */

//

//Pausing the computer
        try {
            Thread.sleep(100);
        }
        catch(Exception e) {
        }
        repaint();
    }
}





