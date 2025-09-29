//Using Query Parametres

const express = require('express');
const app = express();
const port = 8080;

// Route handling query parameters
app.get('/:/:Id', (req, res) => {
    // Access query parameters using req.query
    const { P101, anuj4121 } = req.query;
    res.send(`Id: ${P101}, Email: ${anuj4121 || 'none'}`);
});

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`);
});
