package com.perrigogames.cardstock.core.graphics;

/*import java.util.Random;

import com.perrigogames.cardstock.core.interfaces.Drawable;
import com.perrigogames.cardstock.core.interfaces.Touchable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
//import android.util.Log;
import android.view.MotionEvent;

//	small class to hold a Bitmap, and location data of an object to be drawn
public class DrawObject implements Touchable, Drawable {
	//	logging structures
	protected static int classIds = 0;
	protected int id;
	//private static final String TAG = DrawObject.class.getSimpleName();
	
	//	main structures
	protected Bitmap image;
	protected MovementComponent move;
	protected AnimationComponent anim;
	
	//	convenient half-calculations for length and width
	protected int halfWidth;
	protected int halfHeight;
	
	protected boolean centered;
	
	//	constructs a DrawObject with a specified Bitmap at a specified x-y coordinate
	//	if centered is true, will treat the x-y coordinate as the center of the object
	//	otherwise, the origin will be in the top-left corner
	public DrawObject(int x, int y, Bitmap draw, boolean centered) {
		id = classIds;
		classIds++;
		this.centered = centered;
		
		setImage(draw);
		move = new MovementComponent(x, y, 0, 0);
		anim = new AnimationComponent(move);
	}
	
	///
	///	Getters and Setters
	///
	
	public float X() { return move.x(); }
	public float Y() { return move.y(); }
	public void setX(float x) { move.setX(x); }
	public void setY(float y) { move.setY(y); }
	
	public Bitmap getImage() { return image; }
	public void setImage(Bitmap newImage) {
		this.image = newImage;
		if (newImage != null) {
			halfWidth = image.getWidth() / 2;
			halfHeight = image.getHeight() / 2;
		}
	}
	
	public int width() { return image.getWidth(); }
	public int height() { return image.getHeight(); }
	public int halfWidth() { return halfWidth; }
	public int halfHeight() { return halfHeight; }
	
	
	//	updates this DrawObject by first updating its AnimationComponent, then its MovementComponent
	public void update() {
		anim.update();
		move.update();
	}
	
	//	draws this DrawObject to the screen
	public void draw(Canvas canvas) {
		if (centered) canvas.drawBitmap(image, move.x() - halfWidth, move.y() - halfHeight, null);
		else canvas.drawBitmap(image, move.x(), move.y(), null);
	}

	//	calculates whether a point is within the bounds of this object
	public boolean isTouched(float x, float y, boolean allowBorder) {
		if (allowBorder) {
			if (centered) return
					x >= (X() - halfWidth) && 
					x <= (X() + halfWidth) &&
					y >= (Y() - halfHeight) && 
					y <= (Y() + halfHeight);
				else return
					x >= (X()) && 
					x <= (X() + image.getWidth()) &&
					y >= (Y()) && 
					y <= (Y() + image.getHeight());
		} else {
			if (centered) return
					x > (X() - halfWidth) && 
					x < (X() + halfWidth) &&
					y > (Y() - halfHeight) && 
					y < (Y() + halfHeight);
				else return
					x > (X()) && 
					x < (X() + image.getWidth()) &&
					y > (Y()) && 
					y < (Y() + image.getHeight());
		}
	}
	
	//	calculates how far a given touch is away from the object's center
	public float distFromCenter(float x, float y) {
		if (centered) return MovementComponent.distBetweenPoints(this.X(), this.Y(), x, y);
		else return MovementComponent.distBetweenPoints(this.X() + halfWidth, this.Y() + halfHeight, x, y);
	}

	///
	///	Touch Events
	///
	public void handleDownTouch(MotionEvent event) {
		//	sends the DrawObject to a random part of the screen currently
		Random r = new Random();
		anim.moveToPoint(r.nextInt(600), r.nextInt(400), 3);
	}
	public void handleOffDownTouch(MotionEvent event) {}
	public void handleMoveTouch(MotionEvent event) {}
	public void handleUpTouch(MotionEvent event) {}
	public void handlePressTouch(MotionEvent event) {}
}*/