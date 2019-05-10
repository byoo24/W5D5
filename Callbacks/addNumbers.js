const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


const addNumbers = (sum, numsLeft, completionCallback) => {
    if (numsLeft === 0) return completionCallback(sum);

    rl.question("Pick a number, any number: ", (answer) => {

        user_num = parseInt(answer);
        sum += user_num;
        numsLeft--;
        console.log(sum, numsLeft);

        addNumbers(sum, numsLeft, completionCallback);
    });

};


addNumbers(0, 3, (sum) => {
    console.log(sum);
    rl.close();
});