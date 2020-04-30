package com.jbeeappz.dinodex.dinodex;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/** Copyright 2019 Justin Bee
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 **/

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
            fragment = new History();
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
                fragment = new History();
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
                fragment = new Austroraptor();
                title = getString(R.string.austroraptor);
                break;
            case 8:
                fragment = new Barapasaurus();
                title = getString(R.string.barapasaurus);
                break;
            case 9:
                fragment= new Baryonyx();
                title = getString(R.string.baryonyx);
                break;
            case 10:
                fragment= new Brach();
                title = getString(R.string.brach);
                break;
            case 11:
                fragment= new Camarasaurus();
                title = getString(R.string.camarasaurus);
                break;
            case 12:
                fragment= new Carnotaurus();
                title = getString(R.string.carnotaurus);
                break;
            case 13:
                fragment = new Coelophysis();
                title = getString(R.string.coelophysis);
                break;
            case 14:
                fragment = new Compsognathus();
                title = getString(R.string.compsognathus);
                break;
            case 15:
                fragment = new Crylophosaurus();
                title = getString(R.string.crylophosaurus);
                break;
            case 16:
                fragment = new Deinonychus();
                title = getString(R.string.deinonychus);
                break;
            case 17:
                fragment = new Dilophosaurus();
                title = getString(R.string.dilophosaurus);
                break;
            case 18:
                fragment = new Dimetrodon();
                title = getString(R.string.dimetrodon);
                break;
            case 19:
                fragment = new Diplodocus();
                title = getString(R.string.diplodocus);
                break;
            case 20:
                fragment = new Edmontonia();
                title = getString(R.string.edmontonia);
                break;
            case 21:
                fragment = new Elaphrosaurus();
                title = getString(R.string.elaphrosaurus);
                break;
            case 22:
                fragment = new Elasmosaurus();
                title = getString(R.string.elasmosaurus);
                break;
            case 23:
                fragment = new Fukuiraptor();
                title = getString(R.string.fukuiraptor);
                break;
            case 24:
                fragment = new Gallimimus();
                title = getString(R.string.gallimimus);
                break;
            case 25:
                fragment = new Gigantosaurus();
                title = getString(R.string.gigantosaurus);
                break;
            case 26:
                fragment = new Guanlong();
                title = getString(R.string.guanlong);
                break;
            case 27:
                fragment = new Herrerasaurus();
                title = getString(R.string.herrerasaurus);
                break;
            case 28:
                fragment = new Iguanodon();
                title = getString(R.string.iguanodon);
                break;
            case 29:
                fragment = new Irritator();
                title = getString(R.string.irritator);
                break;
            case 30:
                fragment = new Kronosaurus();
                title = getString(R.string.kronosaurus);
                break;
            case 31:
                fragment = new Limusaurus();
                title = getString(R.string.limusaurus);
                break;
            case 32:
                fragment = new Liopleurodon();
                title = getString(R.string.liopleurodon);
                break;
            case 33:
                fragment = new Majungasaurus();
                title = getString(R.string.majungasaurus);
                break;
            case 34:
                fragment = new Microraptor();
                title = getString(R.string.microraptor);
                break;
            case 35:
                fragment = new Mosasaurus();
                title = getString(R.string.mosasaurus);
                break;
            case 36:
                fragment = new Murusraptor();
                title = getString(R.string.murusraptor);
                break;
            case 37:
                fragment = new Muttaburrasaurus();
                title =  getString(R.string.muttaburrasaurus);
                break;
            case 38:
                fragment = new Neovenator();
                title = getString(R.string.neovenator);
                break;
            case 39:
                fragment = new Nomingia();
                title = getString(R.string.nomingia);
                break;
            case 40:
                fragment = new Pachycephalosaurus();
                title = getString(R.string.pachycephalosaurus);
                break;
            case 41:
                fragment = new Parasaurolophus();
                title = getString(R.string.parasaurolophus);
                break;
            case 42:
                fragment = new Plateosaurus();
                title = getString(R.string.plateosaurus);
                break;
            case 43:
                fragment = new Protoceratops();
                title = getString(R.string.protoceratops);
                break;
            case 44:
                fragment = new Pteranodon();
                title = getString(R.string.pteranodon);
                break;
            case 45:
                fragment = new Quetzalcoatlus();
                title = getString(R.string.quetzalcoatlus);
                break;
            case 46:
                fragment = new Scutosaurus();
                title = getString(R.string.scutosaurus);
                break;
            case 47:
                fragment = new Skorpiovenator();
                title = getString(R.string.skorpiovenator);
                break;
            case 48:
                fragment = new Spinosaurus();
                title = getString(R.string.spinosaurus);
                break;
            case 49:
                fragment = new Spinostropheus();
                title = getString(R.string.spinostropheus);
                break;
            case 50:
                fragment = new Stegoceras();
                title = getString(R.string.stegoceras);
                break;
            case 51:
                fragment = new Stegosaurus();
                title = getString(R.string.stegosaurus);
                break;
            case 52:
                fragment = new Struthiomimus();
                title = getString(R.string.strutiomimus);
                break;
            case 53:
                fragment = new Styracosaurus();
                title = getString(R.string.styracosaurus);
                break;
            case 54:
                fragment = new Tenontosaurus();
                title = getString (R.string.tenontosaurus);
                break;
            case 55:
                fragment = new Therizonosaurus();
                title = getString(R.string.therizonosaurus);
                break;
            case 56:
                fragment = new Torvosaurus();
                title = getString(R.string.torvosaurus);
                break;
            case 57:
                fragment = new Trex();
                title = getString(R.string.trex);
                break;
            case 58:
                fragment = new Triceratops();
                title = getString(R.string.triceratops);
                break;
            case 59:
                fragment = new Utahraptor();
                title = getString(R.string.utahraptor);
                break;
            case 60:
                fragment = new Velociraptor();
                title = getString(R.string.velociraptor);
                break;
            case 61:
                fragment = new Yanchuanosaurus();
                title = getString(R.string.yanchuanosaurus);
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
