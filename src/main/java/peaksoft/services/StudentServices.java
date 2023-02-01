package peaksoft.services;

import peaksoft.entity.Student;

import java.util.List;

/**
 * name : kutman
 **/
public interface StudentServices {
    String saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudent();
    Student updateStudent(Long id,Student student);
    String deleteStudentById(Long id);
    void deleteAllStudet();
}
