package com.daviancorp.android.ui.general;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daviancorp.android.data.classes.Quest;
import com.daviancorp.android.loader.QuestLoader;
import com.daviancorp.android.mh4udatabase.R;
import com.daviancorp.android.ui.detail.ASBActivity;
import com.daviancorp.android.ui.list.ArmorListActivity;
import com.daviancorp.android.ui.list.CombiningListActivity;
import com.daviancorp.android.ui.list.DecorationListActivity;
import com.daviancorp.android.ui.list.ItemListActivity;
import com.daviancorp.android.ui.list.LocationListActivity;
import com.daviancorp.android.ui.list.MonsterListActivity;
import com.daviancorp.android.ui.list.QuestListActivity;
import com.daviancorp.android.ui.list.SkillTreeListActivity;
import com.daviancorp.android.ui.list.WeaponSelectionListActivity;
import com.daviancorp.android.ui.list.WishlistListActivity;
import com.daviancorp.android.ui.list.WyporiumTradeListActivity;

public class HomeFragment extends Fragment {

    private ImageView mLogo;		// Image logo for home screen

    // Options to navigate
    private TextView mMonsters, mWeapons, mArmors, mQuests, mItems, mCombining,
            mDecorations, mSkillTrees, mLocations, mHuntingFleet, mArenaQuests, mWishlists,
            mWyporiumTrade;

    private ProgressDialog progress;	// Progress spinner upon creating/updating database

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Make a dummy query to create/update database if needed
        LoaderManager lm = getLoaderManager();
        lm.initLoader(R.id.home_fragment, null, new DummyLoaderCallbacks());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, parent, false);

        mMonsters = (TextView) v.findViewById(R.id.monsters);
        mWeapons = (TextView) v.findViewById(R.id.monsters);
        mArmors = (TextView) v.findViewById(R.id.monsters);
        mQuests = (TextView) v.findViewById(R.id.monsters);
        mItems = (TextView) v.findViewById(R.id.monsters);
        mCombining = (TextView) v.findViewById(R.id.monsters);
        mDecorations = (TextView) v.findViewById(R.id.monsters); // Disabled
        mSkillTrees = (TextView) v.findViewById(R.id.monsters);
        mLocations = (TextView) v.findViewById(R.id.monsters);
        //mArenaQuests = (TextView) v.findViewById(R.id.arena_quests); // Disabled
        mWishlists = (TextView) v.findViewById(R.id.monsters);
        mWyporiumTrade = (TextView) v.findViewById(R.id.monsters
        );

        mMonsters.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mWeapons.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mArmors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mQuests.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mItems.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mCombining.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mDecorations.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mSkillTrees.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mLocations.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mWyporiumTrade.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

//		mArenaQuests.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent(getActivity(), ArenaQuestListActivity.class);
//				startActivity(intent);
//			}
//		});

        mWishlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });

        mLogo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MonsterListActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }

    /*
     * For dummy query
     */
    private class DummyLoaderCallbacks implements LoaderCallbacks<Quest> {

        @Override
        public Loader<Quest> onCreateLoader(int id, Bundle args) {
            progress = new ProgressDialog(getActivity());
            progress.setTitle("Loading");
            progress.setMessage("Loading database...");
            progress.show();
            return new QuestLoader(getActivity(), 1);
        }

        @Override
        public void onLoadFinished(Loader<Quest> loader, Quest dummy) {
            progress.dismiss();
        }

        @Override
        public void onLoaderReset(Loader<Quest> loader) {
            // Do nothing
        }
    }
}