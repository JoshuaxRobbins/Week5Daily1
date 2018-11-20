package com.example.josh.week5daily1.CProvider;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

public class EmployeeContract {

    public static final String CONTENT_AUTHORITY = "com.example.josh.week5daily1";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_EMPLOYEE = "employee";


    private EmployeeContract(){

    }

    public static final class EmployeeEntry implements BaseColumns{

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_EMPLOYEE).build();

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_EMPLOYEE;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_EMPLOYEE;

        public static final String TABLE_NAME = "employeeTable";
        public static final String COLUMN_FIRST = "firstName";
        public static final String COLUMN_LAST = "lastName";
        public static final String COLUMN_SALARY = "salary";
        public static final String COLUMN_DAYS = "days";

        public static Uri buildEmployeeUri(long id){
            return ContentUris.withAppendedId(CONTENT_URI,id);
        }



    }
}
