package com.sen.api.javaExec;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class testFlowLayout {
    JFrame frame;

    public testFlowLayout(){
        frame =new JFrame("xx图书信息系统");
        frame.setContentPane(createPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,250);
        frame.setLocation(400, 250);
        frame.setVisible(true);
    }

    private Container createPane() {
        Container contentPane=new Container();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
        JButton[] button=new JButton[5];
        for(int i=0;i<button.length;i++){
            button[i]=new JButton("button"+i);
            contentPane.add(button[i]);
        }
        return contentPane;
    }

    public static void main(String[] args) {
        new testFlowLayout();
    }

}


//---------------------
//        作者：love超1314的专栏
//        来源：CSDN
//        原文：https://blog.csdn.net/u013238646/article/details/51604318
//        版权声明：本文为博主原创文章，转载请附上博文链接！