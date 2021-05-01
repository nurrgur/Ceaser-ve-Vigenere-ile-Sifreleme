package kriptografi;

public class Vigenere extends Chipher {
	
	public String encrypt(String orjinalMetin, String anahtar){
		
		String sifre = "";
        orjinalMetin = orjinalMetin.toUpperCase();
        anahtar=anahtar.toUpperCase();
        for (int i = 0, j = 0; i < orjinalMetin.length(); i++) {
            char c = orjinalMetin.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            sifre += (char)((c + anahtar.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % anahtar.length();
        }    
        return sifre;
	}
    public String decrypt(String sifreliMetin, String anahtar){
    	
    	 String orjinal = "";
    	 sifreliMetin = sifreliMetin.toUpperCase();
    	 anahtar=anahtar.toUpperCase();
         for (int i = 0, j = 0; i < sifreliMetin.length(); i++) {
             char c = sifreliMetin.charAt(i);
             if (c < 'A' || c > 'Z') continue;
             orjinal += (char)((c - anahtar.charAt(j) + 26) % 26 + 'A');
             j = ++j % anahtar.length();
         }
         
         return orjinal;
    }

}
