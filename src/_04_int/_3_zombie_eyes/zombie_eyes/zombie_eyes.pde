
void setup() {
  PImage face = loadImage("face.jpeg");
  size(1000,1000);
  face.resize(1000,1000);
  image(face, 0, 0);
  

}
void draw() {

fill(255,mouseX,mouseY);
ellipse(185,475,200,200);
ellipse(465,550,200,200);
fill(5,5,5);
ellipse(185,475,100,100);
ellipse(465,550,100,100);
}
