PImage mypic; //declare a PImage type variable called 'mypic'

void setup() {
  size(600, 400); //make the screen the same size as the photo

  mypic = loadImage("Pro.jpg"); //load your photo into the variable you declared at the top
  noStroke(); //switch off outlines
  smooth(); //smooth edges of shapes
  //noCursor();  //hides the mouse pointer, of course!
}

void draw() {
  background(0); 

  image(mypic, 0, 0);  
  fill(255);  

  ellipse(224, 147, 40, 40); 
  ellipse(362, 147, 40, 40);  
  fill(0);  
  float mx1 = constrain(mouseX, 212, 237);  
  float my1 = constrain(mouseY, 135, 159);  
  ellipse(mx1, my1, 15, 15);  
  float mx2 = constrain(mouseX, 350, 374);  
  float my2 = constrain(mouseY, 135, 159);  
  ellipse(mx2, my2, 15, 15);  //draws a black right eye pupil using constrained x and y coordinates

  //println(mouseX);   //mouse coordinates to pinpoint ellipse locations
  //println(mouseY);
}