#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int main()
{
	srand(time(0));
	
	for (int i = 1; i <= 4; i++ )
	{
		int num = rand() % 4 + 1;
	
		
		if (num == 1) 
		{
			cout << "This is a secret message if the number is " << num << endl;
		}
		else if (num == 2)
		{
			cout << "BOO! I was called when the number was " << num << endl;
		}
		else if (num == 3)
		{
			cout << "I was called by accident when the number was " << num << endl;
		}
		else
		{
			cout << "This is the intentional game design when the number is " << num << endl;
		}
	}
	
	return 0;
}
