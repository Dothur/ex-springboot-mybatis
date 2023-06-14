package com.example.mybatis;

import com.example.mybatis.dao.StudentDao;
import com.example.mybatis.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext
				= SpringApplication.run(MybatisApplication.class, args);

		StudentDao dao = applicationContext.getBean(StudentDao.class);
		// SELECT
//		System.out.println(dao.readStudentsAll());
//
//		System.out.println(dao.readStudent(1L));
//		System.out.println(dao.readStudent(2L));
//		System.out.println(dao.readStudent(3L));
		System.out.println(dao.readAllXml());
		System.out.println(dao.readStudentXml(1L));
		System.out.println(dao.readStudentXml(2L));
		System.out.println(dao.readStudentXml(3L));

//		// INSERT
//		Student student = new Student();
//		student.setName("dave");
//		student.setAge(30);
//		student.setPhone("010-1111-2222");
//		student.setEmail("dave@gmail.com");
//		dao.createStudent(student);
//		System.out.println(dao.readStudentsAll());
//
//		for (int i = 0; i < 4; i++) {
//			dao.readStudent(i + 1L);
//		}
	}

//	String someVariable = "camelCase";
//	String some_variable = "snake_case";
}
