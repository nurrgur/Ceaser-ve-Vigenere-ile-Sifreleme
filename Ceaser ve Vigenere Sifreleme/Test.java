package kriptografi;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		System.out.println("Orjinal metni giriniz:");
		Scanner ometin = new Scanner(System.in);
		String metin=ometin.nextLine();
		
		System.out.println("Anahtar giriniz:");
		Scanner key = new Scanner(System.in);
		String anahtar=key.nextLine();
		
		Ceaser ceaser= new Ceaser();
		ceaser.encrypt(metin,anahtar);	
		String sifreliMetinC=ceaser.encrypt(metin, anahtar);
        ceaser.decrypt(sifreliMetinC, anahtar);
        String orjinalMetinC=ceaser.decrypt(sifreliMetinC, anahtar);
        
        System.out.println("Orjinal Metin:"+metin+",anahtar:"+anahtar+",Sifreli Metin:" +sifreliMetinC.toUpperCase());
        System.out.println("Sifreli Metin:"+sifreliMetinC.toUpperCase()+",anahtar:"+anahtar+",Orjinal Metin:" +orjinalMetinC);
        
		System.out.println("*******************************");
		
		Vigenere vgnr=new Vigenere();
		vgnr.encrypt(metin, anahtar);
		String sifreliMetinV=vgnr.encrypt(metin,anahtar);
		vgnr.decrypt(sifreliMetinV, anahtar);
		String orjinalMetinV=vgnr.decrypt(sifreliMetinV, anahtar);
		
		System.out.println("Orjinal Metin:"+metin+",anahtar:"+anahtar+",Sifreli Metin:" + sifreliMetinV);
		System.out.println("Sifreli metin:"+sifreliMetinV+",anahtar:"+anahtar+",Orjinal Metin:" + orjinalMetinV);
		

	}

}
