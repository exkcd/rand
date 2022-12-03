#include <iostream>
#include <cmath>

using namespace std;
int main() 
{
	int num1;
	int num2;
	cout << "Please enter a number: ";
	cin >> num1;
	cout << "Please enter another number: ";
	cin >> num2;
	
	cout << "First number entered: " << num1 << endl;
	cout << "Second number entered: " << num2 << endl;
	
	if (num1 > num2) 
	{
		cout << num2 << " is the smaller number." << endl;
	} else {
		cout << num1 << " is the smaller number." << endl;
	}
}
