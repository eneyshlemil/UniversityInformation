package com.example.universityinformation.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.universityinformation.R;
import com.example.universityinformation.databinding.FragmentHomeBinding;
import com.example.universityinformation.model.Faculty;

public class FacultyFragment extends Fragment {

    private FragmentHomeBinding binding;
    private Faculty faculty;

    public FacultyFragment(Faculty faculty) {
        this.faculty = faculty;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        textView.setText(faculty.getName());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}