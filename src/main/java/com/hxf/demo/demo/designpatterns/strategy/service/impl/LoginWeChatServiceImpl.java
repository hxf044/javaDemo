package com.hxf.demo.demo.designpatterns.strategy.service.impl;

import com.hxf.demo.demo.designpatterns.strategy.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * LoginWeChatServiceImpl
 * </p>
 *
 * @author hechengxi@iqingka.com
 * @date 2020年04月17日 17:55
 */
@Slf4j
@Service
public class LoginWeChatServiceImpl implements LoginService {

    @Override
    public void checkUser() {
        log.info("微信用户校验完成");
    }
}
