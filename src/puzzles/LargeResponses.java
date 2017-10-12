package puzzles;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LargeResponses {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		int itr = 0, i = 0, k1 = 0, totalBytes = 0, bytesCount = 0;
		char c = 0;
		char[] charArray = new char[1000000];
		byte[] bs = new byte[4];
		FileInputStream fis = null;
		FileWriter fw = new FileWriter("E:\\filename.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			fis = new FileInputStream("E:/test.txt");
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					c = (char) b;
					if (c == '\r' || c == '\n') {
						String newString = new String(charArray);
						String[] strs = newString.split(" ");
						String last = strs[strs.length - 1];
						int bytesValue = Integer.parseInt(last);
						if (bytesValue >= 15000) {
							totalBytes = totalBytes + bytesValue;
							bytesCount++;
						}
						bw.write(bytesCount + " " + totalBytes);
						break;
					}
					charArray[itr] = c;
					itr++;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fis != null)
				fis.close();
		}
	}

}
