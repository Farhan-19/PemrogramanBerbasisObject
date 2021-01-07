package com.yoman;

class People{
      String jeneng;
      double point;
      int level;

    Serang serang;
    Tendang tendang;

People(String jeneng, double point){
      this.nama = jeneng;
      this.point = point;
}
void tendang(People opponent){
      double pointendang = this.tendang.pointendang;
    System.out.println(this.jeneng + " tendang " + opponent.jeneng);
      opponent.bertahan(pointendang);
    this.point -= pointendang;
        System.out.println(this.jeneng + " mendapatkan damage " + pointendang);
}
void serang(People opponent){
      double poinserang = this.serang.poinserang;
    System.out.println(this.jeneng + " serang " + opponent.jeneng);
      opponent.bertahan(poinserang);
    this.point -= poinserang;
        System.out.println(this.jeneng + " mendapatkan damage " + poinserang);
}
void bertahan(double poinserang){
    System.out.println(this.jeneng + " mendapatkan damage " + poinserang);
}
void ekuipSerang(Serang serang){
    this.serang = serang;
}
void ekuipTendang(Tendang tendang){
    this.tendang = tendang ;
}
void show(){
    System.out.println("\njeneng : " + this.jeneng);
    System.out.println("point : " + this.point + " darah");
    this.serang.show();
    this.tendang.show();
}
}
class Serang{
    double poinserang;
      String jeneng;

    Serang(String jeneng, double poinserang){
        this.jeneng = jeneng;
          this.poinserang = poinserang;
    }
    void show(){
        System.out.println("Serang : " + this.jeneng + " , damage : " + this.poinserang);
    }
}
class Tendang{
    double pointendang;
      String jeneng;

    Tendang(String jeneng, double pointendang){
        this.jeneng = jeneng;
          this.pointendang = pointendang;
    }
    void show(){
        System.out.println("Tendang : " + this.jeneng + " , damage : " + this.pointendang);
    }
}
public class Game{
    public static void main(String[] args) {
        
People player1 = new People("Zoro",100);
People player2 = new People("Subzoro",100);

Serang pukulanmaut = new Serang("pukulanmaut",14);
Serang pukulantidakmaut = new Serang("pukulantidakmaut",6);

Tendang tendanganrendah = new Tendang("tendanganrendah",22);
Tendang tendangantinggi = new Tendang("tendangantinggi",27);

player1.ekuipSerang(pukulanmaut);
player1.ekuipTendang(tendanganrendah);
player1.show();

player2.ekuipSerang(pukulantidakmaut);
player2.ekuipTendang(tendangantinggi);
player2.show();

System.out.println("\nMulai");
System.out.println("Pertandingan Pertama");
player1.tendang(player2);
player1.show();
player2.show();
System.out.println("\nPertandingan Kedua");
player2.tendang(player1);
player1.show();
player2.show();
System.out.println("\nPertandingan Ketiga");
player1.serang(player2);
player1.serang(player2);
player1.serang(player2);
player1.show();
player2.show();
System.out.println("\nPertandingan Keempat");
player2.serang(player1);
player2.serang(player1);
player2.serang(player1);
player2.serang(player1);
player1.show();
player2.show();
System.out.println("\nSubZoro Menang!!!");
    }
}