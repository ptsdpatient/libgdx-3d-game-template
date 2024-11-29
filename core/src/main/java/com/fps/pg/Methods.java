package com.fps.pg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.UBJsonReader;

public  class Methods {

    public static void print(String value){
        Gdx.app.log("Game",value);
    }
    public static void print(String tag,String value){
        Gdx.app.log(tag,value);
    }
    public static FileHandle files(String value){
       return Gdx.files.internal(value);
    }

    public static Model loadModel(String value){
        return new G3dModelLoader(new UBJsonReader()).loadModel(files(value));
    }
}
