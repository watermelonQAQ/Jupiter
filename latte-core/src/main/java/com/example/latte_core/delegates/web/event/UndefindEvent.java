package com.example.latte_core.delegates.web.event;

import com.example.latte_core.util.log.LatteLogger;

import java.util.logging.Logger;

/**
 * 作者：贪欢
 * 时间：2019/6/27
 * 描述：
 */
public class UndefindEvent extends Event {
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefindEvent",params);
        return null;
    }
}
