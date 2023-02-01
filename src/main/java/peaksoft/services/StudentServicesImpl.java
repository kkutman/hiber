package peaksoft.services;

import peaksoft.dao.StudentDaoImpl;
import peaksoft.entity.Student;

import java.util.List;

/**
 * name : kutman
 **/
public class StudentServicesImpl implements StudentServices{
    StudentDaoImpl studentDao = new StudentDaoImpl();
    @Override
    public String saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return studentDao.updateStudent(id,student);
    }

    @Override
    public String deleteStudentById(Long id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public void deleteAllStudet() {
    studentDao.deleteAllStudet();
        System.out.println("delte all");
    }
}
