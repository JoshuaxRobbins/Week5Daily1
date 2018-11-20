package com.example.josh.week5daily1.CProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;

public class EmployeeProvider extends ContentProvider {
    public static final int EMPLOYEE = 100;
    public static final int EMPLOYEE_ID = 100;

    private EmployeeDBHelper employeeDBHelper;
    public static final UriMatcher uriMatcher = buildUriMatcher();


    @Override
    public boolean onCreate() {
        employeeDBHelper = new EmployeeDBHelper(getContext());
        return true;
    }

    @NonNull
    @Override
    public Cursor query(@NonNull Uri uri, @NonNull String[] projection, @NonNull String selection, @NonNull String[] selectionArgs, @NonNull String sortOrder) {
        return null;
    }

    @NonNull
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @NonNull
    @Override
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @NonNull String selection, @NonNull String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @NonNull ContentValues values, @NonNull String selection, @NonNull String[] selectionArgs) {
        return 0;
    }

    public static UriMatcher buildUriMatcher(){
        String content = EmployeeContract.CONTENT_AUTHORITY;

        // All paths to the UriMatcher have a corresponding code to return
        // when a match is found (the ints above).
        UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        matcher.addURI(content, EmployeeContract.PATH_EMPLOYEE, EMPLOYEE);
        matcher.addURI(content, EmployeeContract.PATH_EMPLOYEE + "/#", EMPLOYEE_ID);

        return matcher;
    }
}
