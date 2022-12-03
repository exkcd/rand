#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;
int main()
{
	srand(time(0));
	
	int num;
	
	for (int i = 0; i < 3; i++)
	{
		num = rand() % 3 + 1;
	}
	
	switch(num)
	{
		case 1:
			cout << "This is a secret message if the number is " << num << endl;
			break;
			
		case 2:
			cout << "BOO! I was called when the number is " << num << endl;
			break;
			
		case 3:
			cout << "This is the intentional game design when the number is " << num << endl;
			break;
	}
	
	return 0;
}
