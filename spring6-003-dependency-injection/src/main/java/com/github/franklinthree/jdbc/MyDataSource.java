package com.github.franklinthree.jdbc;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * 数据来源
 * 所有的数据源都要实现java规范：javax.sql.DataSource
 * 什么是数据源：能够给你提供Connection对象的，都是数据源。
 *
 * @author FranklinThree
 * @date 2023/03/01
 * @className MyDataSource
 * @see @see DataSource
 * @since 1.0.0
 */
public class MyDataSource implements DataSource {

    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
        //获取数据库连接对象的时候需要4个信息：driver，url，username，password
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
