/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */

function multiplyTogether(firstParameter, secondParameter) {

return firstParameter * secondParameter;

}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */

function multiplyNoUndefined(firstParameter = 0, secondParameter = 0){

  if (typeof firstParameter !== 'number' || typeof secondParameter !== 'number') {
    throw Error('first or second parameter is not a number');
  }

return firstParameter * secondParameter;

}


/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */

function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}


/* arguments object and rest parameter syntax */

function addAllNumbers(a, b, c){
  let sum = 0;

  for (let i = 0; i < arguments.length; i++) {
    sum += arguments[i];
  }

  return sum;
}


function addAllNumbers(a = 0, b = 0, ...c){
  let sum = a + b;

  for (let val of c) {
    sum += val;
  }

  return sum;
}

/* Named Functions: Regular vs. Arrow */

addAllNumbers = (a = 0, b = 0, ...c) => {
  let sum = a + b;

  for (let val of c) {
    sum += val;
  }

  return sum;

}

/* Anonymous functions */

const myFunc = function (a, b) {
  return a + b;
}
const myOtherFunc = (a, b) => {
  return a + b;
}


/* Array functions requiring a function as a parameter */

/* .some(), .every(), .find(), .findIndex(), .filter(), .map(), .reduce() */

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 * multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {

  const numsDivisibleBy3 = [];

  for (let num of numbersToFilter) {
    if (num % 3 === 0) {
      numsDivisibleBy3.push(num);
  
    }
  }

  return numsDivisibleBy3;
}


function filterFunction(elements)

/**
 * Return true if all numbers are divisible by 3
 *
 * @param {number[]} numbers numbers to filter through
 * @returns {boolean} true if all numbers are divisible by 3
 */
function areAllDivisibleByThree(numbers) {
}

/**
 * Takes an array of strings and returns true if any geese are 
 * masquerading as a duck.
 *
 * @param {string[]} ducks array of ducks
 * @returns {boolean} true if any string is a goose
 */
function duckDuckGoose(ducks) {
}

/**
 * Takes an array of strings and returns true if all geese are 
 * masquerading as a duck.
 *
 * @param {string[]} ducks array of ducks
 * @returns {boolean} true if all strings are geese
 */
function duckDuckGooseAgain(ducks) {
}

/**
* Takes an array of numbers and formats them as money.
*
* @param {number[]} numbers array of numbers
* @returns {number[]} an array of numbers formatted as currency $x.xx
* 
* 
* [ 1, 5, 25.2 ] -> [ '$1.00', '$5.00', '$25.20' ]
*/
function toMoney(numbers) {
}


/**
 * Takes an array of numbers, finds the numbers divisible by 3, doubles them,
 * and returns a new array as a result.
 * 
 * @param {number[]} numbers 
 * @returns {number[]} an array of numbers divisible by 3 doubled
 */
function methodChainingExample(numbers) {
}


/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
 function sumAllNumbers(numbersToSum) {
}

/**
 * Return an array of unique numbers. Try using .reduce()
 * 
 * @param {number[]} numbers array of numbers
 * @returns {number[]} an array of unique numbers
 */
function returnOneOfEach(numbers) {
}

/**
 * Returns the longest string. Try using a traditional approach, and then
 * try using .reduce().
 * 
 * @param {string[]} strings an array of strings
 */
function returnLongestLength(strings) {
}

