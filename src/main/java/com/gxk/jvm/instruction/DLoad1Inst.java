package com.gxk.jvm.instruction;

import com.gxk.jvm.rtda.Frame;

public class DLoad1Inst implements Instruction {

  @Override
  public void execute(Frame frame) {
    double tmp = frame.getDouble(1);
    frame.pushDouble(tmp);
  }
}
