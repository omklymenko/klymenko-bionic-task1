package selenium_first_task;
/**
 * Created by Елена on 09.02.2015.
 */
public class CaesarCipher{
    public static void main(String args[]){
        int i = 0;
        String s = "ABC";
        String coder = "";
        String coderResult = "";
        String decoderResult = "";
        String[] mass = s.split("");
        System.out.println(s);
        for(i = 0; i < mass.length; i++){
            char a;
            a = mass[i].charAt(0);
            coder += (int) a+3;
        }
        for(i = 0; i < coder.length()/2; i++){
            String [] d = new String[coder.length()/2];
            d[i] = coder.substring(i*2, i*2+2);
            int f;
            f = Integer.valueOf(d[i]);
            coderResult += (char)f;
            f -= 3;
            decoderResult += (char)f;
        }
        System.out.println(coderResult);
        System.out.println(decoderResult);
    }
}
