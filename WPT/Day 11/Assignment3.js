const http = require('http');
const Server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Hello World!');
});


Server.listen(3000, () => {
    console.log('server is started on http://localhost:3000/');
});

