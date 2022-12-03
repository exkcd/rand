#include <iostream>
using namespace std;
int main()
{
	string favColor;
	int choice;
	
	do
	{
		cout << "Please type in your favorite color: ";
		cin >> favColor;
		cout << "Your favorite color is: " << favColor << endl;
		cout << endl;
		
		cout << "Would you like to choose a new favorite color? Type '1' for 'yes' and '0' for 'no': ";
		cin >> choice;
	} while (choice != 0 && choice == 1);
	
	cout << "Goodbye." << endl;
	return 0;
}
