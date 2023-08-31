import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		//console에 찍고 싶을때 ,깨져 나와서 string 단위로 입출력해야한다 
		//string단위가 filereader
		FileReader fis = null;
		BufferedReader br = null; //좀 더 성능좋게 하기위해서 보조스트림 
		try {
			fis = new FileReader("news.txt"); //항상 1차스트림 먼저 
			br = new BufferedReader(fis);
			int data; 
			while((data=br.read())!=-1) {
				System.out.print((char)data);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
