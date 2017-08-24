import java.util.Scanner;

public class Crypto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello user, this is the encryptor. Please enter the phrase you would like to encrypt \n");
        String phrase = input.nextLine();
        phrase = (normalize(phrase));
        phrase = (obfuscate(phrase));
        System.out.println(unobfuscate(phrase));



/*
        System.out.print("Which method from the following list would you like to use? ");
        String[] TypeCryptos = new String[5];
        TypeCryptos[0] = "normalize";
        TypeCryptos[1] = "obfuscate";
        TypeCryptos[3] = "unobfuscate";
        TypeCryptos[4] = "Caesar";
        TypeCryptos[5] = "groupify";
        */
    }

    public static String normalize(String phrase) {
        phrase = phrase.replaceAll("\\s", "");
        phrase = phrase.replaceAll("\"", "");
        phrase = phrase.replaceAll("\\!", "");
        phrase = phrase.replaceAll("\\?", "");
        phrase = phrase.replaceAll("[()]", "");

        String regx = ".,:;'";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            phrase = phrase.replace("" + c, "");
            }

        phrase = phrase.toUpperCase();
        return phrase;
        }

    public static String obfuscate(String phrase){
        char[] ph = phrase.toCharArray();
        String vow = "AEIOU";
        char[] vowels = vow.toCharArray();
        String newPhrase = "";

        int i;
        int n;
        for (i=0; i<ph.length;i++) {
            for (n = 0; n < vowels.length; n++) {
                if (vowels[n] == ph[i]) {
                    newPhrase += "OB"; }


            }
            newPhrase += ph[i];
        }
        System.out.println(newPhrase);
        return newPhrase;
    }



    public static String unobfuscate(String phrase){
        int n;
        String newPhrase = "";
        char [] ph = phrase.toCharArray();
        for (n=0; n<ph.length; n++){
            if(String.valueOf(ph[n]).equals("O") &&
                    String.valueOf(ph[n+1]).equals("B")){
                newPhrase+="";
                n+=1;}
            else{ newPhrase+=ph[n];}
        }
        return newPhrase;
    }





}

