package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> res = new ArrayList<>();
            for (Integer integer : arg)
                res.add(integer / divider);
            return res;
        };
    }
}
