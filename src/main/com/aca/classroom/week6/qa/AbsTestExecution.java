package com.aca.classroom.week6.qa;

public class AbsTestExecution extends TestExecution{

    public AbsTestExecution(String description) {
        super("ABS test");
    }

    @Override
    public Result execute() {
        if (Math.abs(1000)==233){
            return Result.PASS;
        }else {
            return  Result.FAIL;
        }

    }
}
