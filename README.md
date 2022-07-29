### 更新简介
2022-7-29 🎉🎉🎉加入了swagger，不需要postman可以直接进入`http://localhost:8081/doc.html` 在网页端进行调试 \
2022-7-27 第一版上传

# 工程简介
相较于上个工程，本工程使用了MyBatisPlus插件，实现了接口绑定，使用更加方便；对象关系映射的改进，效率更高。\
本工程依旧采用Springboot+MySQL+MyBatisPlus基于maven完善增删改查
# Spring注解
@Bean注释指示带注释的方法产生要由 Spring 容器管理的 bean。\
例如：init-method，destroy-method，autowiring，lazy-init，dependency-check，depends-on，scope。\
@Autowired注解标记将由 Spring 的依赖项注入工具自动装配的构造函数，字段，setter 方法或 config 方法。 它是 JSR-330 @Inject注释的替代方法。\
@GetMapping注释将 HTTP GET 请求映射到特定的处理程序方法。\
它是一个组合的注释，用作@RequestMapping(method = RequestMethod.GET)的快捷方式。\
@PostMapping注释将 HTTP POST 请求映射到特定的处理程序方法。 \
它是一个组合的注释，用作@RequestMapping(method = RequestMethod.POST)的快捷方式。\
@DeleteMapping注释将 HTTP DELETE 请求映射到特定的处理程序方法。\
它是一个组合的注释，用作@RequestMapping(method = RequestMethod.DELETE)的快捷方式。\
@RequestBody注释将请求主体绑定到方法参数。 序列化/反序列化的过程由HttpMessageConverter执行。
# POSTMAN调试教程
1.获取全部数据\
GET:`localhost:8080/user/allUser`\
2.根据uid查找数据\
GET:`localhost:8080/user/findById/{{user_id}}`\
3.根据uid删除数据\
DELETE:`localhost:8080/user/deleteById/{{user_id}}`\
4.添加数据
POST:`localhost:8080/user/add`\
选择“Body-->raw-->JSON(格式)”\
```//文本框中填写
{
//例子
    "username":"xingming",
    "password":"pwd",
    "age":"nianling",
    "sex":"男",
    //因为我们代码中设置了主键uid自增长，所以无需设置uid
}
```
5.更新数据
PUT:`localhost:8080/user/update`\
选择“Body-->raw-->JSON(格式)”\
```//文本框中填写
{
//例子
    "uid":"1",//此工程根据uid来修改具体记录
    "username":"zuozhilin"
}
```
# MySQL数据库部分代码
```
create database SqlTest;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

use sqltest;
CREATE TABLE `user`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `uid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
```
