#前端模板
1.vali-admin
在此基础上进行二次开发

# 开发工具
1. IDEA 后端IDE
2. navicate Premium 12 数据库管理工具
3. HBuilder X 前端IDE

## 使用的框架
1. Spring Boot 后端
2. Mybatis 持久层
3. Bootstrap 前端


# 开发环境（以下均需安装）
1. JDK 1.8
2. MySQL 5.5
3. Maven

# 本地运行
1. 安装好开发环境后，将donate.sql导入数据库
2. 修改配置文件，在application.yml中将datasource中的url和账号密码修改为自己本地的数据库/账号密码
4. 在IDEA中按maven project导入该项目，左侧目录会出现部分加粗黑体字，等安装好依赖后进入test目录下的DemoApplication运行main方法即可
5. 在浏览器中输入http://localhost:8080即可访问，使用账号可查看数据库中user表。管理员账号密码为admin/1

