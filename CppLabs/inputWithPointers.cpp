#include <iostream>
using namespace std;

void sum(int *a, int *b, int *f);
void changevalue(int *c, int *d, int *e);

int main()
{
  int numb1, numb2, numb3;
  cout << "Enter your first number " << endl;
  cin >> numb1;
  cout << "Enter your second number " << endl;
  cin >> numb2;
  cout << "Enter your third number " << endl;
  cin >> numb3;
  changevalue(&numb1, &numb2, &numb3);
  sum(&numb1, &numb2, &numb3);
  cout << "The new value for the first number input is " << numb1 << endl;
  return 0;
}
void changevalue(int *c, int *d, int *e)
{
  char response;
  cout << "Do you want to change the value of the first number input?" << endl;
  cout << "Enter Y for yes" << endl;
  cin >> response;
  if (response == 'y' || response == 'Y')
  {
    cout << "Enter new value " << endl;
    cin >> *c;
  }
  cout << "Do you want to change the value of the second number input?" << endl;
  cout << "Enter Y for yes" << endl;
  cin >> response;
  if (response == 'y' || response == 'Y')
  {
    cout << "Enter new value " << endl;
    cin >> *d;
  }
  cout << "Do you want to chnage the value of the third number input?" << endl;
  cin >> response;
  if (response == 'y' || response == 'Y')
  {
    cout << "Enter new value " << endl;
    cin >> *e;
  }
}

void sum(int *a, int *b, int *f)
{
  cout << "The value of the first number is " << *a << endl;
  cout << "The value of the second number is " << *b << endl;
  cout << "The value of the third number is " << *f << endl;
  cout << "The sum is " << (*a + *b + *f) << endl;
}
