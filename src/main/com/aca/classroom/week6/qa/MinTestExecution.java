package com.aca.classroom.week6.qa;

public class MinTestExecution extends TestExecution{


    public MinTestExecution() {
        super("Min test");
    }

    @Override
    public Result execute() {
        if (Math.min(9,99)==9){
            return Result.PASS;
        }else{
            System.out.checkError();
            return Result.FAIL;
        }
    }
}
