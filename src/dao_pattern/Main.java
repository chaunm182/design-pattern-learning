package dao_pattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoImpl();
        //save student
        Student student = new Student("B16DCCN003","Trần Thị C");
        dao.save(student);

        //get all
        List<Student> students = dao.getAll();
        for(Student s : students){
            System.out.println(s);
        }

        //delete student
        dao.delete(student);
    }
}
