import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;



public class Homework8 {


    void login(){
        Scanner sc= new Scanner(System.in);
        Map<String, String> id = new HashMap<>();
        id.put("myId", "myPass");
        id.put("myId2", "myPass2");
        id.put("myId3", "myPass3");

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String input_id = sc.nextLine().trim();

            if (id.containsKey(input_id)) {
                System.out.print("password: ");
                String input_password = sc.nextLine().trim();
                if (id.get(input_id).equals(input_password)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    System.out.println();
                    continue;
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }
        }
    }

    public static void main(String[] args){
        Homework8 h8 = new Homework8();
        h8.login();
    }

}