const express = require('express');
const app = express();
const PORT = 3000;

const todos = [
    { id: 1, title: 'Buy groceries', completed: false },
    { id: 2, title: 'Do laundry', completed: true },
    { id: 3, title: 'Pay bills', completed: false }
];

app.get('/todos', (req, res) => {
    res.json(todos);
});

app.get('/todos/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const todo = todos.find(t => t.id === id);

    if (!todo) {
        return res.status(404).send('<h1>Todo not found</h1>');
    }

    res.send(`
    <h1>Todo Details</h1>
    <p><strong>ID:</strong> ${todo.id}</p>
    <p><strong>Title:</strong> ${todo.title}</p>
    <p><strong>Completed:</strong> ${todo.completed}</p>
  `);
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
