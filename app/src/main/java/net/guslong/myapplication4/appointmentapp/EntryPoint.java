package net.guslong.myapplication4.appointmentapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;

import net.guslong.myapplication4.app.R;

/**
 * Created by anguslong on 11/05/14.
 */
public class EntryPoint extends Activity {

    static final String TAG = "EntryPoint";
    FragmentManager fm;
    Fragment timePickerFragment = new TimePickerFragment();
    Fragment appointmentFragment = new AppointmentFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_point);
        fm = getFragmentManager();

        // gets references to the two LinearLayouts in the entry_point.xml and initialise the fragments
        fm.beginTransaction().add(R.id.fragmentContainer1, appointmentFragment).commit();
        fm.beginTransaction().add(R.id.fragmentContainer2, timePickerFragment).commit();

        // initialise the timePickerFragment to visible
        updateFragmentVisibility(true);
    }

    /**
     * show / hide timePickerFragment depending on if the user has selected 'all day event'
     * @param isAllDayEvent state of the checkbox
     */

     public void updateFragmentVisibility(Boolean isAllDayEvent) {

        Log.d(TAG, "Calling updateFragmentVisbility() method. Checkbox state is:" + isAllDayEvent);

        FragmentTransaction ft = fm.beginTransaction();
        if (isAllDayEvent) {
            Log.d(TAG, "Hiding time picker");
            ft.hide(timePickerFragment);

        }
        else {
            // if not an all day event, show the timepicker
            Log.d(TAG, "Showing time picker");
            ft.show(timePickerFragment);

        }
        ft.commit();

    }
}
