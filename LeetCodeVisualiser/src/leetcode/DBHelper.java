package leetcode;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private static final String DB_URL = "jdbc:sqlite:leetcode.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            return null;
        }
    }

    public static List<Problem> getAllProblems() {
        List<Problem> problems = new ArrayList<>();
        String sql = "SELECT * FROM problems";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Problem p = new Problem(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("difficulty"),
                    rs.getString("status"),
                    rs.getString("notes")
                );
                problems.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching problems: " + e.getMessage());
        }

        return problems;
    }
}

