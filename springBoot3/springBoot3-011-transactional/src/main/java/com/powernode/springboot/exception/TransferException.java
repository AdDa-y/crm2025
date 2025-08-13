package com.powernode.springboot.exception;

/**
 * ClassName:TransferException   自定义的转账异常
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1122:14
 * version:1.0
 */

public class TransferException  extends  RuntimeException{

    public TransferException() {
    }

    public TransferException(String message) {
        super(message);
    }
}
