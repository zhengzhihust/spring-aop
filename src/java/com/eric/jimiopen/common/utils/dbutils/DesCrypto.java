package com.eric.jimiopen.common.utils.dbutils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class DesCrypto {
	// 8-byte Salt
	private static final byte[] salt = { (byte) 0xa9, (byte) 0x9a, (byte) 0xa8, (byte) 0xd2,
			(byte) 0x59, (byte) 0x8c, (byte) 0xc3, (byte) 0x13 };

	// Iteration count
	private static final int iterationCount = 15;

	private static Cipher getCipher(int mod, String password) throws InvalidKeySpecException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException {
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, iterationCount);
		SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
		// Prepare the parameter to the ciphers
		AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
		Cipher cipher = Cipher.getInstance(key.getAlgorithm());
		cipher.init(mod, key, paramSpec);
		return cipher;
	}

	public static String encrypt(String str, String password) {
		if (str == null || "".equals(str)) {
			return null;
		}
		try {
			// Encode the string into bytes using GBK
			byte[] utf8 = str.getBytes("GBK");
			// Encrypt
			byte[] enc = getCipher(Cipher.ENCRYPT_MODE, password).doFinal(utf8);
			// Encode bytes to base64 to get a string
			return new String(Hex.encodeHex(enc));
		} catch (BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (NoSuchPaddingException e) {
			throw new RuntimeException(e);
		} catch (InvalidKeyException e) {
			throw new RuntimeException(e);
		} catch (InvalidKeySpecException e) {
			throw new RuntimeException(e);
		} catch (InvalidAlgorithmParameterException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public static String decrypt(String str, String password) {
		if (str == null || "".equals(str)) {
			return null;
		}
		try {
			// Decode base64 to get bytes
			byte[] dec = Hex.decodeHex(str.toCharArray());
			// Decrypt
			byte[] utf8 = getCipher(Cipher.DECRYPT_MODE, password).doFinal(dec);
			// Decode using GBK
			return new String(utf8, "GBK");
		} catch (BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (NoSuchPaddingException e) {
			throw new RuntimeException(e);
		} catch (InvalidKeyException e) {
			throw new RuntimeException(e);
		} catch (InvalidKeySpecException e) {
			throw new RuntimeException(e);
		} catch (InvalidAlgorithmParameterException e) {
			throw new RuntimeException(e);
		} catch (DecoderException e) {
		}
		return null;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String result = encrypt("12345678", "000000");
		System.out.println(result);
		System.out.println(decrypt(result, "000000"));
	}
}
