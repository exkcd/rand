#include <iostream>
using namespace std;

class Rectangle
{
private:
    double width;
    double length;

public:
    Rectangle()
    {
        width = 3.0;
        length = 5.0;
    }
    Rectangle(double newWidth, double newLength)
    {
        width = newWidth;
        length = newLength;
    }
    double getArea()
    {
        return (width * length);
    }

    double getWidth()
    {
        return width;
    }

    double getLength()
    {
        return length;
    }

    void setWidth(double newWidth)
    {
        width = newWidth;
    }

    void setLength(double newLength)
    {
        length = newLength;
    }
};

int main()
{
    Rectangle rc1;
    cout << "The width is " << rc1.getWidth() << endl;
    cout << "The length is " << rc1.getLength() << endl;
    cout << "The area is " << rc1.getArea() << endl;
    cout << endl;

    Rectangle rc2(5.0, 10.0);
    cout << "The width is " << rc2.getWidth() << endl;
    cout << "The length is " << rc2.getLength() << endl;
    cout << "The area is " << rc2.getArea() << endl;
    cout << endl;

    double inplength;
    cout << "Please input the length " << endl;
    cin >> inplength;

    Rectangle rc3(5.0, inplength);
    rc3.setLength(inplength);

    cout << "The width is " << rc3.getWidth() << endl;
    cout << "The length is " << rc3.getLength() << endl;
    cout << "The area is " << rc3.getArea() << endl;

    return 0;
}
