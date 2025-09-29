
// const express = require('express');
// const app = express();
// const port = 8000;

// const data = require('./MOCK_DATA.json');

// app.get('/users', (req, res) => {
//   res.send(data);
// });

// app.listen(port);





app.get('/users/:id', (req, res) => {
  const user = users.find(u => u.id === req.params.id);
  if (user) {
    res.json(user);
  } else {
    res.status(404).send('User not found.');
  }
});

app.listen(port);




// app.delete('/users/:id', (req, res) => {
//     const id = Number(req.params.id);  // 15
//     // console.log(id);
//     const userIndex = users1.findIndex(
//         user => user.id === id
//     )
//     if (userIndex === -1)
//         return res.status(404).send('Data not found');

//     const deletedItem = users1.splice(userIndex, 1);
//     return res.json("Dae ");
// });