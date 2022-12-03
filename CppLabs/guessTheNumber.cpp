#include <iostream>
using namespace std;
int main() 
{
	int guess;
	int ans = 4;
	
	cout << "Please type in a number from 1 to 5: ";
	cin >> guess;
	
	cout << "You entered: " << guess << endl;
	
	switch (guess) 
	{
		case 1: case 2: case 3: case 5:
		cout << guess << " is not the correct number" << endl;
		break;
		
		case 4:
			cout << guess << " is the correct number!" << endl;
		
		default:
			cout << "That number is out of bounds :/" << endl;
	}
}
