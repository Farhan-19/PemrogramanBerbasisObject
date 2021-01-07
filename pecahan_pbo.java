package pecahanpemrogramanberorientasiobject;

public class Pecahanpemrogramanberorientasiobject {
    public int pembilang, penyebut;
    private Objek e2;
    public int getpembilang() {
        return pembilang;
    }
    public int getpenyebut() {
        return penyebut;
    }
    Pecahanpemrogramanberorientasiobject(int pembilang, int penyebut) {
        this.penyebut = penyebut;
        this.pembilang = pembilang;
    }
    public Pecahanpemrogramanberorientasiobject tambah(Pecahanpemrogramanberorientasiobject x){
        int datake1, datake2;
        
        Pecahanpemrogramanberorientasiobject f1;
        f1 = x;
        datake1 = x.penyebut;
        datake2 = x.pembilang;
        Pecahanpemrogramanberorientasiobject e2 = new Pecahanpemrogramanberorientasiobject(2, 4);
        
        System.out.println("objekobjek : ");
        System.out.println(+e2.getpembilang());
        System.out.println("/");
        System.out.println(+e2.getpenyebut());
        System.out.println();
            x.penyebut = datake1 * e2.penyebut;
            x.pembilang = e2.penyebut*datake2 + datake1*e2.pembilang;
            return x;
    }
    public static void main(String[] args) {
        Pecahanpemrogramanberorientasiobject x;
        int a, b;
        Pecahanpemrogramanberorientasiobject f1 = new Pecahanpemrogramanberorientasiobject(5, 7);
        System.out.print("objek1 : ");
        System.out.print(+f1.getpembilang());
        System.out.print("/");
        System.out.print(+f1.getpenyebut());
        System.out.println();
        //pecahan hasil = new pecahan(x, y);
        x = f1.tambah(f1);
        a = x.pembilang;
        b = x.penyebut;
        System.out.print( "hasilnya : " +a);
        System.out.print("/");
        System.out.print(+b);
        System.out.println();
        
    }
}