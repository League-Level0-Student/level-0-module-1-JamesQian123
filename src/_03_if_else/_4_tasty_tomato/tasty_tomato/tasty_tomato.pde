void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(255,13,13);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(49,211,93);
    rect(176, 103, 12, 32);
    if(mousePressed){
    fill(252,252,252);
    ellipse(85,200, 100, 100);
    }
}
