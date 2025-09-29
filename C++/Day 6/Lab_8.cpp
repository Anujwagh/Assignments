#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Student {
public:
    int rollNumber;
    string name;
    string dateOfBirth; 
    float totalMarks;

    Student(int roll, string n, string dob, float marks)
        : rollNumber(roll), name(n), dateOfBirth(dob), totalMarks(marks) {}

    void display() const {
        cout << "Roll Number: " << rollNumber
             << ", Name: " << name
             << ", Date of Birth: " << dateOfBirth
             << ", Total Marks: " << totalMarks << endl;
    }
};

bool compareByRollNumber(const Student &a, const Student &b) {
    return a.rollNumber < b.rollNumber;
    
}

bool compareByDateOfBirth(const Student &a, const Student &b) {
    return a.dateOfBirth < b.dateOfBirth;
}


bool compareByTotalMarks(const Student &a, const Student &b) {
    return a.totalMarks > b.totalMarks; 
}

int main() {
    
    vector<Student> students;

    students.push_back(Student(3, "Alice", "2005-05-12", 85.5));
    students.push_back(Student(1, "Bob", "2004-11-23", 92.0));
    students.push_back(Student(5, "Charlie", "2006-01-15", 78.0));
    students.push_back(Student(2, "David", "2005-07-19", 88.5));
    students.push_back(Student(4, "Eve", "2004-03-30", 91.0));
    students.push_back(Student(6, "Frank", "2006-09-10", 74.5));
    students.push_back(Student(7, "Grace", "2005-12-25", 89.0));
    students.push_back(Student(8, "Hannah", "2004-06-18", 95.0));
    students.push_back(Student(9, "Ivy", "2006-02-28", 80.0));
    students.push_back(Student(10, "Jack", "2005-08-05", 84.0));

    cout << "Original Data:\n";
    for (const auto &student : students) {
        student.display();
    }

    
    sort(students.begin(), students.end(), compareByRollNumber);
    cout << "\nSorted by Roll Number:\n";
    for (const auto &student : students) {
        student.display();
    }

  
    sort(students.begin(), students.end(), compareByDateOfBirth);
    cout << "\nSorted by Date of Birth:\n";
    for (const auto &student : students) {
        student.display();
    }

    
    sort(students.begin(), students.end(), compareByTotalMarks);
    cout << "\nSorted by Total Marks:\n";
    for (const auto &student : students) {
        student.display();
    }

    return 0;
}

