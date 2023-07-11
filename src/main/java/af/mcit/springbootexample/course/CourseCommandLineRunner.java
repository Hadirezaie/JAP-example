package af.mcit.springbootexample.course;

import af.mcit.springbootexample.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseRepository courseRepository;

    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insertQuery(new Course(1,"Learn Spring boot Now","FROM UDEMY"));
        repository.insertQuery(new Course(2,"Learn Spring boot Now","FROM UDEMY"));
        repository.insertQuery(new Course(3,"Learn Spring boot Now","FROM UDEMY"));
        repository.deleteQuery(1);
        System.out.println(repository.selectById(3));

    }
}
