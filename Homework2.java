import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s1 = new Student();
        s1.setStudentId(sc.nextInt());
        s1.setName(sc.next());
        s1.setMajor(sc.next());
        s1.setPhoneNumber(sc.nextLong());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s2 = new Student();
        s2.setStudentId(sc.nextInt());
        s2.setName(sc.next());
        s2.setMajor(sc.next());
        s2.setPhoneNumber(sc.nextLong());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s3 = new Student();
        s3.setStudentId(sc.nextInt());
        s3.setName(sc.next());
        s3.setMajor(sc.next());
        s3.setPhoneNumber(sc.nextLong());

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("1번째 학생: " + s1.getStudentId() + " " + s1.getName() + " " + s1.getMajor() + " " + s1.getFormattedPhoneNumber());
        System.out.println("2번째 학생: " + s2.getStudentId() + " " + s2.getName() + " " + s2.getMajor() + " " + s2.getFormattedPhoneNumber());
        System.out.println("3번째 학생: " + s3.getStudentId() + " " + s3.getName() + " " + s3.getMajor() + " " + s3.getFormattedPhoneNumber());
    }
}

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

    void setStudentId(int studentId) { this.studentId = studentId; }
    int getStudentId() { return studentId; }

    void setName(String name) { this.name = name; }
    String getName() { return name; }

    void setMajor(String major) { this.major = major; }
    String getMajor() { return major; }

    void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }
    long getPhoneNumber() { return phoneNumber; }

    String getFormattedPhoneNumber() {
        String pStr = Long.toString(phoneNumber);
        return "0" + pStr.substring(0, 2) + "-" + pStr.substring(2, 6) + "-" + pStr.substring(6);
    }
}