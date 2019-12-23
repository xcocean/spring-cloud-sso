# spring-cloud-sso
单点登陆：技术栈`spring cloud oauth2`+`redis`+`mysql 8.0.18`  
简书文章：springcloud-sso单点登陆(一)：https://www.jianshu.com/p/80b125ea8e76  
springcloud-sso单点登陆(二)：https://www.jianshu.com/p/074653aaa405  
# 调用方法
启动起两个项目：oauth2-server、business-user
#### 未带token访问  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p1.png)
#### 获取用户账号的token  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p2.png)
#### 带上token访问user/**  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p3.png)
#### 带上user的token访问admin/**  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p4.png)
#### 获取admin用户的token  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p5.png)
#### 使用admin权限访问admin/**  
![获取令牌.png](https://github.com/xcocean/spring-cloud-sso/blob/master/SQL/p6.png)
