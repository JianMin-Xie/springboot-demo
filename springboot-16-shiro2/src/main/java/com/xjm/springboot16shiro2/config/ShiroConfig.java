package com.xjm.springboot16shiro2.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Panda
 * @create 2021-03-28 18:24
 */
@Configuration
public class ShiroConfig {

    //ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("webSecurityManager") DefaultWebSecurityManager webSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理
        shiroFilterFactoryBean.setSecurityManager(webSecurityManager);
        return shiroFilterFactoryBean;
    }

    //DefaultWebSecurityManager
    @Bean(name="webSecurityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();
        //关联Realm
        webSecurityManager.setRealm(userRealm);
        return webSecurityManager;
    }

    //Realm，创建Realm类，需要自定义
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }


}
