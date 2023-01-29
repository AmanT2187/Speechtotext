package com.example.speechtotext;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.CursorJoiner;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    imagebutton imagebutton;
    edittext edittext;
   SpeechRecognizer speechRecognizer ;
   int count =0;
    private int requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagebutton = findViewById(R.id.button);
        edittext = findViewById(R.id.edittext);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, requestCode:
            1);
                speechRecognizer=SpeechRecognizer.createSpeechRecognizer(this);
                Intent speechrecognizer= new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                final Intent speechrecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                View.setOnClickListener(new View.OnClickListener())

        }
        @Override
                public void onclickview(View V ){
                if(count==0)
                {
                    imagebutton.setImageDrawable(getDrawable(R.drawable.baseline_mic_24))

                }
                //start listening
                speechRecognizer.startListening(speechRecognizer Intent );
                count=1;
                else
                {
                    imagebutton.setImageDrawable(getDrawable(R.drawable.baseline_mic_24))
                            //stop listening
                    speechRecognizer.stopListening();
                  count=0;
    }

                speechRecognizer.setRecognitionListener(new RecognitionListener() {
                    @Override
                    public void onReadyForSpeech(Bundle bundle) {

                    }

                    @Override
                    public void onBeginningOfSpeech() {

                    }

                    @Override
                    public void onRmsChanged(float v) {

                    }

                    @Override
                    public void onBufferReceived(byte[] bytes) {

                    }

                    @Override
                    public void onEndOfSpeech() {

                    }

                    @Override
                    public void onError(int i) {

                    }

                    @Override
                    public void onResults(Bundle bundle) {

                        Object results;
                        ArrayList<String> data = results.getStringArraylist(speechRecognizer.RESULTS_RECOGNITION);
                        edittext.setText(data.get(0));
                    }

                    }

                    @Override
                    public void onPartialResults(Bundle bundle) {

                    }

                    @Override
                    public void onEvent(int i, Bundle bundle) {

                    }
                };
        @Override
         public void onRequestPermissionsResult(int requestcode,@NonNull String[] permission , @NonNull int[] grantresults () {
if ( requestcode==1) {
    int resld;
    if (grantresults[0] == PackageManager.PERMISSION_GRANTED)
        Toast.makeText(this, resld"Permission Granted", Toast.LENGTH_SHORT);
}
else{
    Toast.makeText(this, resld"Permission Denied", Toast.LENGTH_SHORT);
}


