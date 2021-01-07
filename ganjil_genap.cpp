#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <windows.h>

  using namespace std;
  class plusnminus; 
  int main()
{
  char pilihbilangan;
  do {int ang;
  cout << " Taruh Bilangan : ";
  cin >> ang;

  if (ang == 0) {
cout << "100";
}
  else  if ( ang > 0){
  if (ang % 2 == 0) {
cout << "Positif ganjil "<<endl;
}
  else{
cout << "Positif genap "<<endl;
}
  }
  else{
  if (ang % 2 == -1) {
cout << "Negatif ganjil " <<endl;
}
  else{
cout << "Negatif genap " <<endl;
}
  }
cout << " ulang ? (yes/no)" <<endl;
cin >> pilihbilangan;
cout << endl;
  }
 while (pilihbilangan =='y' , 'Y');
  }
