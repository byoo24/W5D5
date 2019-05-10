const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});




function askIfGreaterThan(el1, el2, callback) {
    rl.question(`is ${el1} > ${el2}? `, (answer) => {
        if (answer === 'yes') {
            callback(true);
        } else {
            callback(false);
        }
    });
}


function innerBubbleSortLoop(arr, i, madeAnySwaps, outerBubbleSortLoop) {
    if (i === arr.length - 1) return outerBubbleSortLoop(madeAnySwaps);

    if (i < arr.length - 1) {
        askIfGreaterThan(arr[i], arr[i + 1], (isGreaterThan) => {
            if (isGreaterThan) {
                [arr[i], arr[i + 1]] = [arr[i + 1], arr[i]];
                madeAnySwaps = true;
            }
            console.log(arr);
            innerBubbleSortLoop(arr, i + 1, madeAnySwaps, outerBubbleSortLoop);
        });
    }
}

function absurdBubbleSort(arr, sortCompletionCallback) {
    innerBubbleSortLoop(arr, 0, false, outerBubbleSortLoop);

    function outerBubbleSortLoop(madeAnySwaps) {
        if (madeAnySwaps) {
            innerBubbleSortLoop(arr, 0, false, outerBubbleSortLoop);
        } else {
            sortCompletionCallback(arr);
        }
    }
}


absurdBubbleSort([3, 2, 1], function (arr) {
    console.log("sorted you dummy: " + JSON.stringify(arr));
    rl.close();
});