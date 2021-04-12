import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	private int[] list;
	private static final int size=12;
	
	public static void main(String[] args) {
		new FileError();

	}
	public FileError() {
		list=new int[size];
		for(int i=0;i<size;i++) {
			list[i]=i;
		}
		writeList();
	}
	public void writeList() {
		PrintWriter out=null;
		try {
			FileWriter f=new FileWriter("C:\\Users\\jungse\\Desktop\\new\\jo.txt");
			out=new PrintWriter(f);
			for(int i=0;i<size;i++)
				out.println("배열원소 "+i+"="+list[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.print("배열 인덱스 오류");
		}catch(IOException e) {
			System.err.print("입출력 오류");
		}
		finally{
			if(out!=null)
				out.close();
		}
	}

}









