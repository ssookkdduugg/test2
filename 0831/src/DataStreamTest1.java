import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
	double height;
	boolean married;

	Person(String name, int age, double height, boolean married) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.married = married;
	}

	@Override
	public String toString() {
		return String.format("이름:%s,나이:%d, 키:%f, 결혼여부:%s", name, age, height, (married ? "Y" : "N"));
	}
}

public class DataStreamTest1 {
	static void write(Person p) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("person.bin"); //파일명 얘로하겠다.
			dos = new DataOutputStream(fos); //보조스트림
			dos.writeUTF(p.name);
			dos.writeInt(p.age);
			dos.writeDouble(p.height);
			dos.writeBoolean(p.married);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	static Person read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		Person p = null;
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			boolean married = dis.readBoolean();
			p = new Person(name, age, height, married);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}

	static void write(List<Person> pers) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("person.bin");
			dos = new DataOutputStream(fos);
			dos.writeInt(pers.size());// 인원수 저장
			for (Person p : pers) {
				dos.writeUTF(p.name);
				dos.writeInt(p.age);
				dos.writeDouble(p.height);
				dos.writeBoolean(p.married);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	

	static List<Person> readList() {
		List<Person> pers = new ArrayList<>();
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);
			int count = dis.readInt(); //인원수
			for(int i=0; i<count; i++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				double height = dis.readDouble();
				boolean married = dis.readBoolean();
				pers.add(new Person(name, age, height, married));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
		return pers;
	}

	

	public static void main(String[] args) {// 많이 쓰는거
//		Person p1 = new Person("hong", 35,175.3, false);
//		write(p1);
//		Person p = read();
//		System.out.println(p);

		ArrayList<Person> pers = new ArrayList<>();
		pers.add(new Person("hong", 20, 173.5, false));
		pers.add(new Person("song", 30, 183.7, false));
		pers.add(new Person("gong", 40, 174.2, true));
		// 출력할 내용이 여러개일때

		//write(pers); //배열을 write함수로 넘기기 
		
		List<Person> perss = readList();
		for(Person p : perss){
			System.out.println(p);
		}

	}

}
