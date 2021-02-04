const fact = (n) => {
    if(n===0||n===1) return 1;
    let fact = 1;
    for(let i = 2; i <= n; i++){
        fact *=i;
    }
    return fact;
}
const trailingZeroes = (n) =>{
   let res = fact(n);
   let count = 0;
   while(res%10===0){
       count++;
       res/=10;
   }
   return count;
}

//EFFICIENT APPROACH
const efficientTrailZeroes = (n) =>{
    let res = 0;
    //first ompute n/5, then compute n/25, then compute n /125 ...
    for(let i = 5; i <=n; i *=5){
        res += n/i;
    }
    return Math.floor(res);
}
console.log(efficientTrailZeroes(251));
