#include <iostream>
using namespace std;
int main()
{
	
	// Pointers are memory references to variables.
	
 	string food = "Pizza"; // init the string.
	string* pointer = &food; // init the pointer
	
	cout << food << endl; // prints the VALUE of the string
	cout << &food << endl; // prints the POINTER of the string
	
	cout << pointer << endl; // also prints the POINTER of the string
	cout << *pointer << "\n" << endl; // prints out the pointer of the POINTER which is the string
}
