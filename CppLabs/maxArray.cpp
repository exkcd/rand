#include <iostream>
using namespace std;

double findMax(double arr[], double n) // n is used to find the size of the array b/c param "arr" is empty.
{
  double max = 0; // init max value
  for (int i = 0; i < 5; i++)
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }

  return max;
}

int main() 
{
  double values[5] = {5, 1337, 10, 4, 17}; // array used
  
  cout << findMax(values, 5) << endl; //the 5 is used to determine the size of the array.
}