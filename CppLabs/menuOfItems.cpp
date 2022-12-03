#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	int choice;

	double dogFood = 10.00;
	double pastaCan = 35.00;
	double aglets = 50.00;
	double abs = 1.00;

	double tax = 0.20;

	double total;

	cout << "Here is the menu of items you can purchase:" << endl;
	cout << "1: Dog treats ($10)\n"
		 << "2: Cans of pasta ($35)\n"
		 << "3: Aglets ($50)\n"
		 << "4: Anti-lock breaking system ($1)" << endl;
	cout << "Please choose one item: ";
	cin >> choice;
	cout << "You chose option " << choice << endl;

	switch (choice)
	{
	case 1:
		total = (dogFood * tax) + dogFood;
		cout << "Your total is: $" << fixed << setprecision(2) << total << endl;
		break;

	case 2:
		total = (pastaCan * tax) + pastaCan;
		cout << "Your total is: $" << fixed << setprecision(2) << total << endl;
		break;
		
	case 3:
		total = (aglets * tax) + aglets;
		cout << "Your total is: $" << fixed << setprecision(2) << total << endl;
		break;
		
	case 4:
		total = (abs * tax) + abs;
		cout << "Your total is : $" << fixed << setprecision(2) << total << endl;
		break;
		
	default:
		cout << "An error occured." << endl;
	}
	return 0;
}
