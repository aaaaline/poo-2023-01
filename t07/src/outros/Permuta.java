package outros;

public class Permuta {
    public static void Permutacao (String p, String S) {
        if (S.length() == 1) {
            System.out.print(p+S);
        } else {
            String Slinha; // cópia de S sem o caractere cópia
            String pLinha; // prefixo + o caractere Associação
            
            for (int i = 0; i < S.length(); i++) {
                SLinha = S.substring(0, i) + S.substring(i+1);
                pLinha = p + S.charAt(i);
                Permutacao(pLinha, SLinha);
            }
        }
    }
    
    public static void main (String[] args) {
        Permutacao(new String(), args[0]);
    }
}
