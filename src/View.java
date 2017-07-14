/**
 * Created by 1 on 04.07.2017.
 */
public class View {

    static String [] res = new String[10]; // static ініціалізуються перші

    static {
        for (int i = 0; i < 10; i++) {
            res[i] = "";
        }
    }

    static void createOutput(int index , String s){
        res[index] += s;
    }
    public static void display(){
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

}
