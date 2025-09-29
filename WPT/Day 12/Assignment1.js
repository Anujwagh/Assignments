const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url, true); 
    const query = parsedUrl.query;

    const fName = query.fName || 'Guest';

    const htmlContent = `
        <!DOCTYPE html>
        <html>
        <head>
            <title>Greeting Page</title>
        </head>
        <body>
            <h1>Hello ${fName}.</h1>
        </body>
        </html>
    `;

    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(htmlContent);
});


const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}/`);
});
