//tempat file disimipan
//package chatSingkat;
//untuk menggunakan objek dan method yang ada didalam class io
import java.io.*;
//untuk menggunakan objek dan method yang ada didalam class Scanner
import java.util.Scanner;
//class orang kedua
class CS2 {
	//objek scan yang digunakan untuk mendapat inputan
	Scanner scan = new Scanner(System.in);
	//nama file
	String nFile;
	//deklrasai constructor dengan parameter String
	CS2(String nFile) {
		//inisialisai nama File
		this.nFile = nFile;
		//try dan catch untuk mengatasi jika terjadi exception
		try {
			//mengambil File
			File file = new File(nFile+".txt");
			//File dimasukkan kedalam objek fr
			FileReader fr = new FileReader(file);
			//br berfungsi untuk membaca objek fr
			BufferedReader br = new BufferedReader(fr);
			String line;
			System.out.println("Chat dari Fuad");
			//while dan br.readLine() digunakna untuk membaca file
			//dan memunculkannya di dalam console
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			//membuat objek filewriter 
			FileWriter fw = new FileWriter("CS2.txt");
			//membuat objek pw untuk menulis di objek fw
			PrintWriter pw = new PrintWriter(fw);
			System.out.println("Pesan ke Fuad");
			//pw.println() adalah method untuk menulis ke dalam file
			pw.println(scan.nextLine());
			//pw.close dan br.close, menandakan objek diatas sudah tidak dipakai
			pw.close();
			br.close();
		} catch (IOException e) {
			//jika terjadi kesalahan seputar io maka akan muncul
			System.out.println("KESALAHAN");
		}
	}
}
