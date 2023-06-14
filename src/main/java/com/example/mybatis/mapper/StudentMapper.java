package com.example.mybatis.mapper;

import com.example.mybatis.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // mybatis 가 Mapper 가 붙은 클래스를 db 통신에 사용할 준비
public interface StudentMapper {
    // DML SELECT, INSERT, UPDATE, DELETE

    // INSERT INTO students (name, age, phone, email)
    // VALUES (?, ?, ?, ?);
    // CREATE
    @Insert("INSERT INTO students (name, age, phone, email)" +
            "VALUES (#{name}, #{age}, #{phone}, #{email})")
    void insertStudent(Student student);

    // SELECT * FROM students; <- 를 실행할 메소드를 만드는데
    // 복수개의 Students 를 반환하게 하는 return 타입 -> List<Student>
    // READ
    @Select("SELECT * FROM students")
    List<Student> selectStudentAll();

    @Select("SELECT * FROM students WHERE id = #{id}")
    Student selectStudent(Long id);

    // UPDATE
    @Update("UPDATE students SET" +
            "name = #{name}," +
            "age = #{age}," +
            "phone = #{phone}," +
            "email = #{email}," +
            "WHERE id = #{id}"
    )
    void updateStudent(Student student);

    // DELETE  // CRUD 완성
    @Delete("DELETE FROM students " +
            "WHERE id = #{id}")
    void deleteStudent(Long id);
}
