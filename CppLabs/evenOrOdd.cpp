#include <iostream>
using namespace std;
int main()
{
	int num;
	cout << "Please enter an integer: ";
	cin >> num;
	cout << "Your integer was: " << num << endl;
	
	if (num % 2 == 0)
	{
		cout << "Your number is even." << endl;
	} else
	{
		cout << "Your number is odd." << endl;
	}
}
