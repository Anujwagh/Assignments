// #include<iostream>
// using namespace std;
// #include<string.h>

// int main()
// {
//     char str1[20];
//     char str2[20];
//     cout<<"Enter a string :";
//     cin>>str1;
//     cout<<endl;
//     strcpy(str2,str1);
//     cout<<"str2 is :"<<str2<<endl;

//     strrev(str1);
//     cout<<"rev str is:"<<str1<<endl;

//     if (strcmp(str1,str2)==0)
//     cout<<"str is palindrom";
//     else
//     cout<<"str is not palindrom";
// }




#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[20];
   char str2[20];
   cout<<"enter 1st string\n";
   cin>>str1;
   strcpy(str2,str1);
   strrev(str1);
   if(strcmp(str1,str2))
   cout<<"string is not palindrom";
   else
   cout<<" palindrom";
   
}  