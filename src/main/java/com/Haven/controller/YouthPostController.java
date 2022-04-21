package com.Haven.controller;

import com.Haven.DTO.UserYouthDataDTO;
import com.Haven.service.UserYouthDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 青年大学习post逻辑控制类 YouthPostController
 *
 * @author HavenJust
 * @date 18:18 周二 19 四月 2022年
 */

@RestController
@RequestMapping("/function")
public class YouthPostController {

    @Autowired
    private UserYouthDataService userYouthDataService;

    @PostMapping("/jiangxi/youthlearn")
    public UserYouthDataDTO PostToken() {
        return userYouthDataService.selectYouthDataDTO("20010317");
    }
}