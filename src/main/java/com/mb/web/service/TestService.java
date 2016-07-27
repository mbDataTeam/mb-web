package com.mb.web.service;

import com.mb.web.dao.MytestMapper;
import com.mb.web.domain.Mytest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bill Hu on 2016/7/22.
 */

@Service
public class TestService {

    @Autowired
    MytestMapper mytestMapper;

    public Mytest getMytest(){
        return mytestMapper.selectByPrimaryKey(1);
    }
}
