import processing.core.PApplet;
import java.util.Random;
import java.lang.Math;
import java.time.LocalTime;

public class Sketch extends PApplet {
	
  LocalTime myObj = LocalTime.now();
  // Variables
    int width = 400;
    int height = 400;
    double randValue;
    int min = 0;
    int max = 101;
    int intMinutes;
    int intHours;
    int myRandom = (int)Math.floor(Math.random() * (max - min + 1) + min);
	
  public void settings() {
	// put your size call here
    size(width, height);
  }

  public void setup() {
    background(50, 141, 168);
  }

  public void draw() {
         
      // HOUSE DURRING THE DAY

      if (myRandom <= 25 && myRandom >= 0) {
        // Foreground of picture (oval)
        fill(78, 140, 70);
        ellipse(width / 2, height, (float)(width * 1.25), height);

        // Body of house (rectangle)
        fill(242, 237, 133);
        rect((float)(width * 0.375), (float)(height * 0.3125), width / 4, (float)(height * 0.1875));

        // Roof of house (triangle)
        fill(242, 139, 65);
        triangle((float)(width * 0.375), (float)(height * 0.3125), (float)(width * 0.625), (float)(height * 0.3125), width / 2, (float)(height * 0.1875));     

        // Door (rectangle)
        fill(252, 165, 3);
        rect((float)(width * 0.4), (float)(height * 0.425), (float)(width * 0.05),(float)(height * 0.075));

        // Top left bay window (rectangle)
        fill(46, 140, 191);
        rect((float)(width * 0.4), (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.0375));

        // Upper bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.05));

        // Lower bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.4325), (float)(width * 0.075), (float)(height * 0.05));
        
        // Sun 
        fill(252, 231, 3);
        ellipse(width, 0, (width / 4), (400 / 4));

        // Time 
          // Size and fill call
          textSize(25);
          fill(255,255,255);

          // Variables for current time (hours and minutes)
          intHours = hour(); // Values from 0-23
          intMinutes = minute(); // Values from 0-59
          
          //Output
          text(intHours, 10, 30);
          text(intMinutes, 50, 30);

      }

      else if (!(myRandom <25 || myRandom >= 50)){
        // Foreground of picture (oval)
        fill(78, 140, 70);
        ellipse(width / 2, height, (float)(width * 1.25), height);

        // Body of house (rectangle)
        fill(192, 114, 196);
        rect((float)(width * 0.375), (float)(height * 0.3125), width / 4, (float)(height * 0.1875));

        // Roof of house (triangle)
        fill(242, 139, 65);
        triangle((float)(width * 0.375), (float)(height * 0.3125), (float)(width * 0.625), (float)(height * 0.3125), width / 2, (float)(height * 0.1875));     

        // Door (rectangle)
        fill(252, 165, 3);
        rect((float)(width * 0.4), (float)(height * 0.425), (float)(width * 0.05),(float)(height * 0.075));

        // Top left bay window (rectangle)
        fill(46, 140, 191);
        rect((float)(width * 0.4), (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.0375));

        // Upper bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.05));

        // Lower bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.4325), (float)(width * 0.075), (float)(height * 0.05));
        
        // Sun 
        fill(194, 0, 0);
        ellipse(0, 0, (width / 4), (400 / 4));

        // Time 
          // Size and fill call
          textSize(25);
          fill(255,255,255);

          // Variables for current time (hours and minutes)
          intHours = hour(); // Values from 0-23
          intMinutes = minute(); // Values from 0-59
          
          //Ooutput
          text(intHours, 10, 30);
          text(intMinutes, 50, 30);
      }

      else if(!(myRandom < 50 || myRandom >= 75)){
        // Foreground of picture (oval)
        fill(78, 140, 70);
        ellipse(width / 2, height, (float)(width * 1.25), height);

        // Body of house (rectangle)
        fill(242, 237, 133);
        rect((float)(width * 0.375), (float)(height * 0.3125), width / 4, (float)(height * 0.1875));

        // Roof of house (triangle)
        fill(242, 139, 65);
        triangle((float)(width * 0.375), (float)(height * 0.3125), (float)(width * 0.625), (float)(height * 0.3125), width / 2, (float)(height * 0.1875));     

        // Door (rectangle)
        fill(252, 165, 3);
        rect((float)(width * 0.4), (float)(height * 0.425), (float)(width * 0.05),(float)(height * 0.075));

        // Top left bay window (rectangle)
        fill(46, 140, 191);
        rect((float)(width * 0.4), (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.0375));

        // Upper bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.05));

        // Lower bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.4325), (float)(width * 0.075), (float)(height * 0.05));
        
        // Sun 
        fill(2, 125, 94);
        ellipse(width / 2, 0, (width / 4), (400 / 4));

        // Time 
          // Size and fill call
          textSize(25);
          fill(255,255,255);

          // Variables for current time (hours and minutes)
          intHours = hour(); // Values from 0-23
          intMinutes = minute(); // Values from 0-59
          
          //Ooutput
          text(intHours, 10, 30);
          text(intMinutes, 50, 30);
      }

      else {
        // Foreground of picture (oval)
        fill(78, 140, 70);
        ellipse(width / 2, height, (float)(width * 1.25), height);

        // Body of house (rectangle)
        fill(11, 71, 22);
        rect((float)(width * 0.375), (float)(height * 0.3125), width / 4, (float)(height * 0.1875));

        // Roof of house (triangle)
        fill(242, 139, 65);
        triangle((float)(width * 0.375), (float)(height * 0.3125), (float)(width * 0.625), (float)(height * 0.3125), width / 2, (float)(height * 0.1875));     

        // Door (rectangle)
        fill(252, 165, 3);
        rect((float)(width * 0.4), (float)(height * 0.425), (float)(width * 0.05),(float)(height * 0.075));

        // Top left bay window (rectangle)
        fill(46, 140, 191);
        rect((float)(width * 0.4), (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.0375));

        // Upper bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.05));

        // Lower bay window (rectangle)
        fill(46, 140, 191);
        rect(width / 2, (float)(height * 0.4325), (float)(width * 0.075), (float)(height * 0.05));
        
        // Sun 
        fill(252, 231, 3);
        ellipse(width / 5, height / 4, (width / 4), (400 / 4));

        // Time 
          // Size and fill call
          textSize(25);
          fill(255,255,255);

          // Variables for current time (hours and minutes)
          intHours = hour(); // Values from 0-23
          intMinutes = minute(); // Values from 0-59
          
          //Ooutput
          text(intHours, 10, 30);
          text(intMinutes, 50, 30);

      }
  }
  
  // define other methods down here.
}