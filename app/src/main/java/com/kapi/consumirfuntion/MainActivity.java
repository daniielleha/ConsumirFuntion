  package com.kapi.consumirfuntion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.kapi.consumirfuntion.Adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

  public class MainActivity extends AppCompatActivity {
      RecyclerView recyclerView;
      List<Name> names;
      private static String JSON_URL = "https://restcountries.eu/rest/v2/all";
      Adapter adapter;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

          recyclerView = findViewById(R.id.paisList);
          names = new ArrayList<>();
          extractNames();
      }

      private void extractNames() {
          RequestQueue queue = Volley.newRequestQueue(this);
          JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
              @Override
              public void onResponse(JSONArray response) {
                  for (int i = 0; i < response.length(); i++) {
                      try {
                          JSONObject nameObject = response.getJSONObject(i);

                          Name name = new Name();
                          name.setNombre(nameObject.getString("name").toString());
                          name.setCapi(nameObject.getString("capital".toString()));
                          name.setImage(nameObject.getString("flag"));
                          //song.setSongURL(songObject.getString("url"));
                          names.add(name);

                      } catch (JSONException e) {
                          Toast toast=Toast.makeText(getApplicationContext(),"JSON EXCEPTION e ERROR",Toast.LENGTH_SHORT);
                          toast.show();
                          e.printStackTrace();
                      }
                  }

                  recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                  adapter = new Adapter(getApplicationContext(),names);
                  recyclerView.setAdapter(adapter);
              }
          }, new Response.ErrorListener() {
              @Override
              public void onErrorResponse(VolleyError error) {
                  Toast toast=Toast.makeText(getApplicationContext(),"Error al mostrar datos",Toast.LENGTH_LONG);
                  toast.show();
                  Log.d("tag", "Respuesta erronea: " + error.getMessage());
              }
          });

          queue.add(jsonArrayRequest);

      }
  }