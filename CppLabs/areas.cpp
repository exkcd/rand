/*
Name: Type name here

Date: 06 November 2022

Version: 1.0

Description: Calculates the area of a geometric shape that is chosen by the user.
*/

#include <iostream>
#include <cmath> // For the power function.
using namespace std;

int main()
{
    int choice;
    do 
    {
        cout << "Geometry Calculator. Choose one of the following" << endl;

        cout << "1. Calculate the Area of a Circle" << endl;
        
        cout << "2. Calculate the Area of a Rectangle" << endl;
        
        cout << "3. Calculate the Area of a Triange" << endl;

        cout << "4. Quit" << endl;

        cout << endl;

        cout << "Enter your choice: ";

        cin >> choice;

        if (choice > 5 || choice < 1)
        {
            cout << "Not a valid choice. Please choose again.\n" << endl;
        }

    } while (choice > 5 || choice < 1); // Start of the program.

    switch (choice)
    {
        double area;
        case 1: // Area of a circle
            double radius;

            cout << "You chose to calculate the area of a circle.\n" << endl;

            do
            {
                cout << "Please enter the radius of the circle: ";
                cin >> radius;

                if (radius == 0 || radius < 1) {
                    cout << "Not a valid entry. Try again.\n" << endl;
                }
            } while (radius < 1); // Loop repeats until the conditions are satisfied.


            area = (3.14159 * pow(radius, 2));

            cout << "The area of your circle is: " << area << " units" << endl;

            break;

        case 2: // Area of a rectangle.
            double width;
            double length;

            cout << "Calculating the area of a rectangle...\n" << endl;

            do
            {
                cout << "Please enter the width of the rectangle: ";
                cin >> width;

                cout << "Please enter the length of the rectangle: ";
                cin >> length;

                if (width == 0 || width < 1 || length == 0 || length < 1) {
                    cout << "One or more entries were not valid. Try again.\n" << endl;
                }
            } while (width < 1 || length < 1); // Loop repeats until the condition is satisfied

            area = width * length;

            cout << "The area of your rectangle is: " << area << " units" << endl;

            break;

        case 3: // Area of a triangle.
            double base;
            double height;

            cout << "Area of a triangle was chosen." << endl;

            do
            {
                cout << "Please enter the base of the triangle: ";
                cin >> base;

                cout << "Please enter the height of the triangle: ";
                cin >> height;

                if (base < 1 || base == 0 || height == 0 || base < 1)
                {
                    cout << "One or more of your entries was invalid. Try again.\n" << endl;
                }
            } while (base < 1 || height < 1); // Loop repeats until the condition is satisfied.

            area = 0.5 * base * height;

            cout << "The area of your triangle is: " << area << endl;

            break;

        case 4: // User quit.
            cout << "Goodbye." << endl;
            return 0; // FOrce exit the program.

        default: // If all else fails. The code should not reach this statement ever. If it does, it broke somehow, and I don't know how.
            cout << "For some reason you reached this statement." << endl;
            break;
    }
}