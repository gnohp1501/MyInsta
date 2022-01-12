package com.example.myinsta.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myinsta.Fragments.ChatFragment;
import com.example.myinsta.Fragments.UserChatFragment;

public class ViewPagerChatAdapter extends FragmentStatePagerAdapter {

    public ViewPagerChatAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();

            case 1:
                return new UserChatFragment();

            default:
                return new ChatFragment();

        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";

        switch (position){
            case 0:
                title = "Chats";
                break;
            case 1:
                title = "Users";
                break;
        }

        return title;
    }
}
