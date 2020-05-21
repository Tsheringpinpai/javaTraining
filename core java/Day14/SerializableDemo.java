 import java.io.Serializable;
import java.io.*;

class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}

}

class SerializableDemo{
	public static void main(String args[]) throws Exception{
		Student rahul = new Student(1023, "rahul");
		FileOutputStream ft = new FileOutputStream("ex.txt");
		ObjectOutputStream ot = new ObjectOutputStream(ft);
		ot.writeObject(rahul);
		ot.close();
	}
}