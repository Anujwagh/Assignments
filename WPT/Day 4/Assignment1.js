function getFactorialImpl(choice = "FORLOOP") {
  
  function Fact1(n1) {
    let result = 1;
    for (let i = 2; i <= n1; i++) {
      result *= i;
    }
    return result;
  }

  function Fact2(n1) {
    if (n1 === 0 || n1 === 1) {
      console.log(1);
      return 1;
    } else {
      let result = n1 * Fact2(n1 - 1);
      if (n1 === 3 || n1 === 5) console.log(result);  
      return result;
    }
  }

  if (choice === "RECUR") {
    return Fact2;
  } else {
    return Fact1;
  }
}

let rv = getFactorialImpl("RECUR");
rv(3); 

rv = getFactorialImpl();
console.log(rv(5)); 
