import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        int studentId1 = sc.nextInt();
        String name1 = sc.next();
        String major1 = sc.next();
        long phonenumber1 = sc.nextLong();

        Student s1 = new Student();
        s1.setStudentId(studentId1);
        s1.setName(name1);
        s1.setMajor(major1);
        s1.setPhoneNumber(phonenumber1);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        int studentId2 = sc.nextInt();
        String name2 = sc.next();
        String major2 = sc.next();
        long phonenumber2 = sc.nextLong();

        Student s2 = new Student();
        s2.setStudentId(studentId2);
        s2.setName(name2);
        s2.setMajor(major2);
        s2.setPhoneNumber(phonenumber2);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        int studentId3 = sc.nextInt();
        String name3 = sc.next();
        String major3 = sc.next();
        long phonenumber3 = sc.nextLong();

        Student s3 = new Student();
        s3.setStudentId(studentId3);
        s3.setName(name3);
        s3.setMajor(major3);
        s3.setPhoneNumber(phonenumber3);

        String pStr1 = Long.toString(s1.getPhoneNumber());
        String formattedPhone1 = "0" + pStr1.substring(0, 2) + "-" + pStr1.substring(2, 6) + "-" + pStr1.substring(6);

        String pStr2 = Long.toString(s2.getPhoneNumber());
        String formattedPhone2 = "0" + pStr2.substring(0, 2) + "-" + pStr2.substring(2, 6) + "-" + pStr2.substring(6);

        String pStr3 = Long.toString(s3.getPhoneNumber());
        String formattedPhone3 = "0" + pStr3.substring(0, 2) + "-" + pStr3.substring(2, 6) + "-" + pStr3.substring(6);

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("1번째 학생: " + s1.getStudentId() + " " + s1.getName() + " " + s1.getMajor() + " " + formattedPhone1);
        System.out.println("2번째 학생: " + s2.getStudentId() + " " + s2.getName() + " " + s2.getMajor() + " " + formattedPhone2);
        System.out.println("3번째 학생: " + s3.getStudentId() + " " + s3.getName() + " " + s3.getMajor() + " " + formattedPhone3);
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
}