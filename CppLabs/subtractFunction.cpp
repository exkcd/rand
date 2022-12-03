#include <iostream>
using namespace std;

double diffNum(double &x, double &y)
{
  double diff = x - y;
  return diff;
}
int main()
{
  double n1, n2;
  double choice;

  do
    {
      cout << "Please enter a number:" << endl;
      cin >> n1;
    
      cout << "Please enter another number:" << endl;
      cin >> n2;
    
      cout << "The two numbers are:" << endl;
      cout << n1 << endl;
      cout << n2 << endl;
      cout << endl;
      cout << "Would you like to change your numbers? Type '1' for 'yes' or '2' for 'no':" << endl;
      cin >> choice;
    } while (choice == 1);

  if (choice == 2)
  {
    cout << "The difference between the two numbers are: " << diffNum(n1, n2) << endl;
  }
}