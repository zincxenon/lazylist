package com.androidexample.lazyimagedownload;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    
    ListView list;
    LazyImageLoadAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        list=(ListView)findViewById(R.id.list);
        
        // Create custom adapter for listview
        adapter=new LazyImageLoadAdapter(this, mStrings);
        
        //Set adapter to listview
        list.setAdapter(adapter);
        
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(listener);
    }
    
    @Override
    public void onDestroy()
    {
    	// Remove adapter refference from list
        list.setAdapter(null);
        super.onDestroy();
    }
    
    public OnClickListener listener=new OnClickListener(){
        @Override
        public void onClick(View arg0) {
        	
        	//Refresh cache directory downloaded images
            adapter.imageLoader.clearCache();
            adapter.notifyDataSetChanged();
        }
    };
    
    
    public void onItemClick(int mPosition)
    {
    	String tempValues = mStrings[mPosition];
    	
    	Toast.makeText(MainActivity.this, 
    			"Image URL : "+tempValues, 
    			Toast.LENGTH_LONG)
    	.show();
    }
    
    // Image urls used in LazyImageLoadAdapter.java file
    
    private String[] mStrings={
            "http://androidexample.com/media/webservice/LazyListView_images/image0.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image1.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image2.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image3.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image4.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image5.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image6.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image7.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image8.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image9.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image10.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image0.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image1.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image2.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image3.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image4.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image5.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image6.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image7.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image8.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image9.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image10.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image0.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image1.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image2.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image3.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image4.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image5.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image6.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image7.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image8.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image9.png",
            "http://androidexample.com/media/webservice/LazyListView_images/image10.png"
            
    };
}