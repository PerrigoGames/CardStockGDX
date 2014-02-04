package com.perrigogames.cardstock.cards.screens;

/*import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.widget.TableLayout.LayoutParams;

public class MainMenu extends Activity {
	
	MainMenuView view;
	public static boolean TABLET_VIEW = false;
    public static boolean PHONE_VIEW = false;
    public static boolean SMALL_PHONE_VIEW = false;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeGlobals();
		view = new MainMenuView(getApplicationContext(), this);
		
		view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		
		setContentView(view);
	}
	
	private void initializeGlobals() {
		Display display = getWindowManager().getDefaultDisplay();
        int screenWidth = display.getWidth();
        int screenHeight = display.getHeight();
        //	if either dimension is below 800, assume phone screen
        if (screenHeight < 600 || screenWidth < 600) SMALL_PHONE_VIEW = true;
        else if (screenHeight < 800 || screenWidth < 800) PHONE_VIEW = true;
        else TABLET_VIEW = true;
	}
	
	//	provides a shorthand for starting an activity
	public void startActivity(Class<?> cls) {
		Intent intent = new Intent().setClass(this, cls);
		this.startActivity(intent);
	}
}
*/