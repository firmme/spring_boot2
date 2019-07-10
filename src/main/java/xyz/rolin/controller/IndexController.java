package xyz.rolin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.rolin.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: txl
 * DateTime: 2019/7/9 10:53
 * Description:
 */
@RestController
public class IndexController {


    @RequestMapping(path = "/hello", method = RequestMethod.POST)
    @ResponseBody
    public List<User> index(String str) {

        System.out.println(str);



        ArrayList<User> list = new ArrayList<>();

        return list;
    }

    @RequestMapping(path = "index")
    public String index() {
        return "index";
    }
}