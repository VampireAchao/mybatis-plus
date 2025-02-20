<p align="center">
  <a href="https://github.com/baomidou/mybatis-plus">
   <img alt="Mybatis-Plus-Logo" src="https://raw.githubusercontent.com/baomidou/logo/master/mybatis-plus-logo-new-mini.png">
  </a>
</p>

<p align="center">
  Born To Simplify Development
</p>

<p align="center">
  <a href="https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.baomidou%22%20AND%20a%3A%22mybatis-plus%22">
    <img alt="maven" src="https://img.shields.io/maven-central/v/com.baomidou/mybatis-plus.svg?style=flat-square">
  </a>

  <a href="https://www.apache.org/licenses/LICENSE-2.0">
    <img alt="code style" src="https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square">
  </a>

  <a href="https://gitter.im/baomidou/mybatis-plus?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge">
    <img alt="Join the chat at https://gitter.im/baomidou/mybatis-plus" src="https://badges.gitter.im/baomidou/mybatis-plus.svg">
  </a>
</p>

[企业版 Mybatis-Mate 高级特性](https://gitee.com/baomidou/mybatis-mate-examples)

添加 `微信 wx153666` 备注进 mp 群

> 不允许非法项目使用，后果自负

# Special user

<p>
  <a href="http://boot.aizuda.com/?from=mp" target="_blank">
   <img alt="AiZuDa-Logo" src="https://baomidou.com/img/azd01.png" width="210px" height="75px">
  </a>
  <a href="http://aizuda.com/?from=mp" target="_blank">
   <img alt="Mybatis-Plus-Logo" src="https://baomidou.com/img/aizuda.png" width="210px" height="75px">
  </a>
</p>

## What is MyBatis-Plus?

MyBatis-Plus is an powerful enhanced toolkit of MyBatis for simplify development. This toolkit provides some efficient, useful, out-of-the-box features for MyBatis, use it can effectively save your development time.

## Links

- [Documentation](https://baomidou.com)
- [Code Generator](https://github.com/baomidou/generator)
- [Samples](https://github.com/baomidou/mybatis-plus-samples)
- [Showcase](https://github.com/baomidou/awesome-mybatis-plus)
- [企业版 Mybatis-Mate 高级特性](https://gitee.com/baomidou/mybatis-mate-examples)

## Features

-   Fully compatible with MyBatis
-   Auto configuration on startup
-   Out-of-the-box interfaces for operate database
-   Powerful and flexible where condition wrapper
-   Multiple strategy to generate primary key
-   Lambda-style API
-   Almighty and highly customizable code generator
-   Automatic paging operation
-   SQL Inject defense
-   Support active record
-   Support pluggable custom interface
-   Build-in many useful extensions

## Getting started

-   Add MyBatis-Plus dependency
    - Latest Version: [![Maven Central](https://img.shields.io/maven-central/v/com.baomidou/mybatis-plus.svg)](https://search.maven.org/search?q=g:com.baomidou%20a:mybatis-*)
    - Maven:
    - SpringBoot2
      ```xml
      <dependency>
          <groupId>com.baomidou</groupId>
          <artifactId>mybatis-plus-boot-starter</artifactId>
          <version>Latest Version</version>
      </dependency>
      ```
    - SpringBoot3
      ```xml
      <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
        <version>Latest Version</version>
      </dependency>
      ```
    - Gradle
    - SpringBoot2
      ```groovy
      compile group: 'com.baomidou', name: 'mybatis-plus-boot-starter', version: 'Latest Version'
      ```
    - SpringBoot3
      ```groovy
      compile group: 'com.baomidou', name: 'mybatis-plus-spring-boot3-starter', version: 'Latest Version'
      ```
-   Modify mapper file extends BaseMapper interface

    ```java
    public interface UserMapper extends BaseMapper<User> {

    }
    ```

- Use it
  ``` java
  List<User> userList = userMapper.selectList(
          new QueryWrapper<User>()
                  .lambda()
                  .ge(User::getAge, 18)
  );
  ```
    MyBatis-Plus will execute the following SQL
    ```sql
    SELECT * FROM user WHERE age >= 18
    ```

> This showcase is just a small part of MyBatis-Plus features. If you want to learn more, please refer to the [documentation](https://baomidou.com).

## License

MyBatis-Plus is under the Apache 2.0 license. See the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) file for details.
