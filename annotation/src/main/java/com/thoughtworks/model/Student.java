package com.thoughtworks.model;

import java.lang.annotation.*;

// 为Student类添加一个Alias注解, 表明Student类可以取一个自定义的别名
@Student.Alias("可以自定义别名")
public class Student {

    // 为age字段添加一个Limit注解, 表明age字段的最小值为1 最大值为140
    @Limit(min = 1, max = 140)
    private int age;

    public @interface Limit {
        int min();
        int max();
    }

    public @interface Alias {
        String value() default "";
    }
}