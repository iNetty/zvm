package com.zvm.classfile.constantpool;

import com.zvm.basestruct.U1;
import com.zvm.basestruct.U2;

public class ConstantFieldref extends ConstantBase {
    public U1 tag;
    public U2 classIndex;
    public U2 nameAndTypeIndex;
}
