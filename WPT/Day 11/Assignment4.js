const readline = require('readline');

// Create readline interface to accept user input
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Function to get number input from user
function getNumber(prompt) {
  return new Promise((resolve) => {
    rl.question(prompt, (input) => {
      resolve(Number(input));
    });
  });
}

// Function that returns a promise to multiply two numbers if both positive
function multiplyIfPositive(a, b) {
  return new Promise((resolve, reject) => {
    if (a > 0 && b > 0) {
      resolve(a * b);
    } else {
      reject('Both numbers must be positive!');
    }
  });
}

// Main async function to run the process
async function main() {
  try {
    const num1 = await getNumber('Enter first number: ');
    const num2 = await getNumber('Enter second number: ');
    
    const result = await multiplyIfPositive(num1, num2);
    console.log(`Result of multiplication: ${result}`);
  } catch (error) {
    console.error('Error:', error);
  } finally {
    rl.close();
  }
}

main();
