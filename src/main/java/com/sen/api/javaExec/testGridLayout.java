package com.sen.api.javaExec;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class testGridLayout {
    JFrame frame;
    public testGridLayout(){
        frame=new JFrame("XX图书信息系统");
        frame.setContentPane(createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(350, 200);
        frame.setSize(400,250);
        frame.setVisible(true);
    }

    private Container createContentPane() {
        Container contentPane=new Container();
        //将窗口版面设置成2X3的表格型；并且设定组件间的水平距离为5像素，垂直为10像素
        contentPane.setLayout(new GridLayout(2,3,5,10));
        JPanel[] panel=new JPanel[5];
        for(int i=0;i<panel.length;i++){
            panel[i]=new JPanel();
            panel[i].setBackground(Color.green);
            contentPane.add(panel[i]);
        }
        return contentPane;
    }

    public static void main(String[] args) {
        new testGridLayout();
    }

}
