package com.easoll.modulea;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;

import com.easoll.routermodule.IRouter;
import com.easoll.routermodule.CenterRouter;

/**
 * Created by easoll on 17/3/8.
 */

public class RouterInA implements IRouter {
    private SparseArray<Class> mActivities = new SparseArray<>();

    public RouterInA(){
        mActivities.put(CenterRouter.MODULE_A_ACTIVITY_A, AActivity.class);
    }

    @Override
    public void startFragment(int fragmentID) {

    }

    @Override
    public void startActivity(Context context, int activityID) {
        Intent intent = new Intent(context, mActivities.get(activityID));
        context.startActivity(intent);
    }
}
