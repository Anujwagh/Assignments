function performArrayOperation(choice, arr) {
  switch (choice.toLowerCase()) {
    case "push":
      arr.push("grape");
      console.log("After push:", arr);
      break;

    case "pop":
      let popped = arr.pop();
      console.log("Popped element:", popped);
      console.log("After pop:", arr);
      break;

    case "shift":
      let shifted = arr.shift();
      console.log("Shifted element:", shifted);
      console.log("After shift:", arr);
      break;

    case "unshift":
      arr.unshift("mango");
      console.log("After unshift:", arr);
      break;

    case "slice":
      let sliced = arr.slice(1, 3);
      console.log("Sliced part (index 1 to 2):", sliced);
      break;

    case "splice":
      let spliced = arr.splice(1, 2, "kiwi", "pineapple");
      console.log("Removed items:", spliced);
      console.log("After splice:", arr);
      break;

    case "indexof":
      let index = arr.indexOf("banana");
      console.log("Index of 'banana':", index);
      break;

    case "includes":
      let found = arr.includes("apple");
      console.log("Includes 'apple'? :", found);
      break;

    case "join":
      let joined = arr.join(" - ");
      console.log("Joined string:", joined);
      break;

    case "reverse":
      arr.reverse();
      console.log("Reversed array:", arr);
      break;

    case "sort":
      arr.sort();
      console.log("Sorted array:", arr);
      break;

    default:
      console.log("Invalid choice! Try push, pop, shift, unshift, slice, splice, indexOf, includes, join, reverse, sort.");
  }
}

// Sample array
let fruits = ["apple", "banana", "cherry", "date"];

// Try different operations:
performArrayOperation("push", [...fruits]);
performArrayOperation("pop", [...fruits]);
performArrayOperation("shift", [...fruits]);
performArrayOperation("unshift", [...fruits]);
performArrayOperation("slice", [...fruits]);
performArrayOperation("splice", [...fruits]);
performArrayOperation("indexOf", [...fruits]);
performArrayOperation("includes", [...fruits]);
performArrayOperation("join", [...fruits]);
performArrayOperation("reverse", [...fruits]);
performArrayOperation("sort", [...fruits]);
