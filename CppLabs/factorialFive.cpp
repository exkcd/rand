#include <iostream>
using namespace std;
int main()
{
 int fact = 1;
 for (int i = 5; i > 0; i--) 
 {
  fact = fact * i; 
 }
 
 cout << fact << endl;
}
