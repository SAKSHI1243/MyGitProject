package strings;
public class ValidWord {
    public static boolean isVowel(char ch){
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
    public static boolean isValid(String word){
        boolean containsVowel=false,containsConsonant=false;
        if(word.length()<3) return false;
        for (int i = 0; i < word.length();i++) {
            if (Character.isDigit(word.charAt(i))||Character.isLetter(word.charAt(i)))  {
                if(isVowel(word.charAt(i))) containsVowel=true;
                else if(Character.isLetter(word.charAt(i)) && !isVowel(word.charAt(i))) containsConsonant=true;
            }
            else return false;
        }
        return containsVowel && containsConsonant;
    }
    public static void main(String[] args) {
        System.out.println(isValid("aEs234"));
    }
}