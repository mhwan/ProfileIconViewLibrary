# ProfileIconView

### this is Default Circle Profile Icon View for Android.
---
#### Example

---
#### How to use
###### Step 1. Add the JitPack repository to your Project file (build.gradle)

    allprojects {
		    repositories {
			    ...
			    maven { url 'https://jitpack.io' }
		    }
    }
  
###### Step 2. Add the dependency to your Application module (build.gradle)

    dependencies {
         implementation 'com.github.mhwan:ProfileIconViewLibrary:0.1'
    }
    
    
###### Step 3. Add CircleIndicator in your Layout XML or Java

* Xml
    
      <com.mhwan.profileiconview.ProfileIconView
        android:layout_width="80dp"
        android:layout_height="80dp"></com.mhwan.profileiconview.ProfileIconView>
        
* Java

      ProfileIconView profileIconView = new ProfileIconView(getApplicationContext());
      addView(profileIconView, new ViewGroup.LayoutParams(120, 120));


###### Tip

* And you change your background color of circle
    
    `app:bg_color="@color/colorPrimary"`, `profileIconView.setCircleBackgroundColor(getResources().getColor(R.color.colorAccent));`
    
* Also you can change icon resource (if you not set icon, There is a default icon that you can see in the example image) 
    
    `app:icon_src="@mipmap/ic_launcher"`, `profileIconView.setIconResource(R.mipmap.ic_launcher);`
    
* Also you can change padding of icon (if you not change padding, The padding value change depending on size of view) 
   
    `app:icon_padding="18dp"`, `profileIconView.setIconPadding(24);`
    
* Also you can add border of circle(border width, border color)
  
  -java 
  
    `profileIconView.setBoarderWidth(2);`
    `profileIconView.setBoarderColor(getResources().getColor(android.R.color.black));`
  
  -xml
  
    `app:border_width="2dp"`
    `app:border_color="@android:color/black"`
    
