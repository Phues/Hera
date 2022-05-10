package dz.esisba.a2cpi_project.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import dz.esisba.a2cpi_project.navigation_fragments.profile_fragments.AllFragment;
import dz.esisba.a2cpi_project.navigation_fragments.profile_fragments.AnswersFragment;
import dz.esisba.a2cpi_project.navigation_fragments.profile_fragments.QuestionsFragment;

public class UserProfileAdapter extends FragmentStateAdapter {

    private String[] titles = {"All" , "Questions" , "Answers"};

    public UserProfileAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new AllFragment();
            case 1 :
                return new QuestionsFragment();
            case 2 :
                return new AnswersFragment();
        }
        return new AllFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
