package com.example.mesbah.navigation_drawer2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.DrawableUtils;
import android.support.design.widget.NavigationView;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.TintableImageSourceView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mToggle;
    private static NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawView);

        //NavigationView navigationView=findViewById(R.id.navigation_view);
        mToggle=new ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close);

        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                    navigationView= findViewById(R.id.navigation_view);
                     navigationView.setNavigationItemSelectedListener(this);


        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)

    {

        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        Menu menu=navigationView.getMenu();
          int id=item.getItemId();

          if(id==R.id.myAcountIDItem)
          {
              Toast.makeText(this, "Iam here", Toast.LENGTH_SHORT).show();
              boolean b=!menu.findItem(R.id.BanglaID).isVisible();
             if(b)
             {
              menu.findItem(R.id.BanglaID).setVisible(b);
              menu.findItem(R.id.EnglishID).setVisible(b);
              menu.findItem(R.id.myAcountIDItem).setTitle("My Account     \u21d7");
             }
          else
             {
                 menu.findItem(R.id.BanglaID).setVisible(b);
                 menu.findItem(R.id.EnglishID).setVisible(b);
                 menu.findItem(R.id.myAcountIDItem).setTitle("My Account    \u21d9");
             }


              //return true;
          }
          else if(id==R.id.customeID)
          {


          }
          else if(id==R.id.settingIDItem)
          {


          }
          else if(id==R.id.aboutID)
          {


          }
          else if(id==R.id.contactusID)
          {


          }
         /* else if(id==R.id.BanglaID)
          {
              Toast.makeText(this, "Iam bangla", Toast.LENGTH_SHORT).show();
          }*/


        return false;
    }
}
