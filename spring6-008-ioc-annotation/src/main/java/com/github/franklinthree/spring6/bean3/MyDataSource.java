package com.github.franklinthree.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Component
public class MyDataSource implements DataSource {

    // 使用@Value注解注入属性值的话，可以不提供setter方法
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;

    @Value("jdbc:mysql://mcserver.franklin3.top:3306/spring6?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8")
    private String url;

    @Value("root")
    private String username;

    @Value("123456")
    private String password;

    @Override
    public String toString() {
        return "MyDataSource{" +
                "\n\t" + "driver='" + driver + '\'' +
                ",\n\t" + "url='" + url + '\'' +
                ",\n\t" + "username='" + username + '\'' +
                ",\n\t" + "password='" + password + '\'' +
                '\n' + '}';
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
