#include <iostream>
using namespace std;

int main()
{
  double vari = 4.2;
  double* pointy = &vari;

  cout << "Number: " << *pointy << endl;
  cout << "Address: " << pointy << endl;

}