package ys.jdbc.student;

public class TestInsert {
    public static void main(String[] args) {
        Student student=new Student("yangshen",20,"cs",1);
        StudentDao studentDao=new StudentDao();
        studentDao.insert(student);
    }
}
