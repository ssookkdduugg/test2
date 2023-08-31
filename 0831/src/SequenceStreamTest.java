import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest {

	public static void main(String[] args) {
		//2개의 파일을 읽어서 하나의 파일로 만들기 
//		FileInputStream fis1 = null;
//		FileInputStream fis2 = null;
		FileOutputStream fos = null; 
		SequenceInputStream sis = null;
		Vector<InputStream> v = new Vector<>(); //vector쓰면은 파일 여러개 
		 									//합치기 가능하다. 
		try {
			v.add(new FileInputStream("news.txt"));
			v.add(new FileInputStream("test.txt"));
			sis = new SequenceInputStream(v.elements());
			//sis = new SequenceInputStream(fis1,fis2);
			fos = new FileOutputStream("total.txt"); //둘이 합친거 
			byte[] buff = new byte[1024];
			int len = 0;
			while((len=sis.read(buff))>0) {
				fos.write(buff,0,len);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(sis!=null) sis.close();
				if(fos!=null) fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
