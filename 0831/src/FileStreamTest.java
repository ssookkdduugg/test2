import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) { 
		FileInputStream fis = null; 
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("cat.jpg");	
			fos = new FileOutputStream("cat2.jpg");
			
			
//			int data;
//			while((data=fis.read())!=-1) { //모든파일은 마지막에 -1이 붙는다. 
//				fos.write(data);	// -1이 아니면은 더이상 읽을 데이터가없다.
//								//news에 있는 내용들 news2에 복붙하기 
//			}
			bis = new BufferedInputStream(fis); //보조스트림 
			bos = new BufferedOutputStream(fos);
			byte[] buff = new byte[100];
			int len;
			while((len=fis.read(buff))>0) {
				//fos.write(buff,0,len);// 실제 읽어온 길이만큼만 읽기 
				//예를들어 읽어들일 크기가 950이면 100번씩 9번돌고 
				// 마지막 10번째는 읽을크기가 50이니까 
				//fos.write(buff,0,len)이라고 써줘야한다. 
				bos.write(buff,0,len);
			}
			
		}catch(IOException e ) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null) bis.close();
				if(bos!= null) bos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
