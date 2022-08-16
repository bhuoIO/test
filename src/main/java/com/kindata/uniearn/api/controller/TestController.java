package com.kindata.uniearn.api.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhiweiwen
 * @Date 2022/8/15
 * @mail 597384114@qq.com
 **/
@Api(value = "测试", tags = "测试")
@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {

    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/info")
    public JSONObject getHomeInfo() {
        JSONObject ob = new JSONObject();
        ob.put("a","fdf");
        return ob;
    }

}
