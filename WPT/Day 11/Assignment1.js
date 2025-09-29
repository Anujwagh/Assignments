
function factorial(n) {
    if (n === 0 || n === 1) {
        return 1;
    }
    return n * factorial(n - 1);
}

const arg = process.argv[2];

const num = Number(arg);
if (isNaN(num) || num < 0 || !Number.isInteger(num)) {
    console.log('Please provide a non-negative integer as an argument.');
    process.exit(1);
}

const result = factorial(num);
console.log(`Factorial of ${num} is ${result}`);
