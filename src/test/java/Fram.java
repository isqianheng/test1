import javax.swing.*;

public class Fram {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("my jfram");
        JButton jButton = new JButton("my button");
        jButton.addActionListener(event -> System.out.println("click"));
        jFrame.add(jButton );
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
