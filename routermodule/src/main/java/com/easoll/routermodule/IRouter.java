package com.easoll.routermodule;

import android.content.Context;

/**
 * Created by easoll on 17/3/8.
 */

public interface IRouter {
    void startFragment(int fragmentID);
    void startActivity(Context context, int activityID);
}
