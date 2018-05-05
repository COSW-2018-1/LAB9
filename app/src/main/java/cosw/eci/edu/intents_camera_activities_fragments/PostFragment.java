package cosw.eci.edu.intents_camera_activities_fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cosw.eci.edu.intents_camera_activities_fragments.Pojos.Post;

public class PostFragment extends Fragment {

    TextView textView;
    ImageView imageView;
    Post post;

    public PostFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_post, container, false);

        textView = view.findViewById(R.id.textView);
        imageView = view.findViewById(R.id.imageView);


        Intent intent = getActivity().getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //textView.setText(message);

        post = NewPostFragment.getPost();

        textView.setText(post.getMessage());
        imageView.setImageURI(post.getUriImage());


        return view;
    }

}
