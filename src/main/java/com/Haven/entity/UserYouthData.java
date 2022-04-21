package com.Haven.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

import java.io.Serializable;

/**
 * 青年大学习数据面向数据库类 UserYouthData
 *
 * @author HavenJust
 * @date 18:36 周二 19 四月 2022年
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserYouthData implements Serializable {

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

    @TableId(value = "uuid", type = IdType.ASSIGN_UUID)
    private String uuid;
}
