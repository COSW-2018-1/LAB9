package cosw.eci.edu.intents_camera_activities_fragments.Pojos;

import android.net.Uri;

import java.io.Serializable;

public class Post implements Serializable {

    private String message;
    private Uri uriImage;


    public Post(){

    }


    public Post(String message, Uri uriImage){
        this.message = message;
        this.uriImage = uriImage;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Uri getUriImage() {
        return uriImage;
    }

    public void setUriImage(Uri uriImage) {
        this.uriImage = uriImage;
    }
}
