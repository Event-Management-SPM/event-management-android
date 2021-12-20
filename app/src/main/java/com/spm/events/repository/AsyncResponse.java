package com.spm.events.repository;

import java.util.Map;

public interface AsyncResponse {
    void resultHandler(Map<String, Object> result, int resultCode);

    void resultHandler(String msg, int resultCode);
}