package com.github.fppt.jedismock.operations.stream;

import com.github.fppt.jedismock.datastructures.Slice;
import com.github.fppt.jedismock.operations.AbstractRedisOperation;
import com.github.fppt.jedismock.operations.RedisCommand;
import com.github.fppt.jedismock.server.Response;
import com.github.fppt.jedismock.storage.RedisBase;

import java.util.List;

@RedisCommand("xgroup")
class XGroup extends AbstractRedisOperation {

    XGroup(RedisBase base, List<Slice> params) {
        super(base, params);
    }

    @Override
    protected Slice response() {

        
        return Response.bulkString(Slice.create("OK"));
    }
}
