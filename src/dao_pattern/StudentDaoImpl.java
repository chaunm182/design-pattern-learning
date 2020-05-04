package dao_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student("B16DCCN001","Nguyễn Văn A"));
        students.add(new Student("B16DCCN002","Phạm Văn B"));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
        System.out.println("student successfully saved");
    }

    @Override
    public void update(Student student) {
        //do something to update student
        System.out.println("student successfully updated");
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
        System.out.println("student successfully deleted");
    }
}
