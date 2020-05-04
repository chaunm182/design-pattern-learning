### DAO pattern

**Data Access Object (DAO) Pattern** là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern).  Mẫu thiết kế DAO được sử dụng để phân tách logic lưu trữ dữ liệu trong một lớp riêng biệt. Theo cách này, các service được che dấu về cách các hoạt động cấp thấp để truy cập cơ sở dữ liệu được thực hiện. Nó còn được gọi là nguyên tắc Tách logic (Separation of Logic).

Ý tưởng là thay vì có logic giao tiếp trực tiếp với cơ sở dữ liệu, hệ thống file, dịch vụ web hoặc bất kỳ cơ chế lưu trữ nào mà ứng dụng cần sử dụng, chúng ta sẽ để logic này sẽ giao tiếp với lớp trung gian DAO. Lớp DAO này sau đó giao tiếp với hệ thống lưu trữ, hệ quản trị CSDL như thực hiện các công việc liên quan đến lưu trữ và truy vấn dữ liệu (tìm kiếm, thêm, xóa, sửa,…). 

#### Lợi ích của DAO:
- Giảm sự kết nối (loose coupling) giữa logic nghiệp vụ (Business) và logic lưu trữ (Persistence).

- Mẫu DAO cho phép đóng gói code để thực hiện thao tác CRUD, ngăn chặn việc implement riêng lẻ trong từng phần khác nhau của ứng dụng.

- Dễ mở rộng, bảo trì: tất cả các chi tiết lưu trữ được ẩn khỏi phần còn lại của ứng dụng. Do đó, những thay đổi có thể được thực hiện bằng cách chỉ sửa đổi một implement của DAO trong khi phần còn lại của ứng dụng không bị ảnh hưởng. DAO hoạt động như một trung gian giữa ứng dụng và cơ sở dữ liệu.

- Dễ hiểu: mọi người đều theo một quy chuẩn đã được định sẵn, nên dễ hiểu hơn, tiết kiệm được nhiều thời gian hơn.

- Trong một dự án lớn hơn, các nhóm khác nhau làm việc trên các phần khác nhau của ứng dụng, mẫu DAO cho phép phân tách rõ ràng các thành phần này.

#### Ví dụ:

![dao-pattern-uml-demo](https://github.com/minhchauptit/design-pattern-learning/blob/master/src/dao_pattern/dao-pattern-uml-demo.png?raw=true)

**_Bước 1:_** Tạo lớp thực thể Student
````
public class Student {
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
````

**_Bước 2:_** Tạo interface StudentDao
````
import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    void save(Student student);
    void update(Student student);
    void delete(Student student);
}
````

**_Bước 3:_** Tạo lớp StudentDaoImpl
````
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
````

**_Bước 4:_** Test
````
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
````

Kết quả:
````
student successfully saved
Student{id='B16DCCN001', name='Nguyễn Văn A'}
Student{id='B16DCCN002', name='Phạm Văn B'}
Student{id='B16DCCN003', name='Trần Thị C'}
student successfully deleted
````