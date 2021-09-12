package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCMySqlTest02 {
    public static void main(String[] args) throws SQLException {

        String SQL_SELECT = "select * from Cource";

        String UPDATE_SQL = "UPDATE `Datebase`.`table` AS tab SET tab.`name` = 8 WHERE tab.`id` = 1";

        String INSERT_SQL_1 = "INSERT INTO `Datebase`.`table`(`id`, `name`) VALUES ('1', 'william')";
        String INSERT_SQL_2 = "INSERT INTO `Datebase`.`table`(`id`, `name`) VALUES ('2', 'ALEX')";

        // 開始連結DB (開啟連結 open connection)
        // 重點： 打開就要記得 connection 關閉！！！！
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseName", "william", "123");

        if(conn != null){
            System.out.println("connected to the database!");
        } else {
            System.out.println("failed to make connection!");
        }

        // 創建 statement 實例
        Statement statement = conn.createStatement();
        boolean flag =  statement.execute(SQL_SELECT); //  返回 true / boolean
        System.out.println("flag:" + flag);

        int LineNumber = statement.executeUpdate(UPDATE_SQL); // 返回 1, 因為只影響了1行 （返回更新的行數）
        System.out.println("一共影響到了:" + LineNumber + "行");

        // 一個一個 添加SQL
        statement.addBatch(INSERT_SQL_1);
        statement.addBatch(INSERT_SQL_2);

        // 多個同時添加
        statement.executeBatch();

        // 關閉 connection
        conn.close();
    }
}
