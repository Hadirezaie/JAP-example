package af.mcit.springbootexample.course.jpa;

import af.mcit.springbootexample.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @Autowired
    private EntityManager entityManager;
    public void insertQuery(Course course){
        entityManager.merge(course);
    }
    public Course selectById(Integer id){
       return entityManager.find(Course.class, id);
    }

    public void deleteQuery(Integer id){
        Course course=entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
