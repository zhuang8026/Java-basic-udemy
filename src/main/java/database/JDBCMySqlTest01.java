package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCMySqlTest01 {
    public static void main(String[] args) throws SQLException {

        String SQL_SELECT = "select * from Cource";

        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseName", "william", "123");

        if (conn != null) {
            System.out.println("connected to the database!");
        } else {
            System.out.println("failed to make connection!");
        }

        // 創建向數據庫發送 "已經編譯的SQL PrepareStatment 對象"
        PreparedStatement preparedStatements = conn.prepareStatement(SQL_SELECT); // 返回prepareStatement對象
        ResultSet resultSet = preparedStatements.executeQuery(); // 查詢並返回 ResultSet 結果

        // Course 是實體類 也稱為 POJO類
        List<Course> courseList = new ArrayList<Course>();

        while (resultSet.next()) { // 接口的 next() 方法用於返回給定列表中的下一個元素。
            // [1,2,3] => next() => 1 => 2 => 3
            String courseId = resultSet.getString("courseId"); // getString 是 ResultSet 提供的方法
            String subjectId = resultSet.getString("subjectId");
            String courseNumber = resultSet.getString("courseNumber");
            String title = resultSet.getString("title");
            String numOfCredits = resultSet.getString("numOfCredits");

            Course intance = new Course();
            intance.setCourseId(courseId);
            intance.setSubjectId(subjectId);
            intance.setCourseNumber(courseNumber);
            intance.setTitle(title);
            intance.setNumOfCredits(numOfCredits);

            courseList.add(intance);


        }

        System.out.println(courseList);
    }
}
