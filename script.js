function addToScreen(value) {
    let screen = document.getElementById("screen");
    if (screen.innerText === "0") {
        screen.innerText = value;
    } else {
        screen.innerText += value;
    }
}

function clearScreen() {
    document.getElementById("screen").innerText = "0";
}

function deleteLast() {
    let screen = document.getElementById("screen");
    screen.innerText = screen.innerText.slice(0, -1) || "0";
}

function calculateResult() {
    let screen = document.getElementById("screen");
    try {
        screen.innerText = eval(screen.innerText);
    } catch (e) {
        screen.innerText = "Error";
    }
}
