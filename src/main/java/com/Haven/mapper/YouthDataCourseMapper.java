package com.Haven.mapper;

import com.Haven.entity.YouthDataCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 每周课程id连接数据库类 YouthDataCourseMapper
 *
 * @author HavenJust
 * @date 23:02 周三 20 四月 2022年
 */

@Mapper
@Repository
public interface YouthDataCourseMapper extends BaseMapper<YouthDataCourse> {
}