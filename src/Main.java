import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("BorderLands");
        stack.push("DOOM");
        stack.push("FVII");

//        System.out.println(stack.peek());
//        String myFavGame =stack.pop();
        System.out.println(stack.search("DOOM"));
//        System.out.println(myFavGame);
//        for (int i=0; i < 1000000000;i++){
//            stack.push("Fallout76");
//        }

    }
}