const express = require('express');
const path = require('path');
const app = express();
const port = 8080;

app.get('/users/aboutus', (req, res) => {
  res.sendFile(path.join(__dirname, 'aboutus.html'));
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});