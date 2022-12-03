#include <iostream>
using namespace std;
int main()
{	
	int num;
	string name;
	double floaty;
	
	cout << "Hello! Welcome to the Echo Machine!" << endl;
	cout << "Pleaes enter an integer: ";
	cin >> num;
	cout << "Please enter a word: ";
	cin >> name;
	cout << "Pleaes enter a number with a decimal point: ";
	cin >> floaty;
	cout << "Your integer is: " << num << endl;
	cout << "Your word is: " << name << endl;
	cout << "Your decimal is: " << floaty << endl;
	
	return 0;
	
}
