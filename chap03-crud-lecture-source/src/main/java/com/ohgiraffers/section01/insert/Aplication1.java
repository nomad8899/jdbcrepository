package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Aplication1 {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        /* DML (insert, update, delete) 작업시에는 반환 결과가 int 값이 된다.
        * (ResultSet을 쓰지 않는다.)
        * 기존의 조회일 때 excuteQuery()를 사용했지만, DML작업 시에는 excuteUpdate()를 사용함.*/
        int result = 0;     // DML 작업을 하면 작업이 일어난 행의 갯수를 반환(INT)

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("insertMenu");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setString(1,"봉골레청국장");
            pstmt.setInt(2,9000);
            pstmt.setInt(3,1);
            pstmt.setString(4,"Y");

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }

        System.out.println("result = " + result);
    }
}
