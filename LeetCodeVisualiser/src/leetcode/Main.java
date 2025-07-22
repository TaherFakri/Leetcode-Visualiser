package leetcode;


import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackerGUI gui = new TrackerGUI();
            gui.createAndShowGUI();
        });
    }
}
