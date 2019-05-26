package com.ylxsql.www;

import android.database.sqlite.SQLiteDatabase;

import java.io.File;

/**
 * ========================================
 * <p>
 * 版 权：赵涌优选
 * <p>
 * 作 者：杨理想
 * <p>
 * 创建日期：2019-05-26  17:15
 * <p>
 * 描 述：提供给调用者
 * <p>
 * ========================================
 */
public class BaseDaoFactory {

    private static final BaseDaoFactory instance = new BaseDaoFactory();
    private SQLiteDatabase sqLiteDatabase;

    //数据库的存储位置
    private String path;
    public static BaseDaoFactory getInstance() {
        return instance;
    }

    private BaseDaoFactory() {
        path = "/data/data/com.ylxsql.www/database/ne.db";
        //判断路径是否存在
        File file = new File(path);
        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        sqLiteDatabase = SQLiteDatabase.openOrCreateDatabase(path, null);
    }

    /**
     * 对外提供一个Api
     */
    public <T> BaseDao getBaseDao(Class<T> beanClazz) {
        BaseDao baseDao = null;

        try {
            baseDao = BaseDao.class.newInstance();
            baseDao.init(sqLiteDatabase, beanClazz);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return baseDao;
    }

}
