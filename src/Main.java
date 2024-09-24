//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Null works for Arrays, Strings and Objects. It does not work for primitive data types
        String likes = null;

        try {
            System.out.println(likes);
        } catch (Exception e){
            System.out.println(e);
        }



    }
}