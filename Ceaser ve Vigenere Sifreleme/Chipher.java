package kriptografi;

abstract class Chipher {
	abstract String encrypt(String orjinalMetin, String anahtar);
	abstract String decrypt(String sifreliMetin, String anahtar);

}
