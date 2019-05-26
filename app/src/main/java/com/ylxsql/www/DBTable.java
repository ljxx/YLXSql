package com.ylxsql.www;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ========================================
 * <p>
 * 版 权：赵涌优选
 * <p>
 * 作 者：杨理想
 * <p>
 * 创建日期：2019-05-26  16:14
 * <p>
 * 描 述：
 * <p>
 * ========================================
 */
@Target(ElementType.TYPE) //target 表示用在什么（方法，类，或者其他）上面），此处表示放在类之上
@Retention(RetentionPolicy.RUNTIME) //声明生命周期
public @interface DBTable {

    String value();

}
