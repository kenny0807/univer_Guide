package com.daviancorp.android.ui.ClickListeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.daviancorp.android.ui.adapter.WeaponDetailPagerAdapter;
import com.daviancorp.android.ui.detail.ArmorDetailActivity;
import com.daviancorp.android.ui.detail.MonsterDetailActivity;
import com.daviancorp.android.ui.detail.WeaponDetailActivity;

/**
 * Created by Mark on 2/24/2015.
 */
public class WeaponClickListener implements View.OnClickListener {
    private Context c;
    private Long id;

    public WeaponClickListener(Context context, Long id) {
        super();
        this.id = id;
        this.c = context;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(c, MonsterDetailActivity.class);
        i.putExtra(MonsterDetailActivity.EXTRA_MONSTER_ID, id);
        c.startActivity(i);
    }
}
