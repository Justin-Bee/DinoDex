package com.jbeeappz.dinodex.dinodex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.action_search){
            Fragment fragment = null;
            String title = getString(R.string.app_name);
            fragment = new history();
            title = getString(R.string.history);
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new history();
                title = getString(R.string.history);
                break;
            case 1:
                fragment = new Albertosaurus();
                title = getString(R.string.albertosaurus);
                break;
            case 2:
                fragment = new Alioramus();
                title = getString(R.string.alioramus);
                break;
            case 3:
                fragment = new Allosaurus();
                title = getString(R.string.allosaurus);
                break;
            case 4:
                fragment = new Amargasaurus();
                title = getString(R.string.amargasaurus);
                break;
            case 5:
                fragment= new Ankylosaurus();
                title = getString(R.string.ankylosaurus);
                break;
            case 6:
                fragment = new Atlasaurus();
                title = getString(R.string.atlasaurus);
                break;
            case 7:
                fragment= new Baryonyx();
                title = getString(R.string.baryonyx);
                break;
            case 8:
                fragment= new Brach();
                title = getString(R.string.brach);
                break;
            case 9:
                fragment= new camarasaurus();
                title = getString(R.string.camarasaurus);
                break;
            case 10:
                fragment= new carnotaurus();
                title = getString(R.string.carnotaurus);
                break;
            case 11:
                fragment = new crylophosaurus();
                title = getString(R.string.crylophosaurus);
                break;
            case 12:
                fragment = new deinonychus();
                title = getString(R.string.deinonychus);
                break;
            case 13:
                fragment = new dilophosaurus();
                title = getString(R.string.dilophosaurus);
                break;
            case 14:
                fragment = new dimetrodon();
                title = getString(R.string.dimetrodon);
                break;
            case 15:
                fragment = new diplodocus();
                title = getString(R.string.diplodocus);
                break;
            case 16:
                fragment = new edmontonia();
                title = getString(R.string.edmontonia);
                break;
            case 17:
                fragment = new elasmosaurus();
                title = getString(R.string.elasmosaurus);
                break;
            case 18:
                fragment = new gallimimus();
                title = getString(R.string.gallimimus);
                break;
            case 19:
                fragment = new gigantosaurus();
                title = getString(R.string.gigantosaurus);
                break;
            case 20:
                fragment = new guanlong();
                title = getString(R.string.guanlong);
                break;
            case 21:
                fragment = new iguanodon();
                title = getString(R.string.iguanodon);
                break;
            case 22:
                fragment = new kronosaurus();
                title = getString(R.string.kronosaurus);
                break;
            case 23:
                fragment = new liopleurodon();
                title = getString(R.string.liopleurodon);
                break;
            case 24:
                fragment = new microraptor();
                title = getString(R.string.microraptor);
                break;
            case 25:
                fragment = new mosasaurus();
                title = getString(R.string.mosasaurus);
                break;
            case 26:
                fragment = new pachycephalosaurus();
                title = getString(R.string.pachycephalosaurus);
                break;
            case 27:
                fragment = new parasaurolophus();
                title = getString(R.string.parasaurolophus);
                break;
            case 28:
                fragment = new pteranodon();
                title = getString(R.string.pteranodon);
                break;
            case 29:
                fragment = new quetzalcoatlus();
                title = getString(R.string.quetzalcoatlus);
                break;
            case 30:
                fragment = new spinosaurus();
                title = getString(R.string.spinosaurus);
                break;
            case 31:
                fragment = new stegosaurus();
                title = getString(R.string.stegosaurus);
                break;
            case 32:
                fragment = new struthiomimus();
                title = getString(R.string.strutiomimus);
                break;
            case 33:
                fragment = new styracosaurus();
                title = getString(R.string.styracosaurus);
                break;
            case 34:
                fragment = new tenontosaurus();
                title = getString (R.string.tenontosaurus);
                break;
            case 35:
                fragment = new therizonosaurus();
                title = getString(R.string.therizonosaurus);
                break;
            case 36:
                fragment = new trex();
                title = getString(R.string.trex);
                break;
            case 37:
                fragment = new triceratops();
                title = getString(R.string.triceratops);
                break;
            case 38:
                fragment = new utahraptor();
                title = getString(R.string.utahraptor);
                break;
            case 39:
                fragment = new velociraptor();
                title = getString(R.string.velociraptor);
                break;

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}
