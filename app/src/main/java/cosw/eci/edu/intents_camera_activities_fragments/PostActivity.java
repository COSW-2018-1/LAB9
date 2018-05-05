package cosw.eci.edu.intents_camera_activities_fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cosw.eci.edu.intents_camera_activities_fragments.Pojos.Post;

public class PostActivity extends AppCompatActivity {

    /*
    TextView textView;
    ImageView imageView;
    Post post;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        /*
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);


        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //textView.setText(message);

        post = NewPostFragment.getPost();

        textView.setText(post.getMessage());
        imageView.setImageURI(post.getUriImage());
        */

        /*
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        post = (Post) intent.getSerializableExtra(MainActivity.EXTRA_MESSAGE);
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        textView.setText(post.getMessage());
        imageView.setImageURI(post.getUriImage());
        */

    }
}
