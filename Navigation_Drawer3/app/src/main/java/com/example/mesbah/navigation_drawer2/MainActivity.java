package com.example.mesbah.navigation_drawer2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.DrawableUtils;
import android.support.design.widget.NavigationView;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.TintableImageSourceView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawView);

        NavigationView navigationView=findViewById(R.id.navigation_view);
        mToggle=new ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close);

        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
    public boolean onNavigationItemSelected(@NonNull final MenuItem menuItem)
    {
        int id=menuItem.getItemId();

        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item)
            {
                menuItem.setEnabled(true);
                //item.setTitle(Html.fromHtml("<font color='#ff3824'>setting</font"));

                //item.setIcon(R.drawable.tint_color);
                return false;
            }
        });
        if(id==R.id.about)
        {
            menuItem.setTitle(Html.fromHtml("<font color='#ff3824'>setting</font"));
            Drawable drawable=menuItem.getIcon();
            Drawable wrappped=DrawableCompat.wrap(drawable);
            drawable.mutate();
            DrawableCompat.setTint(wrappped,R.drawable.tint_color);
            Toast.makeText(this, "about section clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}
