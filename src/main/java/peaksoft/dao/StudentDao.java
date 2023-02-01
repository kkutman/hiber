package peaksoft.dao;

import peaksoft.entity.Student;

import java.util.List;

/**
 * name : kutman
 **/
public interface StudentDao {
    String saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student>getAllStudent();
    Student updateStudent(Long id,Student student);
    String deleteStudentById(Long id);
    void deleteAllStudet();
}
