/*
 * Given 2 strings, return their concatenation, except omit
 * the first char of each. The strings will be at least length 1.
 *   nonStart("Hello", "There") -> "ellohere"
 */
function nonStart(word1, word2) {
  return word1.substring(1) + word2.substring(1);
}

function excludeLength4Words(words) {
  const result = [];

  for (const word of words) {

    if (word.length !==4){
      result.push(word);
    }
  }
  return result;
} 

function returnSumOfLargestAndSmallestNumber(nums) {

  if (nums == null || nums.length === 0) {
    return null;
  }

  let smallest = nums[0];
  let largest = nums[0];
  
  for(let i = 1; i < nums.length; i++) {
    if (nums[i] < smallest) {
      smallest = nums[i];
    }
    if (nums[i] > largest) {
      largest = nums[i];
    }
  }
  return smallest + largest;
}
