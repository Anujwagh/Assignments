//First way to find largest element is using for loop

// function largestElement(a) {
//     let largestNum = a[0];
//     for (let i = 1; i < a.length; i++) {
//         if (a[i] > largestNum) {
//             largestNum = a[i];
//         }
//     }
//     return largestNum;
// }

// const num1 = [17, 45, 88, 30, 75];
// const result = largestElement(num1);

// console.log("The largest element in the array is:" + result);




//First way to find largest element is using foreach 

// const array = [50, 35, 20, 81, 96];
// let largest = array[0];

// array.forEach(element => {
//     if (element > largest) {
//         largest = element;
//     }
// });

// console.log("Largest element:", largest);




//First way to find largest element is using sort method

function findLargest(arr) {

    arr.sort((a, b) => a - b); 

    return arr[arr.length - 1];
}

let arr = [50, 35, 20, 69];

console.log("Largest element in the array is:", findLargest(arr));