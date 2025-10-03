package application;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame();
        JButton  ok = new JButton();
        JButton  ok1 = new JButton("ok1");
        ok.setText("ok") ; 
        frame.add(ok) ;
        frame.setVisible(true);
        frame.add(ok1);
        frame.setVisible(true);
    }

}