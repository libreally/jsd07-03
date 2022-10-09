package cn.tedu.boot02.util;


import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 工具类
 */
public class DBUtil {
    //连接池作用：控制连接数量、重用连接
    private static DruidDataSource dds;
    static {
//        1.实例化连接池
        dds = new DruidDataSource();
//        2.设置连接池的基本信息 数据库名、密码 url 初始连接数 、 最大连接数
        dds.setUsername("root");//数据库名
        dds.setPassword("root");//数据库密码
        dds.setUrl("jdbc:mysql://localhost:3306/bbsdb?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true");
        dds.setInitialSize(5);//初始连接数
        dds.setMaxActive(10);//最大连接数
    }

    /**
     * 获取数据库连接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {

        return dds.getConnection();
    }
}

