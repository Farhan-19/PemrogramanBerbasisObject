import java.util.Scanner;
public class novelCollection {
	String judul, nulis, deskripsi;
	int year,buyPrice, sellPrice;
	Scanner scan = new Scanner(System.in);
	
	//constructor
	novelCollection(String j, String n, String d, int y, int bp){
		this.judul = j;
		this.nulis = n;
		this.deskripsi = d;
		this.buyPrice = bp;
	}
	
	void showJudul() {
			System.out.println("Judul: " + this.judul);
	}
	
	void showItemData() {
		System.out.println("Judul: " + this.judul);
		System.out.println("Nulis: " + this.nulis);
		System.out.println("Deskripsi: " + this.deskripsi);
		System.out.println("Year Out: " + this.year);
		System.out.println("Bought Price: " + this.buyPrice);
	}
	
	
	public static void main(String[] args) {
		int n = 0, x, bp, y;
		String t, w, d;
		
		Scanner scan = new Scanner(System.in);
		novelCollection[] obj = new novelCollection[3];
		
		//input novel deskriosi
		System.out.println("Input data novelnya");
		while (n < 3){
			x = n+1;
			System.out.println("Data ke " + x);
			
			System.out.print("Judul: ");
			t = scan.next();
			System.lineSeparator();
			
			System.out.print("Nulis: ");
			w = scan.next();
			System.lineSeparator();
			
			System.out.print("Deskripsi: ");
			d = scan.next();
			System.lineSeparator();
			
			System.out.print("Years Out: ");
			y = scan.nextInt();
			System.lineSeparator();
			
			System.out.print("Bought Price: ");
			bp = scan.nextInt();
			System.lineSeparator();	
			obj [n] = new novelCollection(t, w, d, y, bp);
			n++;
		}
		
		System.lineSeparator();
		System.out.println("=================");
		System.out.println("List Data: ");
		System.out.println("=================");
		for(int z = 0; z < 3; z++) {
			obj[z].showItemData();
		}
	}
}
