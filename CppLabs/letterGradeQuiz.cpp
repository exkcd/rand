#include <iostream>
using namespace std;

int main()
{
  int grade;
  cout << "Please enter a number 0-5: ";
  cin >> grade;
  cout << "Grade: ";

  switch (grade)
    {
      case 0:
        cout << "F" << endl;
        break;
      
      case 1:
        cout << "D" << endl;
        break;

      case 2:
        cout << "C" << endl;
        break;

      case 3:
        cout << "B" << endl;
        break;
      
      case 4:
        cout << "A" << endl;
        break;

      case 5:
        cout << "A+ and extra credit has been rewarded" << endl;
        break;

      default:
        cout << "Index out of bounds." << endl;
        break;
    }

  return 0;
}