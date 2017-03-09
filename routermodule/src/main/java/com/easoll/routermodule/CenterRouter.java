package com.easoll.routermodule;

import android.content.Context;

/**
 * Created by easoll on 17/3/8.
 */

public class CenterRouter implements IRouter{
    public static final int MODULE_A_ACTIVITY_A = 1;
    public static final int MODULE_B_ACTIVITY_A = 101;

    private static CenterRouter mInstance;
    private IRouter routerInModuleA;
    private IRouter routerInModuleB;

    private CenterRouter(){
        try {
            Class clazz = Class.forName("com.easoll.modulea.RouterInA");
            routerInModuleA = (IRouter)clazz.newInstance();
            clazz = Class.forName("com.easoll.moduleb.RouterInB");
            routerInModuleB = (IRouter)clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static CenterRouter getInstance(){
        if(mInstance == null){
            synchronized (CenterRouter.class){
                if(mInstance == null){
                    mInstance = new CenterRouter();
                }
            }
        }

        return mInstance;
    }

    @Override
    public void startFragment(int fragmentID) {

    }

    @Override
    public void startActivity(Context context, int activityId){
        if(activityId > 0 && activityId <= 100){
            routerInModuleA.startActivity(context, activityId);
        }else if (activityId > 100 && activityId <= 200){
            routerInModuleB.startActivity(context, activityId);
        }
    }
}
