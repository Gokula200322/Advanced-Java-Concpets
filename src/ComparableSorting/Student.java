package ComparableSorting;

// use comparable for natural ordering bases on rollno, employeeSalary,Age,Naming order etc - inside of the class


public class Student implements Comparable<Student> {

    String name;
    int rollNo;
    int age;

    Student(String name, int rollNo, int age ){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}
