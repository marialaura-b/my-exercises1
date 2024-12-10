
let images = { paper: "./assets/paper.png", rock: "./assets/rock.png", scissors: "./assets/scissors.png" };
let handType = ["paper", "rock", "scissors"];

let scorePlayer1 = 0;
let scorePlayer2 = 0;

let player1img = document.getElementById('player1img');
let player2img = document.getElementById('player2img');

let scorePlayer1lbl = document.getElementById('scorePlayer1');
let scorePlayer2lbl = document.getElementById('scorePlayer2');


function handRandom() {
    return Math.floor(Math.random() * handType.length);
}

function round() {
    let handPlayer1 = handType[handRandom()];
    let handPlayer2 = handType[handRandom()];

    player1img.src = `${images[handPlayer1]}`;
    player2img.src = `${images[handPlayer2]}`;

    if (handPlayer1 == handPlayer2) {
        console.log("Draw!!!")
    } else if (handPlayer1 == "rock" && handPlayer2 == "scissors"
        || handPlayer1 == "paper" && handPlayer2 == "rock"
        || handPlayer1 == "scissors" && handPlayer2 == "paper") {
        scorePlayer1++;
    } else {
        scorePlayer2++;
    }    

    scorePlayer1lbl.textContent = `${'Score: ' + scorePlayer1}`;
    scorePlayer2lbl.textContent = `${'Score: ' + scorePlayer2}`;
}

window.onload = round;
const btn = document.getElementById("playRound_btn");
btn.addEventListener("click", round, false);
