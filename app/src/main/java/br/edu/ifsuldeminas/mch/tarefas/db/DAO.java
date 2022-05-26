package br.edu.ifsuldeminas.mch.tarefas.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

abstract class DAO {

    abstract class <T>{

    private DBHandler dbHandler = null;

    DAO(Context context) {
        if (dbHandler == null) {
            dbHandler = new DBHandler(context);
        }
    }

    SQLiteDatabase openToWrite(){
        return dbHandler.getWritableDatabase();
    }

    SQLiteDatabase openToRead(){
        return dbHandler.getWritableDatabase();
    }

    public abstract void save(T entity);
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract void List<T> listAll();

}
