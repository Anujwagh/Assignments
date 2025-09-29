const express = require('express');
const hbs = require('hbs');
const path = require('path');
const app = express();
const port = 3000;

app.set('view engine', 'hbs');
app.set('views', path.join("C:\Users\IET\Desktop\250845920007\WPT\Day 14\view", 'view'));

app.use(express.urlencoded({ extended: true }));

app.get('/calc', (req, res) => {
  res.render('calc');
});

app.post('/calc', (req, res) => {

    const num1 = parseFloat(req.body.num1);
  const num2 = parseFloat(req.body.num2);
  const result = num1 + num2;

  res.render('calc', { 
    num1: num1,
    num2: num2,
    result: `The sum is: ${result}` 
  });
});


app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}/calc`);
});