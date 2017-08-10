package com.example.vogabond.chatapp.chatroom;

import android.content.Context;

import com.netease.nim.uikit.NimUIKit;
import com.netease.nimlib.sdk.StatusBarNotificationConfig;

/**
 * Created by yang。先森 on 2017/8/9 0009.
 */

public class DemoCache {
    private static Context context;
    private static String account;
    private static StatusBarNotificationConfig notificationConfig;
    public static void clear(){
        account = null;
    }
    private static String getAccount(){
        return account;
    }
    private static boolean mainTaskLaunching;

    public static void setAccount(String account){
        DemoCache.account = account;
        NimUIKit.setAccount(account);
    }

    public static void setNotificationConfig(StatusBarNotificationConfig notificationConfig) {
        DemoCache.notificationConfig = notificationConfig;
    }
    public static StatusBarNotificationConfig getNotificationConfig(){
        return notificationConfig;
    }
    public static Context getContext(){
        return context;
    }
    public static void setContext(Context context){
        DemoCache.context = context.getApplicationContext();
    }
    public static void setMainTaskLaunching(boolean mainTaskLaunching){
        DemoCache.mainTaskLaunching = mainTaskLaunching;
    }
    public static boolean isMainTaskLaunching(){
        return mainTaskLaunching;
    }
}
