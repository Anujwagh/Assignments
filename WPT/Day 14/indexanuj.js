const exp=require('express');
const app=exp();

app.set("view engine","ejs");

app.get("/anuj",(req,res)=>{
    res.render("./calc");
})





app.listen(5000,()=>{
    console.log("listening");
})