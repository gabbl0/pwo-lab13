package pwo.lab13;

public class Text {
    static boolean cont5Dig(String str){
    return str.replaceAll("[^0-9]", "").length()==5;
    }
}
