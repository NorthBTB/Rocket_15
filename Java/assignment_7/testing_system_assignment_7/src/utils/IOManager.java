package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.ScannerUtils;

public class IOManager {
	private static final String FILE_NOT_EXISTS = "File not exists";
	private static final String WRITE_FILE_SUCCESS = "Write file success";
	private static final String READ_FILE_SUCCESS = "Read file success";

	public static String readFile(String pathFile) throws Exception {
		if (!FileManager.isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		byte[] b = new byte[1024];
		FileInputStream in = new FileInputStream(pathFile);
		int length = in.read(b);
		String output = "";
		while (length > -1) {
			String content = new String(b, 0, length);
			output += content;
			length = in.read(b);
		}
		in.close();
		return output;
	}

	public static void writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
		if (!FileManager.isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileOutputStream out = new FileOutputStream(pathFile, isContinuing);
		out.write(content.getBytes());
		out.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static void writeObject(Object object, String path, String fileName) throws Exception {
		if (!FileManager.isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		System.out.print("File name:");
		fileName = ScannerUtils.inputString();
		path = path + "\\" + fileName;
		FileOutputStream out = new FileOutputStream(path);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(object);
		out.close();
		objectOut.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static void writeObject(Object object, String path) throws Exception {
		if (!FileManager.isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileOutputStream out = new FileOutputStream(path);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(object);
		out.close();
		objectOut.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static Object readObject(String filePath) throws Exception {
		if (!FileManager.isFileExists(filePath)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileInputStream in = null;
		ObjectInputStream objectIn = null;
		try {
			in = new FileInputStream(filePath);
			objectIn = new ObjectInputStream(in);
			System.out.println(READ_FILE_SUCCESS);
			return objectIn.readObject();
		} finally {
			in.close();
			objectIn.close();
		}
	}

}
