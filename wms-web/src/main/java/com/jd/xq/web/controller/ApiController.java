package com.jd.xq.web.controller;

import com.jd.xq.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: com.jd.xq.web.controller
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/7/6
 * Time: 15:45
 * Description:
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "success";
    }

}
