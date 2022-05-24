package com.example.quizz_app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.quizz_app.R;
import com.example.quizz_app.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private GridView catView;
    private List<HomeViewModel> catList =new ArrayList<>();

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


       root = inflater.inflate(R.layout.fragment_home,container, false);

       catView = root.findViewById(R.id.cat_Grid);
       loadHome();
       HomeAdapter adapter= new HomeAdapter(catList);
       catView.setAdapter(adapter);



        return root;
    }

    private void loadHome() {
        catList.clear();
        catList.add(new HomeViewModel("1","Kiểm tra nhanh","25"));
        catList.add(new HomeViewModel("2","Địa lý","25"));
        catList.add(new HomeViewModel("3","Lịch sử","25"));
        catList.add(new HomeViewModel("4","Giáo dục công dân","25"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}