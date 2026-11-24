import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Homework9 {
    void login(){
        Map<String, String> id = new HashMap<>();
        try {
            String db_id = "", db_password="";
            Scanner s = new Scanner(new File("db.txt"));
            while (s.hasNext()){
                String line = s.nextLine();
                String delimiters = "\\s+";
                String[] tokensVal = line.split(delimiters);
                db_id= tokensVal[0];
                db_password= tokensVal[1] ;
                id.put(db_id, db_password);
            }
            s.close();
        }
        catch (Exception e){e.printStackTrace();}

        while(true) {
            Scanner sc = new Scanner(System.in);
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
        Homework9 h9 = new Homework9();
        h9.login();
    }

}