package com.demo.projectmvvm.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.demo.projectmvvm.pojo.Employee;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Query("SELECT*FROM MVVMemployees")
    LiveData<List<Employee>> getAllEmployees();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEmployees(List<Employee> employees);

    @Query("DELETE FROM MVVMemployees")
    void deleteAllEmployees();
}