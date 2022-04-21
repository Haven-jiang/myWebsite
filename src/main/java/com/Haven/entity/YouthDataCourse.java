package com.Haven.entity;

import lombok.*;

import java.io.Serializable;

/**
 * 每星期课程面向数据库类 YouthDataCourse
 *
 * @author HavenJust
 * @date 22:57 周三 20 四月 2022年
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YouthDataCourse implements Serializable {
    /**
     * 默认既定字符串
     */
    private String course;
    /**
     * 课程id
     */
    private String id;
}
