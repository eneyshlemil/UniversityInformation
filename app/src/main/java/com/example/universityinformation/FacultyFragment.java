package com.example.universityinformation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.universityinformation.model.Faculty;

public class FacultyFragment extends Fragment {
    private Faculty faculty;

    public FacultyFragment(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_faculty, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tvFaculty);
        textView.setText(this.faculty.getName());

        return view;
    }
}