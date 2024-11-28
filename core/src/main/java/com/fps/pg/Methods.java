package com.fps.pg;

import com.badlogic.gdx.Gdx;

public  class Methods {

    public static void print(String value){
        Gdx.app.log("Game",value);
    }
    public static void print(String tag,String value){
        Gdx.app.log(tag,value);
    }
}
