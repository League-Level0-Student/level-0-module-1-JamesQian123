PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(500,500);
}
void draw() {
    fill(160,114,76);
    ellipse(250,250,500,500);
    fill(247,202,17);
    ellipse(250,250,465,465);
    pepperoni = loadImage("pepperoni.png");
    
    mushroom = loadImage("mushroom.png");
    
    olive = loadImage("olive.png");
    olive.resize(25,25);
    
    if(mousePressed){
      image(pepperoni , 200,123);
      image(mushroom , 200 , 254);
      image(olive,200,100);
      image(pepperoni , 312,234);
      image(mushroom , 215 , 246);
      image(olive,123,421);
    }
      
      
    
    
}
