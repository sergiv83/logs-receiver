package com.sergiv83;

import ch.qos.logback.classic.spi.LoggingEventVO;
import ch.qos.logback.core.AppenderBase;

public class MyAppender extends AppenderBase<LoggingEventVO> {
    @Override
    protected void append(LoggingEventVO loggingEventVO) {
        System.out.println(loggingEventVO.getMdc());
    }
}
