// Get the input from command line arguments
const input = process.argv[2];

// Function to print the star pattern
function printStarPattern(n) {
  for (let i = n; i >= 1; i--) {
    console.log('* '.repeat(i).trim());
  }
}

// Validate input and execute
const num = Number(input);

if (!num || num < 1 || num > 5 || !Number.isInteger(num)) {
  console.error('Error: Please provide a valid integer between 1 and 5.');
  process.exit(1);  // Exit with error code
} else {
  printStarPattern(num);
}
