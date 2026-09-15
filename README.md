# Student Management System（学生管理系统）

我的第一个 Java 项目：基于控制台的 CRUD 练习，Java 程序通过 JDBC 操作 MySQL 数据库。

## 技术栈
- Java 17
- MySQL 8.0
- JDBC / Maven / Git

## 功能
- 添加学生
- 查询全部学生
- 修改学生信息
- 删除学生

## 如何运行
1. 创建数据库：执行 `CREATE DATABASE student_db;` 并建表 student（字段：id, name, age, major）
2. 复制 `src/main/resources/db.properties.example` 为 `db.properties`，填入你的 MySQL 账号密码
3. 运行 `Main.java`

## 项目结构
- `entity` 实体类，对应数据库表
- `dao` 数据访问层，负责增删改查
- `util` 数据库连接工具