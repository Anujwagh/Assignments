#include<iostream>
using namespace std;
#include<string.h>


void reverseString(char* str) 
{ 
    int l, i; 
    char *begin_ptr, *end_ptr, ch; 

    
    l = strlen(str); 

    begin_ptr = str;

    end_ptr = str + l - 1;

    for (i = 0; i < l / 2; i++) { 
      
         
        ch = *end_ptr; 
        *end_ptr = *begin_ptr; 
        *begin_ptr = ch; 

         
        begin_ptr++; 
        end_ptr--; 
    } 
} 

int main() 
{ 
    
    char str[100] = "HelloWorld";
  
  	cout << "Original String: " << str << endl;

    reverseString(str); 

    cout << "Reverse of the string: " << str << endl; 

    return 0; 
}