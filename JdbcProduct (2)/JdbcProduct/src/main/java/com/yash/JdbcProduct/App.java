package com.yash.JdbcProduct;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.serviceimpl.ProductServiceImpl;
import com.yash.util.JDBCUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       
      PreparedStatement jb = JDBCUtil.prapPreparedStatement("insert into productdb(productid,productname,productprice) values(?,?,?)");
   //   jb.setString(11, "Laptop");
    //  jb.executeUpdate();
         jb.setInt(1,410);
         jb.setString(2,"Bicycle");
         jb.setInt(3,1200);
         
         jb.executeUpdate();
        
      
    }
}
