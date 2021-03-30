  package com.kapi.consumirfuntion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.kapi.consumirfuntion.Adapter.AdapterRecy;

import org.json.JSONObject;

  public class MainActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          MyRecycle[] myListData = new MyRecycle[]{
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
                  new MyRecycle("Email", android.R.drawable.ic_dialog_email),
          };

          RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvLista);
          AdapterRecy adapter = new AdapterRecy(myListData);
          recyclerView.setHasFixedSize(true);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));
          recyclerView.setAdapter(adapter);
      }
  }