package cosw.eci.edu.intents_camera_activities_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cosw.eci.edu.intents_camera_activities_fragments.Pojos.Post;


public class NewPostFragment extends Fragment {

    private static int CAMERA_REQUEST_CODE = 10;


    EditText text;
    ImageView imageView;
    Button saveAll, loadImage, takePhoto;
    Boolean imageLoad;
    static Post post;
    Uri loadUri;


    public NewPostFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_post, container, false);


        imageLoad = false;


        text = view.findViewById(R.id.editText);
        imageView = view.findViewById(R.id.imageView);
        saveAll = view.findViewById(R.id.saveAll);
        loadImage = view.findViewById(R.id.BtnLoad);


        loadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarImagen();
            }
        });

        saveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAll();
            }
        });

        return view;
    }

    public void cargarImagen() {
        Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la Aplicación"),CAMERA_REQUEST_CODE);


        Toast toast = Toast.makeText(getContext(), "Seleccion una imagen", Toast.LENGTH_SHORT);
        toast.show();
    }


    public void saveAll() {


        if(text.getText().toString().equals("enter message") || text.getText().toString().equals("") || !imageLoad){
            Toast toast1 = Toast.makeText(getActivity().getApplicationContext(), "Please enter either a message or select an image ", Toast.LENGTH_LONG);
            toast1.setGravity(Gravity.CENTER,0 ,0 );
            toast1.show();

        }
        else{

            if(text.getText().toString().length() > 50){
                Toast toast1 = Toast.makeText(getActivity().getApplicationContext(), "The message is very long, maximum 50 characters ", Toast.LENGTH_LONG);
                toast1.setGravity(Gravity.CENTER,0 ,0 );
                toast1.show();
            }
            else{
                post = new Post();
                post.setMessage(text.getText().toString());
                post.setUriImage(loadUri);

                Intent intent = new Intent(getActivity(), PostActivity.class );
                startActivity(intent);

            }


        }



    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK){
            imageLoad = true;
            loadUri = data.getData();
            imageView.setImageURI(loadUri);

        }
    }



    public static Post getPost() {
        return post;
    }

}
