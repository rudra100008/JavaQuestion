// Create a popup menu attached to frame, if you click within the area of frame popup menu
// will be shown. Similarly clicked on menu item show "message". "...item is selected " on
// label.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fall_4a_2022  extends JFrame {

    Fall_4a_2022(){
        JPanel panel = new JPanel();
        panel.setSize(300,200);
        panel.setVisible(true);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("item1");
        JMenuItem item2 = new JMenuItem("item2");
        JMenuItem item3 = new JMenuItem("item3");
        JMenuBar  menuBar=new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit  = new JMenu("Edit");
        JMenu view = new JMenu("View ");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem setting = new JMenuItem("Setting");
        JMenuItem exit = new JMenuItem("Exit");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        file.add(open);
        file.add(setting);
        file.add(exit);
        popupMenu.add(item1);
        popupMenu.add(item2);
        popupMenu.add(item3);
        panel.add(menuBar);
        add(popupMenu);
        add(panel);
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"MenuItem is clicked");

            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"MenuItem2 is clicked");

            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"MenuItem3 is clicked");
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                            popupMenu.show(panel, e.getX(), e.getY());
                }
            }
        });
    }

    public static void main(String[] args) {
        Fall_4a_2022 fall = new Fall_4a_2022();
        fall.setSize(400,400);
        fall.setVisible(true);
        fall.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fall.setLayout(new FlowLayout(FlowLayout.LEFT));
    }
}
