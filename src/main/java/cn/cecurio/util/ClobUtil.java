package cn.cecurio.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author: Cecurio
 * @create: 2017-11-24 0:53
 **/
public class ClobUtil {
    private static final String DRIVER_CLASSNAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ssm";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void selectByClob() throws Exception {
        Class.forName(DRIVER_CLASSNAME);
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        String insertSql = "SELECT message_id,message_title,message_body FROM ssm_message ;";
        PreparedStatement pstmt = connection.prepareStatement(insertSql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("message_title"));
            Clob clob = rs.getClob("message_body");
            System.out.println(clob.getSubString(1, (int) clob.length()));
            clob.truncate(50);
            System.out.println(clob.getSubString(1, (int) clob.length()));
            System.out.println("-----------");
        }
        rs.close();
        pstmt.close();
        connection.close();
    }

    public static void select() throws Exception {
        Class.forName(DRIVER_CLASSNAME);
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        String insertSql = "SELECT message_id,message_title,message_body FROM ssm_message ;";
        PreparedStatement pstmt = connection.prepareStatement(insertSql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("message_title"));
            StringBuffer note = new StringBuffer();
            InputStream input = rs.getAsciiStream("message_body");
            Scanner scanner = new Scanner(input);
            scanner.useDelimiter("\r\n");
            while (scanner.hasNext()) {
                note.append(scanner.next()).append("\n");
            }
            System.out.println(note.toString());
            input.close();
        }
        rs.close();
        pstmt.close();
        connection.close();
    }

    public static void insertOne() throws Exception {
        Class.forName(DRIVER_CLASSNAME);
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        String insertSql = "INSERT INTO ssm_message (message_title,message_body,create_time) VALUES (?,?,NOW())";
        PreparedStatement pstmt = connection.prepareStatement(insertSql);
        pstmt.setString(1, "first Message");
        InputStream inputStream = new FileInputStream("ascii.txt");
        pstmt.setAsciiStream(2, inputStream);
        int affectedRows = pstmt.executeUpdate();
        System.out.println(affectedRows);
        connection.close();
    }
}
