// Helper function to check if a number is prime
function isPrime(num) {
  if (num <= 1) return false;
  if (num === 2) return true;
  if (num % 2 === 0) return false;
  
  for (let i = 3; i <= Math.sqrt(num); i += 2) {
    if (num % i === 0) return false;
  }
  return true;
}

// Get numbers from command line arguments (skip first two default args)
const inputNumbers = process.argv.slice(2);

if (inputNumbers.length !== 10) {
  console.error('Error: Please provide exactly 10 numbers.');
  process.exit(1);
}

// Convert input strings to numbers and validate
const numbers = inputNumbers.map(Number);

if (numbers.some(isNaN)) {
  console.error('Error: All inputs must be valid numbers.');
  process.exit(1);
}

// 1) Addition of even numbers only
const sumEvenNumbers = numbers.filter(n => n % 2 === 0).reduce((acc, val) => acc + val, 0);

// 2) Addition of numbers at even indices
const sumEvenIndices = numbers.filter((_, index) => index % 2 === 0).reduce((acc, val) => acc + val, 0);

// 3) Addition of prime numbers
const sumPrimeNumbers = numbers.filter(isPrime).reduce((acc, val) => acc + val, 0);

console.log(`Addition of even numbers only: ${sumEvenNumbers}`);
console.log(`Addition of numbers at even indices: ${sumEvenIndices}`);
console.log(`Addition of prime numbers: ${sumPrimeNumbers}`);
