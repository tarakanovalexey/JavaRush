package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.Arrays;
import java.util.List;

public class FakeModel implements Model {
    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    private ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(Arrays.asList(new User("Pasha", 2532, 3),
                new User("Nastya", 1013, 20), 
                new User("Lesha", 4949, 41)));
    }


}
