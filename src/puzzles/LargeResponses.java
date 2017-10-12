package puzzles;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LargeResponses {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		int itr = 0, i = 0;
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
						continue;
					}
					charArray[itr] = c;
					itr++;
				}
			}
			String newString = new String(charArray);
			String[] strs = newString.split(" ");
			for (int k1 = 0; k1 <= strs.length - 1; k1++) {
				bw.write(strs[k1]);
				System.out.print(strs[k1]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fis != null)
				fis.close();
		}
	}

}
