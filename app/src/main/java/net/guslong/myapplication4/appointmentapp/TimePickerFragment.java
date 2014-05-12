package net.guslong.myapplication4.appointmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.guslong.myapplication4.app.R;


/**
 * Created by anguslong on 11/05/14.
 */
public class TimePickerFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.time_picker_fragment, container, false);
        return v;
    }
}
