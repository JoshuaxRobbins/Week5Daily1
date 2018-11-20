package com.example.josh.week5daily1.CProvider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

public class EmployeeDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "employeeList.db";
    public EmployeeDBHelper(@NonNull Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        addEmployeeTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void addEmployeeTable(SQLiteDatabase db){
        db.execSQL(
                "CREATE TABLE " + EmployeeContract.EmployeeEntry.TABLE_NAME + " (" +
                        EmployeeContract.EmployeeEntry._ID + " INTEGER PRIMARY KEY, " +
                        EmployeeContract.EmployeeEntry.COLUMN_FIRST + " TEXT NOT NULL, " +
                        EmployeeContract.EmployeeEntry.COLUMN_LAST + " TEXT NOT NULL, " +
                        EmployeeContract.EmployeeEntry.COLUMN_SALARY + " INTEGER NOT NULL, " +
                        EmployeeContract.EmployeeEntry.COLUMN_DAYS + " INTEGER NOT NULL) "
        );
    }
}
