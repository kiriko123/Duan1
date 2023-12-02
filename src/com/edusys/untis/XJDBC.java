/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.untis;

/**
 *
 * @author tankh
 */
import java.sql.*;
public class XJDBC {
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=Duan1";
    static String username = "sa";
    static String password = "sa";
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    static{
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
        Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt;
        
        //nếu câu lệnh sql bắt đầu = { thì là thủ tục lưu 
        if(sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql);
        }
        else{
            stmt = conn.prepareStatement(sql);
        }
        for(int i = 0; i < args.length; i++){
            stmt.setObject( i+1, args[i]);
        }
        return stmt;
    }
    public static ResultSet query(String sql, Object...args) throws SQLException{
        PreparedStatement stmt = XJDBC.getStmt(sql, args);
        return stmt.executeQuery();
    }
    /**
     * hàm dùng để lấy duy nhất 1 giá trị
     * @param sql
     * @param args
     * @return 
     */
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = XJDBC.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static int update(String sql, Object...args){
        try {
            PreparedStatement stmt = XJDBC.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
