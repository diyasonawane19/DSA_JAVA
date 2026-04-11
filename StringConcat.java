package String;

public class StringConcat {
    public static void main(String[] args) {

        String firstName = "Diya";
        String lastName = "Sonawane";
        String fullName = firstName + " " + lastName;
        System.out.println( fullName);
        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //compare two strings

        String n1 = "Diya";
        String n2 = "Diya";

        if(n1.compareTo(n2)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        String sent = "Hello Myself Diya Sonawane";
        String name = sent.substring(13, sent.length());
        System.out.println(name);


    }
}
