#include <iostream>
using namespace std;
int main()
{
	int num1, num2, num3;
	cout << "Enter the first number: ";
	cin >> num1;
	cout << "Enter the second number: ";
	cin >> num2;
	cout << "Enter the third number: ";
	cin >> num3;
	cout << "Numbers entered: " << num1 << ", " << num2 << ", " << num3 << endl;
	
	if ((num1 < num2) && (num1 < num3))
	{
		cout << num1 << " is the smallest number." << endl;
	} 
	else if ((num2 < num1) && (num2 < num3))
	{
		cout << num2 << " is the smallest number." << endl;
	}
	else if ((num3 < num1) && (num3 < num2))
	{
		cout << num3 << " is the smallest number." << endl;
	} else
	{
		cout << "An error occured." << endl;
	}
}
