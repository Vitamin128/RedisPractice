package com.example.redistemplate.iterface;

import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.dao.OutPutItem;

import java.util.ArrayList;

public interface Redis {
    boolean AddRankItem(IputUserItem item);

    Long SearchRank(String name);

    ArrayList<OutPutItem> GetAllItem();

    ArrayList<OutPutItem> GetAllItemLimit(int limit);

    Long DeleteAllItems();

    Long DeleteSingleItem(String name);
}
