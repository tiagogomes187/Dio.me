const array : Array<number> = [1,2,3,4]

array.forEach(element => {
    if(element > 2 && element % 2 === 0)
    console.log(element * 2)
});