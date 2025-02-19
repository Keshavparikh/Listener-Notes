import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Arena extends JPanel {

    /*Ball pony = new Ball(0, 100, 5, 3,30, Color.RED);
    //private int ballX = 0;
    //private int ballY = 0;
    //Ball pony2 = new Ball(10, 10, 1, 5, 23, Color.PINK);
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
    private Ball me = new Ball(10,9,0,0,40,Color.red);

    public Arena(){
            setBackground(Color.blue);
            setFocusable(true);
            requestFocus();
        //for(int i =0; i<20; i++){
            //balls.add(new Ball());
     //       //balls.add(new Ball(0, 100, 2, ((int)(Math.random()*20)), (int)(Math.random()*20), Color.RED))
        //}
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==68){
                    me.setX(me.getX()+4);
                }else {
                    if (e.getKeyCode() == 65) {
                        me.setX(me.getX() - 4);
                    }
                    else{
                        if (e.getKeyCode() == 87) {
                            me.setY(me.getY() - 4);
                        }
                        else{
                            if (e.getKeyCode() == 83) {
                                me.setY(me.getY() + 4);
                            }
                        }
                    }
                }

            }
        });

    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        me.make(g, me.getX(), me.getY());
       // pony.make(g,this.getWidth(),this.getHeight());

        for (int i = 0; i < balls.size(); i++) {
            for (int j = i + 1; j < balls.size(); j++) {
                Ball ball1 = balls.get(i);
                Ball ball2 = balls.get(j);

                if (ball1.touching(ball2)) {
                    int tempXSpeed = ball1.getXSpeed();
                    int tempYSpeed = ball1.getYSpeed();


                    ball1.setXSpeed(ball2.getXSpeed());
                    ball1.setYSpeed(ball2.getYSpeed());
                    ball2.setXSpeed(tempXSpeed);
                    ball2.setYSpeed(tempYSpeed);
                }
            }
        }


        // pony2.make(g,this.getWidth(),this.getHeight());
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
            Thread.sleep(10);
        }
        catch(Exception e) {
        }
        repaint();
    }
}





