package ys.graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class CodePanel extends JPanel{
    public void paint(Graphics g){
        int width=this.getWidth();
        int height = this.getHeight();
        //绘制背景色
        g.setColor(Color.white);
        //绘制背景
        g.fillRect(0,0,width,height);
        Random random = new Random();
        int randNum=random.nextInt(8999)+1000;
        String randStr= String.valueOf(randNum);
        //设置绘制字符的颜色
        g.setColor(Color.black);
        //设置字体
        g.setFont(new Font("",Font.PLAIN,this.getHeight()));
        g.drawString(randStr,0,this.getHeight());
        //绘制干扰点
        for(int i=0;i<300;i++){
            int x=random.nextInt(width);
            int y=random.nextInt(height);
            g.drawOval(x,y,1,1);
        }
    }
}
public class DrawString extends JFrame{
    private CodePanel cp=new CodePanel();
    DrawString(){
        this.add(cp);
        this.setSize(100,70);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawString();
    }

}
