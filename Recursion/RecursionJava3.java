public class RecursionJava3 {
    public static void main(String[] args) {

        mirror("Software");
    }

//    1. Write a method that prints a string passed as a parameter in the mirror.
//    Ex: Abcdefg => gfedcbA

    public static void mirror(String text){
        if(text.length()==1){
            System.out.println(text);
        }else{
            System.out.print(text.charAt(text.length()-1));
            mirror(text.substring(0, text.length()-1));
        }
    }
}
