const express = require('express');
const app = express();
const port = 8080;

app.get('/', (req, res) => {
  res.send('Hello World from Express!');
});

app.get('/anuj', (req, res) => {
  res.send('Hello Anuj');
});

app.post('/wagh', (req, res) => {
  res.send('Hello Anuj wagh');
});

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`);
});