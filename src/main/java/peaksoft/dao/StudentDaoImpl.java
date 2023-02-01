package peaksoft.dao;

import org.hibernate.Session;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;

import java.util.List;

/**
 * name : kutman
 **/
public class StudentDaoImpl implements StudentDao{
    @Override
    public String saveStudent(Student student) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName()+" added...";
    }

    @Override
    public Student getStudentById(Long id) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        List<Student>students = session.createQuery("from Student ").getResultList();
        session.getTransaction();
        session.close();
        return students;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student oldStudent = session.get(Student.class,id);
        oldStudent.setFirstName(student.getFirstName());
        oldStudent.setLastName(student.getLastName());
        oldStudent.setAge(student.getAge());
        oldStudent.setEmail(student.getEmail());
        session.getTransaction().commit();
        session.close();
        return oldStudent;
    }

    @Override
    public String deleteStudentById(Long id) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName()+" drop";
    }

    @Override
    public void deleteAllStudet() {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.createQuery("delete from Student ").executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
