package com.Haven.DTO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

import java.io.Serializable;

/**
 * 大学习数据面向传输类 UserYouthDataDTO
 *
 * @author HavenJust
 * @date 22:47 周三 20 四月 2022年
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserYouthDataDTO implements Serializable {

    /**
     * nid - 团委id
     */

    private String nid;

    /**
     * userid - 姓名/学号
     */

    private String userid;

    /**
     * token - 随机token
     */

    private String uuid;

    /**
     * course - 课程id
     */

    private String course;
}
