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
 * 创建日期：2019-05-26  16:34
 * <p>
 * 描 述：
 * <p>
 * ========================================
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DbField {

    String value();

}
