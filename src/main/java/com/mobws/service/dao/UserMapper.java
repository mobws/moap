package com.mobws.service.dao;

import com.mobws.service.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: liujn
 * @Date: 2018/8/17 17:27
 * @Description:
 */
@Mapper
public interface UserMapper {

    public ArrayList<User> listUser();

}
