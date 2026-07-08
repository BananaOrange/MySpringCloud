# MySpringCloud
> 个人练习项目

### Maven 使用
- `mvn clean` 清理
- `mvn package` 打包
- `mvn install` 构建
### 一些注意点
- 启动类放在 package 中，否则会有`Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.`错误
- eureka 的 `defaultZone` 在本地优先使用 `localhost`