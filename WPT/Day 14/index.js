const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.use(bodyParser.json());

let items = [
    { id: 1, name: 'Item 1' },
    { id: 2, name: 'Item 2' }
];

app.get('/api/items', (req, res) => {
    res.json(items);
});

app.get('/api/items/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const item = items.find(i => i.id === id);

    if (item) {
        res.json(item);
    } else {
        res.status(404).send('Item not found.');
    }
});


app.post('/api/items', (req, res) => {
    const newItem = {
        id: items.length > 0 ? Math.max(...items.map(i => i.id)) + 1 : 1,
        name: req.body.name
    };

    if (!newItem.name) {
        return res.status(400).send('Name is required.');
    }

    items.push(newItem);
    res.status(201).json(newItem);
});

app.put('/api/items/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const item = items.find(i => i.id === id);

    if (!item) {
        return res.status(404).send('Item not found.');
    }

    if (!req.body.name) {
        return res.status(400).send('Name is required.');
    }

    item.name = req.body.name;
    res.json(item);
});

app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});