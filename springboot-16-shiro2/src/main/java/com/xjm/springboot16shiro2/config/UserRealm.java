package com.xjm.springboot16shiro2.config;

import com.xjm.springboot16shiro2.mapper.UserMapper;
import com.xjm.springboot16shiro2.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Panda
 * @create 2021-03-28 18:40
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权=>doGetAuthorizationInfo");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证=>doGetAuthenticationInfo");

        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        //连接真实数据库
        User user = userMapper.queryUserByName(token.getUsername());

        if (user == null) {
            return null;
        }

        //密码认证，shiro去做，不需要你做，密码加密了
        return new SimpleAuthenticationInfo("",user.getPwd(),"");
    }
}
