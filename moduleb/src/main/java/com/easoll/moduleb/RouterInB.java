package com.easoll.moduleb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;

import com.easoll.routermodule.IRouter;
import com.easoll.routermodule.CenterRouter;

/**
 * Created by easoll on 17/3/8.
 */

public class RouterInB implements IRouter{
    private SparseArray<Class> mActivities = new SparseArray<>();

    public RouterInB(){
        mActivities.put(CenterRouter.MODULE_B_ACTIVITY_A, AActivity.class);
    }

    @Override
    public void startFragment(int fragmentID) {

    }

    @Override
    public void startActivity(Context context, int activityID) {
        Class<? extends Activity> a = mActivities.get(activityID);
        Intent intent = new Intent(context, a);
        context.startActivity(intent);
    }
}
