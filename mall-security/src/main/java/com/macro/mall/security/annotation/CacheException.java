package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * 自定義註解，有該註解的緩存方法會拋出異常
 * Created by macro on 2020/3/17.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
