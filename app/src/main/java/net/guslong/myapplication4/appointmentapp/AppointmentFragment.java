package net.guslong.myapplication4.appointmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import net.guslong.myapplication4.app.R;


/**
 * Created by anguslong on 11/05/14.
 */
public class AppointmentFragment extends Fragment {
    static final String TAG = "AppointmentFragment";
    CheckBox allDayCheckBox;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.appointment_fragment, container, false);

        allDayCheckBox = (CheckBox)view.findViewById(R.id.checkBox);

        allDayCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isAllDayEvent) {
                Log.d(TAG, "Checkbox clicked, value is: " + isAllDayEvent);

                // to call the method in parent activity, you need to get activity and cast it
                ((EntryPoint)getActivity()).updateFragmentVisibility(isAllDayEvent);

            }
        });
        return view;


    }


}
