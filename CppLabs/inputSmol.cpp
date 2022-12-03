#include <iostream>
using namespace std;
int main()
{
	int amt;
	int smol = 100;
	int num;
	
	cout << "How many numbers would you like to enter? ";
	cin >> amt;

	
	if (amt >= 100)
	{
		cout << "Please don't do this..." << endl;
		return 0;
	}
	
	cout << "Entering " << amt << " numbers." << endl;
	
	for (int i = 0; i != amt; i++)
	{
		cout << "Please enter a number: ";
		cin >> num;
		
		if (num < smol)
		{
			smol = num;
		}
	}
	
	cout << "The smallest number entered was: " << smol;
	
	return 0;
}
