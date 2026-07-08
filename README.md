# MySpringCloud
> 个人练习项目

### 1. Maven 使用
- `mvn clean` 清理
- `mvn package` 打包
- `mvn install` 构建

### 2. 注意点
#### Eureka
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```
- eureka 的 `defaultZone` 在本地优先使用 `127.0.0.1`
- 关键注解 - 启动类：`@SpringBootApplication` `@EnableEurekaServer`

#### 网关
```
<!-- 不要添加 spring-boot-starter-web 依赖 -->

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
- yml 文件中配置路由规则
- 可新增自定义 filter，对具体请求做拦截校验或改动
- 可新增自定义 config，对路由匹配做转发等
- 关键注解 - 启动类：`@SpringBootApplication` `@EnableDiscoveryClient`

#### 普通微服务
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
- 启动类须放在 package 中，否则会有`Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.`错误
- 关键注解 - 启动类：`@SpringBootApplication` `@EnableDiscoveryClient`
- 关键注解 - Controller层：`@RestController` `@RequestMapping` `@GetMapping` `@PostMapping`

#### OpenFeign
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
- yml 文件中可配置超时时间：`connectTimeout # 连接超时时间` `readTimeout # 请求处理超时时间`
- 关键注解 - 启动类：`@EnableFeignClients` `@SpringBootApplication` `@EnableDiscoveryClient`
- 关键注解 - Controller层：`@RestController` `@RequestMapping` `@GetMapping` `@PostMapping`
- 关键注解 - Service层（注意这是接口）：`@Component` `@FeignClient(value = "xxx")`