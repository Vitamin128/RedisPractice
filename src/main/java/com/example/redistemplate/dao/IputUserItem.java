package com.example.redistemplate.dao;

import com.example.redistemplate.iterface.Redis;
import lombok.Data;

import java.io.Serializable;

@Data
public class IputUserItem implements Serializable {
    String name;
    Double score;
}
