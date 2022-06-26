package Algoexpert.Stack;

import java.util.Stack;
//https://www.algoexpert.io/questions/shorten-path
public class ShortenPath {
    public static void main(String[] args) {
        String str = "/foo/./././bar/./baz///////////test/../../../kappa";
        String shortPath=shorten(str);
        System.out.println(shortPath);


    }

    private static String shorten(String str) {
        String[] arrOfStr = str.split("/");
        String res="";

        //is starting with /
        boolean isStartingWithSlash=str.charAt(0)=='/';

        Stack<String> stack=new Stack<>();

        for (int i = 0; i < arrOfStr.length; i++) {

            if(arrOfStr[i].equals("") || arrOfStr[i].equals(".") || arrOfStr[i].equals("/")){

            }
            else if(arrOfStr[i].equals("..")){
                if(!stack.isEmpty()){
                    if(stack.peek().equals("..")){
                        stack.push(arrOfStr[i]);
                    }else if(stack.peek().equals("")){

                    }else{
                        stack.pop();
                    }

                }
                else{
                    if(!isStartingWithSlash){
                        stack.push(arrOfStr[i]);
                    }

                }
            }else{
                stack.push(arrOfStr[i]);
            }



        }



        Stack<String> rmStack=new Stack<>();
        while(!stack.isEmpty()){
            rmStack.add(stack.pop());
        }


        while(!rmStack.isEmpty()){
            String cl=rmStack.pop();
            if(!cl.equals("")){
                res=res+"/"+cl;
            }


        }

        if(!isStartingWithSlash){
            return res.substring(1);
        }

        if(res.length()==0){
            return "/";
        }

        return res;














    }
}
