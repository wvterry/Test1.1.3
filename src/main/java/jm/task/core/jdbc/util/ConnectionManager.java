package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String PASSWORD_KEY = "db.password";
    private static final String USERNAME_KEY = "db.username";
    private static final String URL_KEY = "db.url";

    private ConnectionManager(){

    }
    public  static Connection open(){
      try{
          return DriverManager.getConnection(
                  PropertiesUtil.get(URL_KEY),
                  PropertiesUtil.get(USERNAME_KEY),
                  PropertiesUtil.get(PASSWORD_KEY)
          );
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
    }
}



