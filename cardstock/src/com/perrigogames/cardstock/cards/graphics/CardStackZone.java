package com.perrigogames.cardstock.cards.graphics;

/*import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

import com.perrigogames.cardstock.R;
import com.perrigogames.cardstock.cards.Deck;
import com.perrigogames.cardstock.cards.graphics.IDObject;
import com.perrigogames.cardstock.core.ContentManager;
import com.perrigogames.cardstock.core.graphics.DrawObject;

public class CardStackZone extends GameZone {
	
	public static final String TAG = CardStackZone.class.getSimpleName();
	public static final IDObject id = new IDObject(TAG);
	public String getName() { return id.getName(); }
	public int getId() { return id.getId(); }
	
	private Deck deck;
	private DrawObject background;
	
	public CardStackZone(int x, int y, int originCorner, float width, float height, int sizeMode, int drawOrder) {
		super(x, y, originCorner, width, height, sizeMode, drawOrder);
		setBackground();
	}
	public CardStackZone(float x, float y, int originCorner, float width, float height, int sizeMode, int drawOrder) {
		super(x, y, originCorner, width, height, sizeMode, drawOrder);
		setBackground();
	}
	
	private void setBackground() {
		float ratio = (float)height / width;
		int cardWidth = 0;
		int cardHeight = 0;
		int cardX = left();
		int cardY = top();
		if (ratio > 1.4f) {	//	taller than necessary
			cardWidth = width;
			cardHeight = (int) (cardWidth * 1.4);
			cardY += (height - cardHeight) / 2;
		} else {	//	wider than necessary
			cardHeight = height;
			cardWidth = (int) (cardHeight * 0.714f);
			cardX += (width - cardWidth) / 2;
		}
		ContentManager content = ContentManager.getContentManager();
		assert (content != null);
		Bitmap b = content.getScaledBitmap(R.drawable.card_back, cardWidth, cardHeight);
		background = new DrawObject(cardX, cardY, b, false);
	}
	
	public void postInit() { }
	
	public void update() { super.update(); }
	public void handleDownTouch(MotionEvent event) {
		//if (Game.DEBUG_MODE) getVisiblePlayer().drawToHand();
	}
	public void handleOffDownTouch(MotionEvent event) { }
	public void handleMoveTouch(MotionEvent event) { }
	public void handleUpTouch(MotionEvent event) { }
	public void handlePressTouch(MotionEvent event) { }
	
	//	draws this DeckZone to the screen
	private final int TEXT_SIZE = 25;
	public void draw(Canvas canvas) {
		Paint paint = new Paint(); 
		background.draw(canvas);
		
		paint.setColor(Color.WHITE);
		paint.setTextSize(TEXT_SIZE);
		int x = left() + (width / 2);
		int y = top() + (height / 2) - (TEXT_SIZE / 2);
		canvas.drawText(""+deck.size(), x, y, paint);
	}
}
*/