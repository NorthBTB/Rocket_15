package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class FileManager {
	private static final String ERROR = "Error! ";
	private static final String FILE_IS_EXISTS = "File is exists";
	private static final String FILE_IS_NOT_EXISTS = "File is not exists";

	// question1 - check file is exists
	public static boolean isFileExists(String path) {
		return new File(path).exists() ? true : false;
	}

	// question2 - create new file
	public static void createNewFile(String path) throws Exception {
		if (isFileExists(path)) {
			throw new Exception(ERROR + FILE_IS_EXISTS);
		}
		System.out.println(new File(path).createNewFile() ? "Create file success" : "Create file fail");
	}

	// question3 - create new file
	public static void createNewFile(String path, String fileName) throws Exception {
		String filePath = path + "\\" + fileName;
		createNewFile(filePath);
	}

	// question4 - delete file
	public static void deleteFile(String path) throws Exception {
		if (!new File(path).exists()) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + "!");
		}
		System.out.println(new File(path).delete() ? "Delete file success" : "Delete file fail");

	}

	// question5 - check path is file or folder
	public static boolean isFolder(String path) {
		return new File(path).isDirectory() ? true : false;
	}

	// question6 - show all files in folder
	public static String[] getAllFileName(String path) throws Exception {
		if (!isFolder(path)) {
			throw new Exception("Path is not folder!");
		}
		return new File(path).list();
	}

	// question7 - copy file
	public static void copyFile(String sourceFile, String distinationPath, String newName) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + sourceFile);
		}

		String newFile = distinationPath + "\\" + newName;

		if (!isFileExists(newFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + newFile);
		}

		Files.copy(new File(sourceFile).toPath(), new File(newFile).toPath());
	}

	public static void copyFile(String sourceFile, String distinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + sourceFile);
		}

		String[] s = sourceFile.split("\\");
		String newName = s[s.length - 1];

		String newFile = distinationPath + "\\" + newName;

		if (!isFileExists(newFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + newFile);
		}

		Files.copy(new File(sourceFile).toPath(), new File(newFile).toPath());
	}

	// question8 - moving file
	public static void moveFile(String sourceFile, String distinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + sourceFile);
		}

		Files.move(new File(sourceFile).toPath(), new File(distinationPath).toPath());
	}

	// question9 - rename file
	void renameFile(String pathFile, String newName) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(ERROR + FILE_IS_NOT_EXISTS + " : " + pathFile);
		}

//		String[] s = pathFile.split("\\");
//		String oldName = s[s.length - 1];
//		String[] path = pathFile.split(oldName);
//		String newPath = "";
//		for (String x : path) {
//			newPath += x;
//		}
//		newPath += newName;

		if (isFileExists(newName)) {
			throw new Exception(ERROR + FILE_IS_EXISTS + " : " + newName);
		}

		new File(pathFile).renameTo(new File(newName));
	}

	// question10 - create new folder
	public static void createNewFolder(String newPathFolder) throws Exception {
		if (isFileExists(newPathFolder)) {
			throw new Exception(ERROR + "Folder is already exists! : " + newPathFolder);
		}
		System.out.println(new File(newPathFolder).mkdir() ? "Create folder success" : "Create folder fail");
	}

	// question11 - download file
	public static boolean downloadFile(String fileLink, String folder) throws MalformedURLException, IOException {
		File saveFolder = new File(folder);
		if (!saveFolder.exists() || !saveFolder.isDirectory()) {
			System.out.println("Path is not exists or not a folder");
			return false;
		}

		String[] s = fileLink.split("/");
		String name = s[s.length - 1];
		folder = folder + "/" + name;

		URL url = new URL(fileLink);

		URLConnection connection = url.openConnection();

		int size = connection.getContentLength();

		InputStream in = connection.getInputStream();

		FileOutputStream out = new FileOutputStream(saveFolder);
		int byteDownload = 0;
		byte[] b = new byte[1024];

		int length = in.read(b);

		while (length != -1) {
			byteDownload += length;
			System.out.println(byteDownload * 100f / size + "%");
			out.write(b, 0, length);
			length = in.read(b);
		}
		out.close();
		in.close();
		System.out.println("Download success");
		return true;

	}
}
