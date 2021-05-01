package kriptografi;

public class Ceaser extends Chipher{
	int i,j,k;
	char [] alfabe = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static char[] sezarDizisi;
	
	public String encrypt(String orjinalMetin, String anahtar){
		int oteleme= anahtar.length();
		String orjinalMetinCsr = orjinalMetin.toLowerCase();
	    char[] sezarDizisi = orjinalMetinCsr.toCharArray();
		k=sezarDizisi.length;
		for(i=0;i<k;i++)
		{
			for(j=0;j<26;j++){
			
			if(sezarDizisi[i]==alfabe[j]){
				j=j+oteleme;
				j=j % 26;
				sezarDizisi[i]=alfabe[j];
				break;	
			}
		    }
		}
        String sifreliMetin = String.valueOf(sezarDizisi);  
		return sifreliMetin;
	}
	
    public String decrypt(String sifreliMetin, String anahtar){
    	int oteleme= anahtar.length();
    	char[] orjinalMetin = sifreliMetin.toCharArray();
    	k=orjinalMetin.length;
    	
    	for(i=0;i<k;i++)
		{
			for(j=0;j<26;j++){
			
			if(orjinalMetin[i]==alfabe[j]){
				j=j-oteleme;
				j=j % 26;
				orjinalMetin[i]=alfabe[j];
				break;	
			}
		    }
		}
        String orjinal = String.valueOf(orjinalMetin);     
		return orjinal.toUpperCase();
    	
    	
    }

}
