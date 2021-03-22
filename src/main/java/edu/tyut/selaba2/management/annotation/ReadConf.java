package edu.tyut.selaba2.management.annotation;

import java.lang.annotation.*;

/**
 * 读取配置文件的内容
 * @author KlenKiven
 */
@Target({ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReadConf {
    /**
     * 读取配置文件的值，通过一个key来查找
     * 这里的value就是需要的key
     *
     * @return 返回的值
     */
    String value();
}
