package builder.test;

public class Student {

    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    public void showInfo(){
        System.out.println("학번 :" + id);
        System.out.println("이름 :" + name);
        System.out.println("전공   :" + major);
        System.out.println("전화번호 :" + phoneNumber);

    }

    public static void main(String[] args) {
        builder.Student student = new builder.Student.Builder(1, "John Doe")
                .grade(12)
                .major("Computer Science")
                .phoneNumber("123-456-7890")
                .build();
        student.showInfo();

    }
}
