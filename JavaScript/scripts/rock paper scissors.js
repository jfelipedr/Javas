const score = { // The objects are defined with 'const'
    wins: 0,
    losses: 0,
    tides: 0
};

function computerMove() {
    randomChoise = Math.floor(Math.random() * 3);//returns a random (0,1,2)
    if (randomChoise === 0) {
        computer = 'Rock ✊';
    } else if (randomChoise === 1) {
        computer = 'Paper 🖐️';
    } else {
        computer = 'Scissors ✌️';
    }
    return computer;
}

function choseWinner(user, computer) {
    if (user === 'Rock') {
        if (computer === 'Rock ✊') {
            result = 'tide';
            score.tides++;
        } else if (computer === 'Paper 🖐️') {
            result = 'lose';
            score.losses++;
        } else {
            result = 'win';
            score.wins++;
        }
    } else if (user === 'Paper') {
        if (computer === 'Rock ✊') {
            result = 'win';
            score.wins++;
        } else if (computer === 'Paper 🖐️') {
            result = 'tide';
            score.tides++;
        } else {
            result = 'lose';
            score.losses++;
        }
    } else if (user === 'Scissors') {
        if (computer === 'Rock ✊') {
            result = 'lose';
            score.losses++;
        } else if (computer === 'Paper 🖐️') {
            result = 'win';
            score.wins++;
        } else {
            result = 'tide';
            score.tides++;
        }
    }
    return result;
}

function displayMessage(result) {
    const winText = 'You win ✨👏✨';
    const loseText = 'You lose 😓';
    const tideText = `It's a tide 😯`;

    if (result === 'win') {
        document.querySelector('.js-result')
            .innerHTML = winText;
        document.querySelector('.js-computer')
            .innerHTML = `The computer picked ${computer}`;
    } else if (result === 'tide') {
        document.querySelector('.js-result')
            .innerHTML = tideText;
        document.querySelector('.js-computer')
            .innerHTML = `The computer picked ${computer}`;
    } else {
        document.querySelector('.js-result')
            .innerHTML = loseText;
        document.querySelector('.js-computer')
            .innerHTML = `The computer picked ${computer}`;
    }
    document.querySelector('.js-score')
        .innerHTML = `Wins:${score['wins']} Losses:${score.losses} Tides:${score.tides}`;
}