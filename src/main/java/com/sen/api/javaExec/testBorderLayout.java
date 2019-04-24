package com.sen.api.javaExec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testBorderLayout {
    JFrame frame;
    public testBorderLayout(){
        frame=new JFrame("这是borderLayout，分为东南西北中五个区域");
        Image image=Toolkit.getDefaultToolkit().createImage("a1.jpg");
        frame.setIconImage(image);//把图片添加到标题栏
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
        frame.setContentPane(createContentPane());//创建ContentPane
        frame.setLocation(400,250);//设置窗口弹出的位置
        frame.setSize(300, 250);//设置窗口的大小
        frame.setVisible(true);//设置组件可见
    }

    private Container createContentPane() {
        Container contentPane=new Container();
        //将窗口版面设置为BorderLayout，并设置内部组件间的水平距离为5像素，垂直为10像素
        contentPane.setLayout(new BorderLayout(5, 10));
        JPanel[] panel=new JPanel[5];//创建面板对象
        for(int i=0; i<panel.length;i++){
            panel[i]=new JPanel();
            panel[i].setBackground(Color.red);
        }
        contentPane.add(panel[0],BorderLayout.EAST);//将组件放在指定区域
        contentPane.add(panel[1],BorderLayout.SOUTH);//将组件放在指定区域
        contentPane.add(panel[2],BorderLayout.WEST);//将组件放在指定区域
        contentPane.add(panel[3],BorderLayout.NORTH);//将组件放在指定区域
        contentPane.add(panel[4],BorderLayout.CENTER);//将组件放在指定区域
        return contentPane;
    }


    public static void main(String[] args) {
        new testBorderLayout();
    }
}

