package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;
import peaksoft.services.StudentServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        StudentServicesImpl services = new StudentServicesImpl();
       // System.out.println(services.saveStudent(new Student("kutmasaan", "kaseisasainov", 18, "ddsd@assasagmail.com")));
      //  System.out.println(services.getStudentById(1L));
      //  services.getAllStudent().forEach(System.out::println);
      //  System.out.println(services.updateStudent(2L, new Student("eldar", "kaseiinov", 20, "eldar@gmail.com")));
       // System.out.println(services.deleteStudentById(2L));
        services.deleteAllStudet();
    }
}
