import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BasicKeylogger {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Keylogger Demo");
        JTextArea area = new JTextArea();

        frame.add(area);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("keylog.txt", true));

            area.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    char c = e.getKeyChar();
                    System.out.print(c);  // Print to console
                    try {
                        writer.write(c);  // Write to file
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
