package com.ylxsql.www;

/**
 * ========================================
 * <p>
 * 版 权：赵涌优选
 * <p>
 * 作 者：杨理想
 * <p>
 * 创建日期：2019-05-26  16:12
 * <p>
 * 描 述：
 * <p>
 * ========================================
 */

@DBTable("tb_user")
public class User {

    @DbField("id")
    private Integer id;

    @DbField("username")
    private String userName;

    @DbField("psd")
    private String psd;

    public User(Integer id, String userName, String psd) {
        this.id = id;
        this.userName = userName;
        this.psd = psd;
    }
}
