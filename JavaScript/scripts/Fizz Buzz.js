for (let i = 1; i <= 10; i++) {
    if (i % 3 === 0) {
        continue;
    }
    console.log(i);
    if (i === 8) {
        break;
    }
}

let i = 1;

while (i <= 10) {
    if (i % 3 === 0) {
        i++;
        continue;
    }
    console.log(i);
    i++;
}