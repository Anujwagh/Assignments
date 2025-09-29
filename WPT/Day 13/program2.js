const express = require('express');
const app = express();
const port = 8080;

// Route with parameters
app.get('/users/:userId/emails/:emailId', (req, res) => {
  res.send(`User ID: ${req.params.userId}, Email ID: ${req.params.emailId}`);
});

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`);
});