package com.example.colleger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SemesterAdapter extends ArrayAdapter<Semester> {
    public SemesterAdapter(Context context, List<Semester> semesters) {
        super(context, 0, semesters);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Semester semester = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        TextView textView = convertView.findViewById(android.R.id.text1);

        if (semester != null) {
            textView.setText(semester.getSemesterName());
        }

        return convertView;
    }
}