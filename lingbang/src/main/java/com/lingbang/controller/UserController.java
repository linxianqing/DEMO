package com.lingbang.controller;

import com.lingbang.entity.base.NetState;
import com.lingbang.mapper.User;
import com.lingbang.mapper.UserCriteria;
import com.lingbang.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
@RestController
public class UserController {
    private int state;
    @Autowired
    private NetState netState;
    @Autowired
    private UserService userService;

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public NetState register(User user) {
        UUID uuid = UUID.randomUUID();
        user.setOid(uuid.toString());
//        user.getUsername()
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userService.selectByExample(userCriteria);
        if (users.size() == 0) {
            try {
                int state = userService.insert(user);
            } catch (Exception e) {
            }

            if (state == 1) {
                netState.setData("注册成功");
            } else {
                netState.setData("注册失败");
            }
        } else {
            netState.setData("用户名已注册");
        }
        return netState;
    }

    @ApiOperation(value = "登录用户", notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    @CrossOrigin
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public NetState doLogin(@RequestBody User user) {
        if (user.getUsername().equals("admin123") && user.getPassword().equals("admin123")) {
            netState.setData("登录成功");
//            netState.setJson();
        } else {
            netState.setData("登录失败");
        }
        return netState;
    }
//    @RequestMapping(value = "/getUserName", method = RequestMethod.POST)
//    public NetState getUserName(String username) {
//        return netState;
//    }
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public NetState register(User user) {
//        if (user.getUsername().equals("admin")) {
//
//        }
//        return netState;
//    }
}
