package com.daviancorp.android.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.daviancorp.android.loader.HuntingRewardListCursorLoader;
import com.daviancorp.android.ui.detail.MonsterDamageFragment;
import com.daviancorp.android.ui.detail.MonsterHabitatFragment;
import com.daviancorp.android.ui.detail.MonsterQuestFragment;
import com.daviancorp.android.ui.detail.MonsterRewardFragment;
import com.daviancorp.android.ui.detail.MonsterStatusFragment;
import com.daviancorp.android.ui.detail.MonsterSummaryFragment;

public class MonsterDetailPagerAdapter extends FragmentPagerAdapter {
	
	private long monsterId;

	public MonsterDetailPagerAdapter(FragmentManager fm, long id) {
		super(fm);
		this.monsterId = id;
	}

    // Tab titles
    private String[] tabs = { "Общая информация","О факультетах", "Проходной балл"};

	@Override
	public Fragment getItem(int index) {

		switch (index) {
			case 0:
				// Monster Summary
				return MonsterSummaryFragment.newInstance(monsterId);
			case 1:
				// Monster Damage
                return MonsterQuestFragment.newInstance(monsterId);
			case 2:
				// Monster Status
                return MonsterRewardFragment.newInstance(monsterId, HuntingRewardListCursorLoader.RANK_G);
			default:
				return null;
		}
	}

    @Override
    public CharSequence getPageTitle(int index) {
        return tabs[index];
    }

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}