# SearchableSpinner
An Android Spinner In Which You Can Search for a particular spinner item. Ideal for spinners with too many options.

First Add this line to your dependencies in build.gradle of your app module

 compile 'com.toptoche.searchablespinner:searchablespinnerlibrary:1.3.1'

Add this code in XML wherever you need the Spinner:

        <com.toptoche.searchablespinnerlibrary.SearchableSpinner
        android:id="@+id/spinner1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:clickable="false"
        android:gravity="center_vertical"
        android:paddingLeft="5dp"
        android:popupBackground="#FFF"
        android:textSize="20sp" />
        
        
        In Java Class, Define Spinner object As SearchableSpinner instead of normal spinner
        
        eg:  SearchableSpinner spinner1;
        
        Thats it You are all set to go.
        
        Note: All other methods like setting adapter and adding items is same as normal Android Spinner. Refer Full code for more info.
