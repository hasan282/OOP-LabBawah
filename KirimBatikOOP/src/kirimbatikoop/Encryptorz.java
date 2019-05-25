package kirimbatikoop;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryptorz {
    public static String enkrip(String tulisan){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(tulisan.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++){
                sb.append(Integer.toString((byteData[i] & 0xff) * 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch(NoSuchAlgorithmException e){throw new RuntimeException(e);}
    }
}
