package com.ohgiraffers.section02.update;

import com.mysql.cj.xdevapi.UpdateStatement;
import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class UpdateController {

    public  int updateMenu(MenuDTO menuDTO) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("updatemenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, menuDTO.getName());
            pstmt.setInt(2, menuDTO.getPrice());
            pstmt.setInt(3, menuDTO.getCode());

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }

        return result;

    }
}
