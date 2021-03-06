// Assignment1_575_OOAD.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <conio.h>
#include <fstream>
#include <stdio.h>
#include <math.h>
using namespace std;

class Employee
{
public:
	char EmpId[12];
	char DeptId[5];
	double Net;

	Employee() {

	}
	virtual void read(ifstream& fin)
	{
		fin >> EmpId >> DeptId;
	}

	virtual void print()
	{
		cout << "Employee #" << EmpId << "    Dept#" << DeptId << "  ";
	}
	virtual double CalNet()
	{
		Net = 0.0;
		return Net;
	}

};

class Salaried :public Employee
{
public:
	void read(ifstream& fin)
	{
		Employee::read(fin);
		fin >> salary;
		CalNet(salary);
		print();
	}
	double CalNet(double salary)
	{
		Net = salary / 12;
		return Net;
	}
	void print()
	{
		Employee::print();
		cout << "Net pay: $" << Net << "     Salary: $" << salary <<"\n";
	}
private:
	double salary;
};
class Hourly : public Employee
{
public:
	void read(ifstream& fin)
	{
		Employee::read(fin);
		fin >> Hours >> Rate;
		CalNet(Hours, Rate);
		print();

	}
	double CalNet(double Hours, double Rate)
	{
		Net = Hours * Rate;
		return Net;
	}
	void print()
	{
		Employee::print();
		cout << "Net pay: $" << Net << "   Hours: " << Hours << "     Rate: $" << Rate <<"\n";
	}
private:
	double Hours;
	double Rate;
};
class Commissioned : public Employee
{
public:
	void read(ifstream& fin)
	{
		Employee::read(fin);
		fin >> SalesAmount;
		CalNet(SalesAmount);
		print();

	}
	double CalNet(double SalesAmount)
	{
		if (SalesAmount <= 15000.0 &&SalesAmount >= 0.0)
		{
			Net = SalesAmount * 0.12;
		}
		else if (SalesAmount>15000 && SalesAmount <= 25000)
		{
			Net = 15000 * 0.12 + (SalesAmount - 15000)*0.15;
		}
		else if (SalesAmount>25000)
		{
			Net = 15000 * 0.12 + 10000 * 0.15 + (SalesAmount - 25000)*0.20;
		}
		return Net;


	}
	void print()
	{
		Employee::print();
		cout << "Net pay: $" << Net << "   Sales: " << SalesAmount <<"\n";
	}
private:
	double SalesAmount;
};
Employee* EmpFactory(int Type)
{
	if (Type == 1) return new Salaried;
	if (Type == 2) return new Hourly;
	if (Type == 3) return new Commissioned;
}
int main()
{
	Employee *EmpPtr;
	int Type;
	ifstream fin;
	fin.open("..\\input.txt");
	if (!fin)
	{
		cout << "Error: in input file" << endl;
		return 1;
	}
	fin >> Type;

	while (!fin.eof())
	{
		
		if (Type != 1 && Type != 2 && Type != 3)
		{
			cout << "Invalid employee type";
			return 1;
		}
		EmpPtr = EmpFactory(Type);
		EmpPtr->read(fin);
		fin >> Type;
	}
	fin.close();
	getchar();
	return 0;
}


