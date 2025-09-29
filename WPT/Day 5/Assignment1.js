function calculate(...a){
    console.log("From calculate function");
    let sum=0;
    for(let i=0;i<a.length;i++)
    {
        sum+=a[i];
    }
    console.log("Addition:" +sum);
    console.log("Odd numbers:");

    for(let i=0;i<a.length;i++)
    {
        
        if(a[i]%2!=0){
            console.log(a[i]);
        }
        
    }
}

calculate(1,3,6,8,5,9,2);