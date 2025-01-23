package builder.test;

public class Student {



    public static void main(String[] args) {
        builder.Student student = new builder.Student.Builder(1, "John Doe")
                .grade(12)
                .major("Computer Science")
                .phoneNumber("123-456-7890")
                .build();
        student.showInfo();

    }
}
