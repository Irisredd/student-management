package com.sake.studentmanagement;

import com.sake.studentmanagement.dao.StudentDao;
import com.sake.studentmanagement.entity.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentDao dao = new StudentDao();

        while (true){
            System.out.println("==========学生管理系统==========");
            System.out.println("1.添加学生");
            System.out.println("2.查询全部学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("0.退出");
            System.out.println("请选择：");

            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.print("请输入姓名：");
                    String name = scanner.nextLine();
                    System.out.print("请输入年龄：");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("请输入专业：");
                    String major = scanner.nextLine();
                    dao.add(new Student(name,age,major));
                    break;
                case "2":
                    List<Student> list = dao.findAll();
                    if (list.isEmpty()){
                        System.out.println("暂无学生数据");
                    }else {
                        for (Student s :list){
                            System.out.println(s);
                        }
                    }
                    break;
                case "3":
                    System.out.println("请输入要修改的学生id：");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.println("请输入新姓名：");
                    String newName = scanner.nextLine();
                    System.out.println("请输入新年龄：");
                    int newAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("请输入新专业：");
                    String newMajor = scanner.nextLine();

                    Student s = new Student(newName,newAge,newMajor);
                    s.setId(updateId);
                    dao.update(s);
                    break;
                case "4":
                    System.out.println("请输入要删除的学生id：");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    dao.delete(deleteId);
                    break;
                case "0":
                    System.out.println("再见！");
                    return;
                default:
                    System.out.println("无效选项，请重新输入");
            }
            System.out.println();
        }


    }
}