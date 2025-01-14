package com.github.fppt.jedismock.operations.strings;

import com.github.fppt.jedismock.operations.AbstractRedisOperation;
import com.github.fppt.jedismock.operations.RedisCommand;
import com.github.fppt.jedismock.server.Response;
import com.github.fppt.jedismock.datastructures.Slice;
import com.github.fppt.jedismock.storage.RedisBase;

import java.util.List;

@RedisCommand("mset")
class MSet extends AbstractRedisOperation {
    MSet(RedisBase base, List<Slice> params ) {
        super(base, params);
    }

    protected Slice response() {
        for (int i = 0; i < params().size(); i += 2) {
            base().putSlice(params().get(i), params().get(i + 1));
        }
        return Response.OK;
    }
}
