package com.slash.batterychargelimit;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Michael on 04.04.2017.
 *
 * A simple time picker
 */
public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Create a new instance of TimePickerDialog and return it, using "00:00" as default time
        return new TimePickerDialog(getActivity(), this, 0, 0,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(getActivity(), String.format(Locale.getDefault(), "%02d", hourOfDay)
                + ":" + String.format(Locale.getDefault(), "%02d", minute), Toast.LENGTH_SHORT).show();
    }
}