public class Reverse_string {

    public static void main (String args[]){
        String name="Rakhi Dharmani";
        String reverseStr="";
        int length=name.length();
        for (int i=length-1; i>=0; i--){
            reverseStr = reverseStr + name.charAt(i);
        }
        System.out.println("Reversed String:"+reverseStr);
    }
}
