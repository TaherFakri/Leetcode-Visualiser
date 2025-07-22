package leetcode;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TrackerGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    public void createAndShowGUI() {
        frame = new JFrame("LeetCode Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        String[] columnNames = {"ID", "Title", "Difficulty", "Status", "Notes"};
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        loadProblems();

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void loadProblems() {
        List<Problem> problems = DBHelper.getAllProblems();
        for (Problem p : problems) {
            model.addRow(new Object[]{
                p.getId(), p.getTitle(), p.getDifficulty(), p.getStatus(), p.getNotes()
            });
        }
    }
}
