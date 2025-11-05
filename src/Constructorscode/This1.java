package Constructorscode;

class This1
    {
        String name;
        int age;

        This1(String name)
        {

            this.name=name;
        }

        This1(int age)
        {
            this.age=age;
        }

        void printInfo()
        {
            Print.PrintDetails(this);
        }
    }

