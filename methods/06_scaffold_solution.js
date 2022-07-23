//NOTE: REQUIRES THE p5.js LIBRARY!

// Your task is to draw a Working Traffic light turns lights on based on the mouse position.

// HINTS!
// height is a variable the will always be equal to the height of the canvas
// mouseX is a variable that will always equal the current horiziontal position, left and right
// mouseY is a varable that will always equal the current vertical position, up and down

function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);

  //DON'T TOUCH! resets the values for lights for each draw loop
  var redLight = "black";
  var yellowLight = "black";
  var greenLight = "black";

  //code the traffic light here...
  // you need to write the correct conditonal statements in each if statement.

  //if the mouse is in the bottom 1/3 of the canvas, change variable greenLight to green
  if (mouseY > height/3 * 2) {
    greenLight = "green";
  }

  //if the mouse is in the top 1/3 of the canvas, change the variable redLight variable to red
  if (mouseY > height/3 && mouseY < height/3 * 2) {
    yellowLight = "yellow";
  }

  //if the mouse is in the middle 1/3 of the canvas, change the variable yellowLight to yellow
  if (mouseY < height/3) {
    redLight = "red";
  }

  // don't touch, this draws the lights, changing the color above will turn it on/off
  //draws the box
  rectMode(CENTER);
  fill(140);
  rect(width / 2, height / 2, 150, 350);

  //draws the red light
  fill(redLight);
  ellipse(width / 2, height / 2 - 115, 100, 100);

  //draws the yellow light
  fill(yellowLight);
  ellipse(width / 2, height / 2, 100, 100);

  //draws the green light
  fill(greenLight);
  ellipse(width / 2, height / 2 + 115, 100, 100);
}

