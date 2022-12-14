package com.example.springbootdemo.mapper;
import com.example.springbootdemo.bean.pet;
import java.util.List;

public interface PetMapper {
    void add(String name, String other, String type, String symptom, String result, String date);

    void delete(String name, String type);

    void update(String name, String other, String type, String symptom, String result);

    List<pet> select();

    List<pet> selectName(String name);
    List<pet> selectType(String type);
    List<pet> selectNT(String name,String type);
}
