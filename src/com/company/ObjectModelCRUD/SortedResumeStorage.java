package com.company.ObjectModelCRUD;

/**
 * Created by Stas on 10.02.2017.
 */
public class SortedResumeStorage extends AbstractResumeStorage {
    @Override
    protected int getIndex(String uuid) {
        return -2;
    }
}
