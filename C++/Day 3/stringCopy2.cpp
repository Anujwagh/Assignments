#include <iostream>  
using namespace std; 

/*accept one string from user declare
 another string & copy that string without using strcpy*/

 void user_strcpy(char*,char*);
 int main()
 {
    char str1[20];
    char str2[50];
    cout<<"Enter first string: ";
    cin>>str1;
    user_strcpy(str2,str1);
    cout<<"Copied string : "<<str2;

 }
 void user_strcpy(char* s2,char* s1)
 {
    while(*s1!='\0')
    {
        *s2=*s1;
        s1++;
        s2++;
    }
    *s2='\0';
 }