import java.util.InputMismatchException;
import java.util.Scanner;

class Player {
    String name;
    String word;

    void getWordFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print(name + ">>");
        String word = scan.next();
        this.word = word;
    }
    boolean checkSuccess(String lastWord) {
        int lastIndex = lastWord.length() - 1;
        char lastChar = lastWord.charAt(lastIndex);
        char firstChar = word.charAt(0);
        if(lastChar == firstChar)
            return true;
        else
            return false;
    }
}
public class OpenChallenge {
    static Scanner scan = new Scanner(System.in);
    public static void run() {
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int num = scan.nextInt();
        Player[] player = new Player[num];
        for(int i=0; i<num; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = scan.next();
            player[i] = new Player();
            player[i].name = name;
        }

        System.out.println("시작하는 단어는 아버지입니다.");

        String lastWord = "아버지";
        int i = 0;

        while(true) {
            player[i].getWordFromUser();
            if(!(player[i].checkSuccess(lastWord))) {
                System.out.println(player[i].name + "이(가) 졌습니다.");
                break;
            }
            lastWord = player[i].word;
            i++;
            if(i == num)
                i = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다...");

        while(true) {
            try {
                run();

                while(true) {
                    System.out.print("게임을 다시 하시겠습니까(네/아니오)>>");
                    String restart = scan.next();

                    if(restart.equals("네")) {
                        System.out.println("끝말잇기 게임을 시작합니다...");
                        break;
                    }
                    else if(restart.equals("아니오")) {
                        System.out.println("끝말잇기 게임을 종료합니다...");
                        System.exit(0);
                    }
                    else {
                        System.out.println("잘못된 입력입니다.");
                    }
                }

            }
            catch(InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                scan.nextLine();
            }
        }
    }
}