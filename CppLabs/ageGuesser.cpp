#include <iostream>
using namespace std;
int main() 
{
	int age;
	char playAgain;
	do 
	{
		cout << "Guess how old Geroge Washington was when he died: ";
		cin >> age;
		cout << "Your guess was: " << age << endl;
		while (age != 67) 
		{
			cout << "Sorry, wrong answer. Try again: ";
			cin >> age;
			cout << "Your guess was: " << age << endl;
		}
		
		cout << "You guessed correctly!" << endl;
		cout << "Would you like to play again? Type 'y' for yes or 'n' for no:" << endl;
		cin >> playAgain;
		
	} while (playAgain == 'y');
	
	cout << "Goodbye." << endl;
	
}
