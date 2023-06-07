package automate.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class DiskStorageServiceImpl implements StorageService {
	/*
	 * This is a Spring Component class that implements the StorageService
	 * interface. It provides methods for storing, loading, and deleting files from
	 * disk.
	 */
	@Value("${disk.upload.basepath}")
	private String BASEPATH;

	/*
	 * The class has a private BASEPATH variable which is set through a
	 * Spring @Value annotation, which reads a value from a configuration file or
	 * system environment variable.
	 */
	@Override
	public List<String> loadAll() {
		File dirPath = new File(BASEPATH);
		return Arrays.asList(dirPath.list());
	}

	/**
	 * The loadAll() method returns a list of all the files in the base path
	 * directory. It creates a File object representing the base path directory and
	 * calls the list() method on it, which returns an array of file names in the
	 * directory. The array is then converted to a list using Arrays.asList() method
	 * and returned.
	 *
	 */
	@Override
	public String store(MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		String ext = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		System.out.println(ext);
		String fileName = UUID.randomUUID().toString().replaceAll("-", "") + ext;
		File filePath = new File(BASEPATH, fileName);
		try (FileOutputStream out = new FileOutputStream(filePath)) {
			FileCopyUtils.copy(file.getInputStream(), out);
			return fileName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * The store() method takes a MultipartFile object, which is the file to be
	 * stored. It generates a unique filename based on the original filename and the
	 * UUID class. It saves the file to the base path directory using
	 * FileOutputStream. It returns the generated filename if the file was
	 * successfully stored, otherwise it returns null.
	 */
	/*
	 * The store method might throw the following exceptions:
	 *
	 * IOException: If there is an error while reading or writing the file.
	 * NullPointerException: If the file parameter is null. IllegalStateException:If
	 * the BASEPATH variable is not initialized properly or if the file is not found
	 * in the specified location.
	 *
	 */
	@Override
	public Resource load(String fileName) {
		File filePath = new File(BASEPATH, fileName);
		if (filePath.exists())
			return new FileSystemResource(filePath);
		return null;
	}

	/**
	 * The load() method takes a filename as input, constructs a file path using the
	 * base path directory and the given filename, and returns a FileSystemResource
	 * object if the file exists, otherwise it returns null.
	 */

	@Override
	public void delete(String fileName) {
		File filePath = new File(BASEPATH, fileName);
		if (filePath.exists())
			filePath.delete();
	}
	/**
	 * The delete() method takes a filename as input, constructs a file path using
	 * the base path directory and the given filename, and deletes the file if it
	 * exists.
	 */

}
