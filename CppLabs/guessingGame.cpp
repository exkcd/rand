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
		if (age != 67)
		{
			cout << "Sorry, wrong answer. Would you like to play again? Type 'y' for yes or 'n' for no: ";
			cin >> playAgain;
		}

	} while (age != 67 && playAgain != 'n');

	if (playAgain == 'n')
	{
		cout << "Goodbye." << endl;
	}
	else if (age == 67)
	{
		cout << "You guessed it." << endl;
	}
}
