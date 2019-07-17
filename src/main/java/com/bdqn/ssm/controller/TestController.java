package com.bdqn.ssm.controller;

import com.bdqn.ssm.error.CommonReturnType;
import com.bdqn.ssm.pojo.test.Admin;
import com.bdqn.ssm.pojo.test.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: TestController
 * @Description: 测试控制器
 * @Author: xyf
 * @Date 2019/7/17 14:05
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * @Description: 处理请求： http://localhost:8080/ssm/test/baseType?userAge=23
     * @param: [age]
     * @return: java.lang.Object
     * @Date: 2019/07/17 14:08
     */
    @RequestMapping("/baseType")
    @ResponseBody
    public Object baseType(@RequestParam(value = "userAge") int age){
//        return "age:"+age;
        return CommonReturnType.create("age:"+age);
    }

    /**
     * @Description: http://localhost:8080/ssm/test/packageType?age=34
     * @param: [age]
     * @return: java.lang.Object
     * @Date: 2019/07/17 14:22
     */
    @RequestMapping("/packageType")
    @ResponseBody
    public Object packageType(Integer age){
        return CommonReturnType.create("age:"+age);
    }

    /**
     * @Description: http://localhost:8080/ssm/test/array?GAME=王者&GAME=王者&GAME=王者
     * @param: [games]
     * @return: java.lang.Object
     * @Date: 2019/07/17 14:27
     */
    @RequestMapping("/array")
    @ResponseBody
    public Object array(@RequestParam("GAME") String[] games){
        StringBuilder stringBuilder = new StringBuilder();
        for (String game:
             games) {
            stringBuilder.append(game).append("——");
        }
        return CommonReturnType.create("games的长度:"+games.length+"——内容:"+stringBuilder);
    }

    /**
     * @Description: http://localhost:8080/ssm/test/object?name=蔡徐坤&age=23
     * @Description: http://localhost:8080/ssm/test/object?name=蔡徐坤&age=23&address1.id=2&address1.addName=北大青鸟
     * @param: [admin]
     * @return: java.lang.Object
     * @Date: 2019/07/17 14:35
     */
    @RequestMapping("/object")
    @ResponseBody
    public Object object(Admin admin, Student student){
        return CommonReturnType.create(admin.toString()+"——"+student.toString());
    }

    @InitBinder("admin")
    public void initAdmin(WebDataBinder binder){
        binder.setFieldDefaultPrefix("admin.");
    }
    @InitBinder("student")
    public void initStudent(WebDataBinder binder){
        binder.setFieldDefaultPrefix("student.");
    }

    /**
     * @Description:Boolean类型
     * @param: [bool]
     * @return: java.lang.Object
     * @Date: 2019/07/17 13:24
     */
    @RequestMapping("/bool")
    @ResponseBody
    public Object bool( Boolean bool) {
        return CommonReturnType.create(bool.toString());
    }
}
