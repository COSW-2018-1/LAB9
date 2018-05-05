package cosw.eci.edu.intents_camera_activities_fragments;


import android.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cosw.eci.edu.intents_camera_activities_fragments.Pojos.Post;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "MainActivity";

    EditText text;
    ImageView imageView;
    Button saveAll, loadImage, takePhoto;
    Boolean imageLoad;
    static Post post;
    Uri loadUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*

        imageLoad = false;


        text = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);
        saveAll = findViewById(R.id.saveAll);
        loadImage = findViewById(R.id.BtnLoad);
        */
    }



    /*
    SE PUEDE QUITAR Y SE CAMBIA EL IMPORT POR:
    mport android.app.Fragment;
     */


    public void showFragment(Fragment fragment, boolean addToBackStack)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        String tag = fragment.getClass().getSimpleName();
        if ( addToBackStack )
        {
            transaction.addToBackStack( tag );
        }
        transaction.replace( R.id.fragment_container, fragment, tag );
        transaction.commitAllowingStateLoss();
    }




    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Desea salir de la aplicación?");
        builder.setTitle("Salir de App");


        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });


        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }

    /*
    public void saveAll(View view) {


        if(text.getText().toString().equals("enter message") || text.getText().toString().equals("") || !imageLoad){
            Toast toast1 = Toast.makeText(getApplicationContext(), "Please enter either a message or select an image ", Toast.LENGTH_LONG);
            toast1.setGravity(Gravity.CENTER,0 ,0 );
            toast1.show();

        }
        else{

           if(text.getText().toString().length() > 50){
               Toast toast1 = Toast.makeText(getApplicationContext(), "The message is very long, maximum 50 characters ", Toast.LENGTH_LONG);
               toast1.setGravity(Gravity.CENTER,0 ,0 );
               toast1.show();
           }
           else{

               ///comentar
               Intent intent = new Intent(this, PostActivity.class);
               EditText editText = findViewById(R.id.editText);
               String message = editText.getText().toString();
               intent.putExtra(EXTRA_MESSAGE, message);
               startActivity(intent);
               // -- aca


                ///-- comentar
               // CREAR EL OBJETO PARA QUE EN EL POSTACTIVITY SE MUESTRE EL MENSAJE Y LA IMAGEN(URI)
               post = new Post();
               post.setMessage(text.getText().toString());
               post.setUriImage(loadUri);


               Intent intent = new Intent(MainActivity.this, PostActivity.class);

               intent.putExtra(EXTRA_MESSAGE, post);

               //try
               //{

                   startActivity(intent);
               //}
               //catch (Exception e){
                   System.out.println("====================================== Exception occurred");
                   System.out.println("message: "+post.getMessage());
                   System.out.println("Uri image: "+post.getUriImage().toString());
               //}
               //-- aca

               // INTENT NORMAL
               // CREAR EL OBJETO PARA QUE EN EL POSTACTIVITY SE MUESTRE EL MENSAJE Y LA IMAGEN(URI)
               post = new Post();
               post.setMessage(text.getText().toString());
               post.setUriImage(loadUri);

               Intent intent = new Intent(MainActivity.this, PostActivity.class );
               startActivity(intent);

           }


        }



    }*/



    /**
     * Mirar el NewPostFragmente
     * @param view
     */ /*
    public void onClickLoadPhoto(View view) {
        cargarImagen();
    }*/

    /**
     * Mirar el NewPostFragmente
     *//*
    private void cargarImagen() {
        Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la Aplicación"),10);
    }*/

    /**
     * Dispatch incoming result to the correct fragment.  Para saber si se selecciono la imagen
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode== RESULT_OK){
            imageLoad = true;
            loadUri = data.getData();
            imageView.setImageURI(loadUri);

        }
    }*/



}