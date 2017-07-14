/**
 * Created by 1 on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        input();
    }

    static void input() {
        System.out.println("Type your word here:");
        String str = Logic.readFromKeyboard();
        Logic.parsingString(str);

        View.display();
    }
}
