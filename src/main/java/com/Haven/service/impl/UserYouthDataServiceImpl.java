package com.Haven.service.impl;

import com.Haven.DTO.UserYouthDataDTO;
import com.Haven.entity.UserYouthData;
import com.Haven.entity.YouthDataCourse;
import com.Haven.mapper.UserYouthDataMapper;
import com.Haven.mapper.YouthDataCourseMapper;
import com.Haven.service.UserYouthDataService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 大学习数据服务实现类 UserYouthDataServiceImpl
 *
 * @author HavenJust
 * @date 23:22 周二 19 四月 2022年
 */

@Service
public class UserYouthDataServiceImpl implements UserYouthDataService {

    @Autowired
    private UserYouthDataMapper userYouthDataMapper;

    @Autowired
    private YouthDataCourseMapper youthDataCourseMapper;

    @Override
    public void addUserYouthData(String nid, String userid) {
        userYouthDataMapper.insert(UserYouthData.builder()
                .nid(nid)
                .userid(userid)
                .build()
        );
    }

    @Override
    public UserYouthDataDTO selectYouthDataDTO(String userid) {

        UserYouthData userYouthData = userYouthDataMapper.selectOne(
                new LambdaQueryWrapper<UserYouthData>()
                        .eq(UserYouthData::getUserid, userid)
        );

        String course = youthDataCourseMapper.selectOne(
                new LambdaQueryWrapper<YouthDataCourse>()
                        .eq(YouthDataCourse::getCourse, "course")
        ).getId();

        return UserYouthDataDTO
                .builder()
                       .course(course)
                       .userid(userYouthData.getUserid())
                       .uuid(userYouthData.getUuid())
                       .nid(userYouthData.getNid())
                .build();
    }
}