//Synchronous File Handling
// const fs = require('fs');
// const filePath = 'example-sync.txt';


// try {
//     fs.writeFileSync(filePath, 'Hello from synchronous write!');
//     console.log('File written synchronously');
// } catch (err) {
//     console.error('Error writing file:', err);
// }


// try {
//     const data = fs.readFileSync(filePath, 'utf8');
//     console.log('File content (sync):', data);
// } catch (err) {
//     console.error('Error reading file:', err);
// }



//Asynchronous File Handling

const fs = require('fs');
const filePath = 'example-async.txt';

fs.writeFile(filePath, 'Hello from asynchronous write!', (err) => {
    if (err) {
        return console.error('Error writing file:', err);
    }
    console.log('File written asynchronously');

    fs.readFile(filePath, 'utf8', (err, data) => {
        if (err) {
            return console.error('Error reading file:', err);
        }
        console.log('File content (async):', data);
    });
});
