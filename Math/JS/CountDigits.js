//method 1 - iterative
const countDigits = (n) => {
  let count = 0;
  n = +n;
  while (n > 0) {
    n = Math.floor(n / 10);
    count++;
  }
  return count;
};
//method 2 - recursive
const countDigits = (n) => {
  if (n == 0) return 0;
  else return 1 + countDigits(Math.floor(n / 10));
};
//method  3 - logarithmic
const countDigits = (n) => {
  if (n == 0) return 0;
  return Math.floor(Math.log10(n)) + 1;
};
console.log(countDigits(132323));
