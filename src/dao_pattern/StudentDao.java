package dao_pattern;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    void save(Student student);
    void update(Student student);
    void delete(Student student);
}
