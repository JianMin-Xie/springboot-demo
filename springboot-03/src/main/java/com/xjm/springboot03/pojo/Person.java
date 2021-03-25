package com.xjm.springboot03.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/**
 *
 @NotNull(message="名字不能为空")
 private String userName;
 @Max(value=120,message="年龄最大不能查过120")
 private int age;
 @Email(message="邮箱格式错误")
 private String email;

 空检查
 @Null       验证对象是否为null
 @NotNull    验证对象是否不为null, 无法查检长度为0的字符串
 @NotBlank   检查约束字符串是不是Null还有被Trim的长度是否大于0,只对字符串,且会去掉前后空格.
 @NotEmpty   检查约束元素是否为NULL或者是EMPTY.

 Booelan检查
 @AssertTrue     验证 Boolean 对象是否为 true
 @AssertFalse    验证 Boolean 对象是否为 false

 长度检查
 @Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内
 @Length(min=, max=) string is between min and max included.

 日期检查
 @Past       验证 Date 和 Calendar 对象是否在当前时间之前
 @Future     验证 Date 和 Calendar 对象是否在当前时间之后
 @Pattern    验证 String 对象是否符合正则表达式的规则

 .......等等
 除此以外，我们还可以自定义一些数据校验规则
 */
@Component //注册bean
@ConfigurationProperties(prefix = "person")
@Validated  //数据校验
@Data
public class Person {

    @Email(message="邮箱格式错误")
    private String email;

}