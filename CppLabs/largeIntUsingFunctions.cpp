#include <iostream>
using namespace std;
double largeInt(double num1, double num2)
{
	if (num1 > num2)
	{
		return num1;
	}
	else if (num2 > num1)
	{
		return num2;
	}
	else
	{
		cout << "An error occured." << endl;
		exit(0);
	}
}

int main()
{
	double num1, num2;
	cout << "Please type in a number: ";
	cin >> num1;
	cout << "Please type in another number: ";
	cin >> num2;
	
	cout << largeInt(num1, num2) << " is the larger integer" << endl;
}
